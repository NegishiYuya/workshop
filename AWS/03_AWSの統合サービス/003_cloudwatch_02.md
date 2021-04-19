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
       -  アラーム状態の通知先は`Default_CloudWatch_Alarms_Topic`を選択すること
       -  参考：[メールを送信する CPU 使用率アラームの作成 - Amazon CloudWatch](https://docs.aws.amazon.com/ja_jp/AmazonCloudWatch/latest/monitoring/US_AlarmAtThresholdEC2.html) 
       -  参考：[CloudWatchによる監視設定～SNS連携による通知設定～ | AWSやシステム・アプリ開発の最新情報｜クロスパワーブログ](https://xp-cloud.jp/blog/2017/11/16/1990/)
-   ダッシュボードの作成
    -   RDS の接続数を数値とグラフで可視化する
       - 参考：[CloudWatch ダッシュボードの作成 - Amazon CloudWatch](https://docs.aws.amazon.com/ja_jp/AmazonCloudWatch/latest/monitoring/create_dashboard.html)
       - 参考：[CloudWatch ダッシュボードにグラフを追加または削除する - Amazon CloudWatch](https://docs.aws.amazon.com/ja_jp/AmazonCloudWatch/latest/monitoring/add_remove_graph_dashboard.html)   
-   CloudWatchLogs を使ったログ管理
    -   CloudWatchLogsInsightsを使って、WP を動かすための apache のログから 404 の件数を抽出する
       -   ※EC2からCloudWatchLogsへの連携部分は設定済です。
       -   参考：[CloudWatch Logs Insights でApacheのアクセスログを確認する | DevelopersIO](https://dev.classmethod.jp/articles/cwinsights-apache/)

### 資料

-   CloudWatch Logs 関連
    -   [CloudWatch Logs で AmazonLinux 上の Apache エラーログを監視する | DevelopersIO](https://dev.classmethod.jp/articles/cloudwatch-logs-apache/)
    -   [AmazonLinux2 のシスログを CloudWatch Logs に転送させてみた | DevelopersIO](https://dev.classmethod.jp/articles/awslogs-amazonlinux2/)
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
