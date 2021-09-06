# ElasticSearch を触ってみる

## お題

以下の項目を持つインデックス members へのデータ登録と検索処理

-   名前(name)
-   年齢(age)
-   都道府県(prefecture)
-   自己 PR(selfpr)

## 事前準備 ElasticSearch と Kibana の起動　

docker-compose で ElasticSearch と Kibana のコンテナを起動する

```bash
docker-compose up -d
```

Kibana のコンテナのログは以下のコマンドで出力できる

```bash
docker logs -f elasticsearch_kibana_1
```

以下のようにログが出力されると、Kibana が起動したことがわかる

```bash
{"type":"log","@timestamp":"2021-09-05T13:12:55+00:00","tags":["info","status"],"pid":1213,"message":"Kibana is now available (was degraded)"}
```

## インデックスの作成・ドキュメントをインデックスする

### インデックスの作成

-   インデックス members を作成する

```bash
PUT /members
```

### マッピングの作成

`マッピング`はインデックスの項目定義的なものである。  
RDB でいうところの`テーブル定義`に相当する。

-   インデックス members に対してマッピング(項目の定義的なもの)を作成する

```bash
PUT /members/_mapping
{
    "properties": {
        "name": {
            "type": "text"
        },
        "age": {
            "type": "long"
        },
        "prefecture":{
            "type": "text"
        },
        "selfpr" :{
            "type": "text"
        }
    }
}
```

### ドキュメントをインデックスする

`ドキュメント`は RDB でいうところの`レコード`に近い概念である。  
`インデックスする`は`登録する`という意味で考えてよい。

-   1 件インデックス(id 指定あり)

```bash
PUT /members/_doc/1
{
    "name": "登戸 一郎",
    "age": 29,
    "prefecture": "神奈川",
    "selfpr": "開発　ベテラン"
}
```

-   1 件インデックス(id 自動発番)

```bash
POST /members/_doc/
{
    "name": "登戸 二郎",
    "age": 30,
    "prefecture": "神奈川",
    "selfpr": "設計　ベテラン"
}
```

-   複数件を一括インデックス

```bash
POST /members/_bulk
{"index":{"_id":"2"}}
{"name": "登戸 三郎","age": 31,"prefecture": "神奈川","selfpr": "テスト　ベテラン"}
{"index":{"_id":"3"}}
{"name": "浦和 一郎","age": 29,"prefecture": "埼玉県","selfpr": "開発経験　1年以上"}
{"index":{"_id":"4"}}
{"name": "浦和 二郎","age": 30,"prefecture": "埼玉県","selfpr": "設計経験　1年以上"}
{"index":{"_id":"5"}}
{"name": "浦和 三郎","age": 31,"prefecture": "埼玉県","selfpr": "テスト経験　1年以上"}
{"index":{"_id":"6"}}
{"name": "八王子 一郎","age": 29,"prefecture": "東京都","selfpr": "開発　駆け出し"}
{"index":{"_id":"7"}}
{"name": "八王子 二郎","age": 30,"prefecture": "東京都","selfpr": "設計　駆け出し"}
{"index":{"_id":"8"}}
{"name": "八王子 三郎","age": 31,"prefecture": "東京都","selfpr": "テスト　駆け出し"}
```

※`index`から始まる行と投入する json の行がセットとなる。**投入する json は 1 行で書かないとエラー**になる。

## 検索

### 条件なし

```bash
GET /members/_search
```

### 指定した単語を含むドキュメントを検索

`match`を使う

-   `selfpr`に`開発`を含むドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "match": {
            "selfpr": "開発"
        }
    }
}
```

-   【問題】`name`に`八王子`を含むドキュメントを検索してください

```bash
GET /members/_search
{
    "query": {
        "match": {
            "name": "八王子"
        }
    }
}
```

### OR 条件で検索(同じ項目間)

-   `prefecture`に`埼玉県`か`東京都`を含むドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "match": {
            "prefecture": "埼玉県 東京都"
        }
    }
}
```

### 範囲検索

`range`を使う

