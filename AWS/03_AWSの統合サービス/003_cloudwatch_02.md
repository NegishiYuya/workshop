## 目次

-   前回までの復習
-   Amazon CloudWatch

## 前回までの復習

---

### 問題 1

AWS のリソースのモニタリングを行い、  
閾値を超えた場合に他の機能と連携し、特定の宛先にメールを送りたい、どの CloudWatch 関連の機能を使うべきか。

---

### 問題 2

指定されたスケジュールで AWS リソースの操作を行いたい、どの CloudWatch 関連の機能を使うべきか。

---

### 問題 3

CloudWatchLogs を使ったログの管理における運用上のメリットを答えてください。

---

## Amazon CloudWatch

[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402) 動画内の項目 `Amazon CloudWatch`より

### Amazon CloudWatch に関するハンズオン

#### お題

WordPress(EC2+RDS)環境に関するモニタリング

#### 扱いたい内容

-   アラームを使って、閾値を超えた時の動作の確認
    -   EC2 の CPU 利用率が 10%以上を超えた場合に、特定のメールアドレスにメールを送る
-   ダッシュボードの作成
    -   RDS の接続数を可視化する
-   CloudWatchLog を使ったログ管理
    -   WP を動かすための apache のログから 404 の件数を抽出する

### 資料

-   CloudWatch Logs 関連
    -   [CloudWatch Logs で AmazonLinux 上の Apache エラーログを監視する | DevelopersIO](https://dev.classmethod.jp/articles/cloudwatch-logs-apache/)
    -   [AmazonLinux2 のシスログを CloudWatch Logs に転送させてみた | DevelopersIO](https://dev.classmethod.jp/articles/awslogs-amazonlinux2/)
    -   [CloudWatch Logs Insights で Apache のアクセスログを確認する | DevelopersIO](https://dev.classmethod.jp/articles/cwinsights-apache/)
-   WorePress の環境の構築
    -   [Amazon RDS で WordPress をデプロイする - アマゾン ウェブ サービス](https://aws.amazon.com/jp/getting-started/hands-on/deploy-wordpress-with-amazon-rds/)

## 次回以降の内容

-   次回：Amazon Route 53
-   それ以降：[AWS Cloud Practitioner Essentials (Second Edition) (Japanese): M3 – AWS の統合サービス | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=34402)の内容
    -   AWS Lambda
    -   AWS Elastic Beanstalk
    -   Amazon Simple Notification Service （SNS）
    -   Amazon CloudFront
    -   AWS CloudFormation
