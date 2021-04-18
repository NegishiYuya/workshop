## 目次

-   前回までの復習
-   Amazon CloudWatch

## 前回までの復習

---

### 問題 1

ALB の機能にあるパスを条件に接続するターゲットを変更するルーティングの方式をなんというか。

#### 解答

パスベースルーティング

---

### 問題 2

旧来、ELB と称されていた機能を特定の理由があって使いたい。なんという機能を使えばよいか。

#### 解答

CLB

---

### 問題 3

「機能毎に細かくサービスを分割して開発や運用を行うアーキテクチャ」をなんというか。

#### 解答

マイクロサービスアーキテクチャ

---

### 問題 4

RDS のパラメータグループを変更したが、変更が反映されていないことが分かった。
原因として疑うべきことは何か。

#### 解答

パラメータグループの適用タイプ。　　
「静的」の場合は再起動が必要。

---

### 問題 5

RDS の長期利用を考えたときに、検討すべき購入方法は「何か」を答えてください。

#### 解答

リザーブドインスタンスでの購入。

---

## Amazon CloudWatch

[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402) 動画内の項目 `Amazon CloudWatch`より

### 資料

-   [AWS 上のサービスを監視する「Amazon CloudWatch」の実力は？｜コラム｜クラウドソリューション｜サービス｜法人のお客さま｜ NTT 東日本](https://business.ntt-east.co.jp/content/cloudsolution/column-42.html)
-   [AWS 初心者-監視ツール「CloudWatch」でできるもの｜ソニー](https://www.bit-drive.ne.jp/managed-cloud/column/column_06.html)
-   [Amazon CloudWatch（リソースとアプリケーションの監視と管理）| AWS](https://aws.amazon.com/jp/cloudwatch/)
-   [お客様 - Amazon CloudWatch | AWS](https://aws.amazon.com/jp/cloudwatch/customers/)
-   [CloudWatch と正面から向き合ってみる - Qiita](https://qiita.com/sot528/items/ae6534114d349d20798d)

### 上記の資料を読みながら押さえておきたい特徴・キーワード

-   監視はなぜ必要か
-   AWS リソースを一元的に監視できる　といううまみ
-   AWS の機能間の連携を生かして、日ごろの運用・開発の効率を向上できるということ
    -   アラームで特定のメトリクスの閾値を超えた場合に SNS と連動させる(メールの送信や lambda の関数実行など)
    -   複数の ECS のログなどを一元管理する
    -   AutoScalling と連動させて、負荷に応じたスケーリングをさせる
    -   特定のサービスでエラーが発生した場合に SNS と連動させる
-   CloudWatch には 5 つの機能があるということ
    -   Amazon CloudWatch
    -   Amazon CloudWatch Dashboard（ダッシュボード）
    -   Amazon CloudWatch Alarm（アラーム）
    -   Amazon CloudWatch Logs（ログ）
    -   Amazon CloudWatch Events （イベント）/ Amazon EventBridge
-   リソースの監視自体は各リソースの詳細画面からも行うことができる
-   ダッシュボードを使って必要な情報を可視化・すぐにアクセスできるようにすべし

## 次回以降の内容

-   次回：Amazon CloudWatch の実践
-   それ以降：[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402)の内容
    -   Amazon Route 53
    -   AWS Lambda
    -   AWS Elastic Beanstalk
    -   Amazon Simple Notification Service （SNS）
    -   Amazon CloudWatch
    -   Amazon CloudFront
    -   AWS CloudFormation