-   `age`が 30 以下のドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "range": {
            "age": {
                "lte": 30
            }
        }
    }
}
```

-   【問題】`age`が 30 より大きいドキュメントを検索してください

```bash
GET /members/_search
{
    "query": {
        "range": {
            "age": {
                "gt": 30
            }
        }
    }
}
```

### 複合検索

`boolクエリ`を使うと複合条件を指定できる
「かつ(AND 条件)」は`must句`で表現。  
1 つ 1 つの条件を配列で表現する。

-   `selfpr`に「開発」かつ「ベテラン」を含むドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "must": [
                {
                    "match": { "selfpr": "開発" }
                },
                {
                    "match": { "selfpr": "ベテラン" }
                }
            ]
        }
    }
}
```

-   【問題】`prefecture`が「埼玉県」で、`selfpr`に「テスト」を含むドキュメントを検索してください

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "must": [
                {
                    "match": { "prefecture": "埼玉県" }
                },
                {
                    "match": { "selfpr": "テスト" }
                }
            ]
        }
    }
}
```

「または(OR 条件)」は`should句`で表現。  
1 つ 1 つの条件を配列で表現する。

-   `selfpr`に「開発」もしくは「ベテラン」を含むドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "should": [
                {
                    "match": { "selfpr": "開発" }
                },
                {
                    "match": { "selfpr": "ベテラン" }
                }
            ]
        }
    }
}
```

-   【問題】`name`に「八王子」を含む、または`age`が 30 以上 のドキュメントを検索してください

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "should": [
                {
                    "match": { "name": "八王子" }
                },
                {
                    "range": {
                        "age": {
                            "gte": 30
                        }
                    }
                }
            ]
        }
    }
}

```

「いずれも含まない」は`must_not句`で表現。  
1 つ 1 つの条件を配列で表現する。

-   `selfpr`に「開発」「ベテラン」いずれも含まないドキュメントを検索する

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "must_not": [
                {
                    "match": { "selfpr": "開発" }
                },
                {
                    "match": { "selfpr": "ベテラン" }
                }
            ]
        }
    }
}
```

-   【問題】`name`に「登戸」を含まない、`age`が 30 でないドキュメントを検索してください

```bash
{
    "query": {
        "bool": {
            "must_not": [
                {
                    "match": { "name": "登戸" }
                },
                {
                    "match": { "age": 30 }
                }
            ]
        }
    }
}
```

`must`,`should`,`must_not`句は`bool`クエリの中で併せて使うことができる。

-   `age`が 30 以上で`selfpr`に「駆け出し」を含まないドキュメントを検索

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "must": [
                {
                    "range": {
                        "age": {
                            "gte": 30
                        }
                    }
                }
            ],
            "must_not": [
                {
                    "match": { "selfpr": "駆け出し" }
                }
            ]
        }
    }
}
```

-   【問題】`selfpr`に「テスト」を含む、`name`に「浦和」を含まないドキュメントを検索してください

```bash
GET /members/_search
{
    "query": {
        "bool": {
            "must": [
                {
                    "match": { "selfpr": "テスト" }
                }
            ],
            "must_not": [
                {
                    "match": { "name": "浦和" }
                }
            ]
        }
    }
}
```

## 資料

-   [Elasticsearch マッピング. Elasticsearch Mapping —… | by Kunihiko Kido | Hello! Elasticsearch. | Medium](https://medium.com/hello-elasticsearch/elasticsearch-9a8743746467)
-   [はじめての Elasticsearch - Qiita](https://qiita.com/nskydiving/items/1c2dc4e0b9c98d164329)
-   以下の資料は ElastiSearch5.4 の資料のため、一部コマンドが異なるため注意
    -   [インデックスの作成 | Elasticsearch リファレンス [5.4] | Elastic](https://www.elastic.co/guide/jp/elasticsearch/reference/current/gs-create-index.html)
    -   [バッチ処理 | Elasticsearch リファレンス [5.4] | Elastic](https://www.elastic.co/guide/jp/elasticsearch/reference/current/gs-batch.html)
    -   [検索の実行 | Elasticsearch リファレンス [5.4] | Elastic](https://www.elastic.co/guide/jp/elasticsearch/reference/current/gs-executing-searches.html)
-   [Elasticsearch のクエリ概要 - Qiita](https://qiita.com/chenglin/items/16a27aec507d02c73ddc#2-range-query)
