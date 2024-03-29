# 追加資料

## must と should に関する理解

must が「かつ(AND)」、should が「または(OR)」について、
以下のように意味を考えることができます。

-   must は「**複数の条件に適合することが「強制」される**」
    -   転じて 「条件にすべて一致するドキュメント」
-   should は「**複数の条件に適合することが「推奨」される**」
    -   転じて「条件のどれかに一致するドキュメント」

以下に、そのように結論付けた理由を以下に記載します。

### ☆ 行為に関する助動詞の側面。must は「強制」、should は「推奨」

must は「しなければならない」という「強制」「命令」の意味があります。  
単語の意味と ES での使われ方より、  
**複数の条件に適合することが「強制」される**　と捉えることができます。

-   [英語の助動詞「must」の基礎イメージと覚え方・使い方 | Weblio 英会話コラム（英語での言い方・英語表現）](https://eikaiwa.weblio.jp/column/study/english_study_skills/uses-of-must#i-10)

それに対して、should は「したほうがいい」「すべきだ」という「推奨」「奨励」の意があります。  
**複数の条件に適合することが「推奨」される** と捉えることができます。  
⇒ 裏を返せば、「少し違ってもいい」「条件のどれかにはあっていればよい」とも捉えられます。

-   [英語の助動詞「should」の基礎イメージと覚え方・使い方 | Weblio 英会話コラム（英語での言い方・英語表現）](https://eikaiwa.weblio.jp/column/study/english_study_skills/uses-of-should)

また、要件整理の方法としてある、`MoSCoW分析`も考え方が近く、参考になるかと思います。

-   [日常生活でも使える要件整理術　〜MoSCoW 分析〜 | DevelopersIO](https://dev.classmethod.jp/articles/moscow/)

```
【M ：Must】 必ず満たさなければならない（必須）
これが欠けるとサービスの価値が失われるような必須の要件。
【S ：Should】 可能であれば、満たすことが推奨される（推奨）
提供するべき重要な要件。
ただし、時間やリソースが不足している場合などは、将来提供するときまで延期してもよい。（延期は短期間を推奨）
この要件が欠けてもサービスには、価値がある。
```

### ☆ 推量に関する助動詞の側面。must は「ちがいない」、should は「はずだ」

must も should もそれぞれ推量の意味を持つが、その強さは異なります。  
must は確度が高い「違いない」という意味、  
should は話者の希望的観測を含んだ「はずだ」という意味です。

少し強引なこじつけにはなりますが、以下のようにも捉えられます。

must は「複数条件を満たしているに違いない」  
⇒ ドキュメントが**複数条件を満たしていることが確定**くらいな言い方  
should は「複数条件を満たしているはずだ」  
⇒ ドキュメントが**複数条件を満たしているとは限らない**ような言い方

-   [【完全版】「should」の 2 つの意味と使い方 - WURK［ワーク］](https://eigobu.jp/magazine/should)

```
That must be true.（それは本当に違いない）
That will be true.（それは本当だろう）
That should be true.（それは本当のはずだ）
```

---

## bool クエリの用法

「bool クエリは複数のクエリを組み合わせるもの。戻り値が boolean」という意味で考えるとわかりやすいです。  
複数のクエリ(条件)を組み合わせた結果として、true になるドキュメントのみが抽出されます。

-   [Elasticsearch の bool query を利用して AND OR NOT を書いてみる - Qiita](https://qiita.com/vanhuyz/items/04a6871ae5f53ba5a97f)
    -   「Bool クエリは複数のクエリを組み合わせる（つまり AND、OR、NOT で結合）のに使います」という内容がわかりやすい。
        -   SQL で書き換えているところなどを併せて確認してみてください。

---

## bulkAPI は id を指定せずに実行できる

-   [【elasticsearch】コマンド一つで大量データを index に追加する - Qiita](https://qiita.com/dai-maru/items/4b5664c1e2ba33ee831a)
-   [【elasticsearch】id を指定せずに、bulk-insert - Qiita](https://qiita.com/4cteru/items/074d8dc956103c36b7fa#id%E6%8C%87%E5%AE%9A%E3%81%AA%E3%81%97bulk-insert%E3%81%8C%E3%82%8F%E3%81%8B%E3%82%89%E3%81%AA%E3%81%8B%E3%81%A3%E3%81%9F%E3%82%89)

```bash
POST /members/_bulk
{"index":{}}
{"name": "登戸 三郎","age": 31,"prefecture": "神奈川","selfpr": "テスト　ベテラン"}
{"index":{}}
{"name": "浦和 一郎","age": 29,"prefecture": "埼玉県","selfpr": "開発経験　1年以上"}
{"index":{}}
{"name": "浦和 二郎","age": 30,"prefecture": "埼玉県","selfpr": "設計経験　1年以上"}
{"index":{}}
{"name": "浦和 三郎","age": 31,"prefecture": "埼玉県","selfpr": "テスト経験　1年以上"}
{"index":{}}
{"name": "八王子 一郎","age": 29,"prefecture": "東京都","selfpr": "開発　駆け出し"}
{"index":{}}
{"name": "八王子 二郎","age": 30,"prefecture": "東京都","selfpr": "設計　駆け出し"}
{"index":{}}
{"name": "八王子 三郎","age": 31,"prefecture": "東京都","selfpr": "テスト　駆け出し"}
```

上記のドキュメントをインデックスした結果は、以下を参照ください。  
id にランダム文字列が入っています。  
https://github.com/NegishiYuya/workshop/blob/master/elasticsearch/bulk_index_without_id_result.json

---

## エラー発生時の対応方法

API のレスポンスにステータスコードとメッセージが表示されるため、  
それをもとに対応をします。以下は一例。

参考

-   [先輩と覚える HTTP ステータスコード](https://gist.github.com/rosylilly/3401612)
-   [HTTP レスポンスステータスコード - HTTP | MDN](https://developer.mozilla.org/ja/docs/Web/HTTP/Status)

### 指定していないインデックスを指定して検索

リクエスト

```bash
GET /hoge/_search
```

レスポンス

-   `error.root_cause.type`や`error.root_cause.reason`に  
    「`hoge`というインデックスがないこと」が表現されている。
-   ステータスコードとして`404`が返却されている

```
{
  "error" : {
    "root_cause" : [
      {
        "type" : "index_not_found_exception",
        "reason" : "no such index [hoge]",
        "resource.type" : "index_or_alias",
        "resource.id" : "hoge",
        "index_uuid" : "_na_",
        "index" : "hoge"
      }
    ],
    "type" : "index_not_found_exception",
    "reason" : "no such index [hoge]",
    "resource.type" : "index_or_alias",
    "resource.id" : "hoge",
    "index_uuid" : "_na_",
    "index" : "hoge"
  },
  "status" : 404
}
```

対応

-   存在するインデックスを指定する

### HTTP メソッドの違反

リクエスト

```bash
PUT /hoge/_search
```

レスポンス

-   `error`に「誤った HTTP メソッドで API がコールされていること」が表現されている。
-   ステータスコードとして`405`が返却されている

```
{
  "error" : "Incorrect HTTP method for uri [/members/_search?pretty=true] and method [PUT], allowed: [POST, GET]",
  "status" : 405
}
```

### 形式の不備(抽出対象の欠損)

リクエスト

```bash
GET /members/_search
{
    "query": {
        "match": {
        }
    }
}
```

レスポンス

-   `error`に「エラーの発生個所が 4 行目 9 文字目が原因(`"line" : 4と"col" : 9`からわかる)」が表現されている。
-   ステータスコードとして`400`が返却されている

```bash
{
  "error" : {
    "root_cause" : [
      {
        "type" : "parsing_exception",
        "reason" : "No text specified for text query",
        "line" : 4,
        "col" : 9
      }
    ],
    "type" : "parsing_exception",
    "reason" : "No text specified for text query",
    "line" : 4,
    "col" : 9
  },
  "status" : 400
}
```

### 形式の不備(抽出の演算子の欠損)

リクエスト

```bash
GET /members/_search
{
    "query": {
            "name": "八王子"
        }
    }
}
```

レスポンス

-   `error`に「エラーの発生個所が 3 行目 21 文字目が原因(`"line" : 3と"col" :21`からわかる)」が表現されている。
-   ステータスコードとして`400`が返却されている

```bash
{
  "error" : {
    "root_cause" : [
      {
        "type" : "parsing_exception",
        "reason" : "[name] query malformed, no start_object after query name",
        "line" : 3,
        "col" : 21
      }
    ],
    "type" : "parsing_exception",
    "reason" : "[name] query malformed, no start_object after query name",
    "line" : 3,
    "col" : 21
  },
  "status" : 400
}
```

### 形式の不備(括弧の不備)

リクエスト  
※Kibana 上だとそもそも構文エラーで実行できないため、curl で実行

```bash
curl -X GET 'localhost:9200/members/_search?pretty'  -H "Content-Type: application/json" -d '
{
    "query": {
        "range": {
            "age": {
                "gt": 30
            }
        }
    }
'
```

レスポンス

-   `error`に「エラーの発生個所が 10 行目 1 文字目が原因(`line: 10, column: 1`からわかる)、`Unexpected end-of-input`から json の終端の表現に不備がある」が表現されている。
-   ステータスコードとして`400`が返却されている

```bash
{
  "error" : {
    "root_cause" : [
      {
        "type" : "json_e_o_f_exception",
        "reason" : "Unexpected end-of-input: expected close marker for Object (start marker at [Source: (org.elasticsearch.common.io.stream.ByteBufferStreamInput); line: 2, column: 1])\n at [Source: (org.elasticsearch.common.io.stream.ByteBufferStreamInput); line: 10, column: 1]"
      }
    ],
    "type" : "json_e_o_f_exception",
    "reason" : "Unexpected end-of-input: expected close marker for Object (start marker at [Source: (org.elasticsearch.common.io.stream.ByteBufferStreamInput); line: 2, column: 1])\n at [Source: (org.elasticsearch.common.io.stream.ByteBufferStreamInput); line: 10, column: 1]"
  },
  "status" : 400
}
```
