## 目次

-   前回までの復習
-   AWS Lambda

## 前回までの復習

---

### 問題 1

Route53 でドメインと AWS リソースの紐づけを定義するための、  
レコードはなんというか。

#### 解答

A レコード

---

### 問題 2

世界で展開する Web サービスにおいて、コンテンツの配信遅延を少なくしたい。  
有効とされる Route53 のルーティングポリシーはどれか。

#### 解答

レイテンシールーティング

---

### 問題 3

Route53 は何かを 4 台構成にしていることで高い可用性を実現している。
何を 4 台構成にしているでしょうか。

#### 解答

ネームサーバー  
※NS レコードに 4 つドメインがあることを確認

---

### 問題 4

Route53 を使ったルーティングの先に ALB を指定したい。  
Route53 のなんという機能を使えば実現できるか。

#### 解答

エイリアスレコード

---

### 問題 5

とある Web サービスでは画像を EBS に格納している。  
コスト・運用面での改善に有効とされる AWS の機能を答えて下さい。  
※画像へのアクセス方法の変更に伴う工数は考慮しなくてよい。

#### 解答

Amazon S3

※容量につき課金されることや伸縮性を有していることを確認

---

## Amazon Lambda

[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402) 動画内の項目 `Amazon Lambda`より

### Lambda の概要

-   サーバレスでプログラムを実行する環境を提供する AWS のサービスである

    -   サーバレス ⇒`Serverless`⇒ `server` + `less` 「サーバの管理・保守が不要」ということ。
        -   プログラムを動かすためには、サーバが必要。
            -   OS やプログラムの実行環境の用意が必要となる。また、その保守や監視も必要となる。
        -   これらの対応を AWS 側で行ってくれる
        -   開発者がサーバを意識する必要がないということ。

-   スケーリングやログ出力に関しても AWS が行ってくれる
-   コストは関数(プログラム)のリクエスト数による
    -   1 か月につき 100 万リクエストまでは無料
    -   参考 EC2 は稼働している時間によって課金
-   言語は`Java`、`Go`、`PowerShell`、`Node.js`、`C#`、`Python`、`Ruby`を使うことができる
    -   `Node.js`、`Python`、`Ruby`は AWS コンソール上でコーディングが可能
        -   Java でコーディングしたものを Lambda で動かす場合はあらかじめ zip や jar にしたものを AWS にアップロードする必要がある
-   他の AWS の機能から呼び出して使う
    -   呼び出し元の機能は`トリガー`と呼ばれる
        -   `APIGateway`、`S3`、`SNS`、`CloudWatchLogs`、`EventBridge`など
        -   スマートスピーカーの`Alexa`のバックエンド処理としても使う。トリガーに `Alexa Skills Kit`を指定することでできる
            -   トリガーになる部分は`Alexa`のコンソールで作る。それを AWS コンソール側で紐づける
-   関数の処理内で、他の AWS の機能にアクセスする場合は関数に他サービスへのアクセス権限(ロール)を付与する必要がある

### Lambda の使い方や事例

-   S3 にアップロードされたファイルを加工して、保存する
    -   [AWS 導入事例：株式会社スクウェア・エニックス | AWS](https://aws.amazon.com/jp/solutions/case-studies/square-enix/)
    -   [AWS 導入事例: The Seattle Times | AWS](https://aws.amazon.com/jp/solutions/case-studies/the-seattle-times/)
    -   [S3 にアップロードされた JPEG 画像を Lambda で WebP へ変換する - Qiita](https://qiita.com/oh-sky/items/1abec95e8388da97c6ba)
-   APIGateway を使って Lambda で作った関数を API として呼び出し
    -   [API Gateway と Lambda で API 作成のチュートリアル - Qiita](https://qiita.com/vankobe/items/ab5bc6487c7e07cb3aba)
    -   [AWS API Gateway と Lambda で DynamoDB 操作｜コラム｜クラウドソリューション｜サービス｜法人のお客さま｜ NTT 東日本](https://business.ntt-east.co.jp/content/cloudsolution/column-try-20.html)
-   Alexa のバックエンドに活用
    -   [スマートスピーカーの Amazon Echo で「Hello World」するには：CodeZine（コードジン）](https://codezine.jp/article/detail/11036)
    -   [Alexa に lambda 連携させて中野区のゴミの日を教える - Qiita](https://qiita.com/sasa_muku/items/eb0d74326a90f6617b3f)

### 資料

-   [サーバーレスとは？ 簡単な事例をまじえてわかりやすく解説！ | キュービストブログ](https://blog.qbist.co.jp/?p=2654)
    -   「サーバレス」とは何か
-   [AWS 初心者ｰ「Lambda」ってなにがスゴイんですか？｜ソニー](https://www.bit-drive.ne.jp/managed-cloud/column/column_14.html)
    -   「“実行したい処理”だけを開発すればいい！サーバレスのすごさ」の図を参照
-   [今度こそ理解する！俺式 Lambda 入門 | DevelopersIO](https://dev.classmethod.jp/articles/lambda-my-first-step/)

## 次回以降の内容

-   次回：AWS Lambda
-   それ以降：[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402)の内容
    -   Amazon Simple Notification Service （SNS）
    -   AWS Elastic Beanstalk
    -   Amazon CloudFront
    -   AWS CloudFormation
