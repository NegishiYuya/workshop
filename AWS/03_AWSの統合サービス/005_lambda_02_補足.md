# 追加資料

## ALB + Lambda の構成

ターゲットグループに Lambda を登録することができる。

-   [ALB のバックエンドに Lambda を選択してみた！ #reinvent | DevelopersIO](https://dev.classmethod.jp/articles/alb-support-for-lambda-tutorial/)
-   [ALB のバックエンドに Lambda を利用する | ゴミ箱](https://53ningen.com/alb-lambda/)
-   [Application Load Balancer のターゲットに Lambda Function を使用して高度なリダイレクトを行う方法 | DevelopersIO](https://dev.classmethod.jp/articles/how_to_advanced_redirect_with_alb_backend_lambda/)

### 注意事項

-   この構成をとった際に、ALB のヘルスチェックを行うと都度 Lambda が実行される
-   Lambda から ALB に返却するレスポンスの形式に考慮が必要

### 有効とされる使い方

-   パスごとにバックエンドを EC2 もしくは ECS・Lambda と分けたい場合
-   通常時は EC2 もしくは ECS 利用、メンテナンスモード時は Lambda と分けたい場合
-   リダイレクト

## トリガーの「無効化」の仕様変更

トリガーの「無効化」がコンソールを使ってできなくなった。画面上の「無効化」ボタンが非活性になった。
トリガーを無効にしたい場合、トリガーを削除する必要がある。復活させる場合は、再度設定しなおせばよい。

以下、AWS コンソールに表示される説明文言。

```
Lambda コンソールは、AWS IoT、Alexa Smart Home、Cognito Sync、EventBridge (CloudWatch Events)、および SNS トリガーの無効化をサポートしなくなりました。以降のアクションを停止するには、これらのトリガーを削除します。
```

-   上記の対象でない、`CloudWatchLogs`や`S3`についても、「無効化」ボタンが押せなくなっていた
-   CLI では有効化・無効化を切り替えることができない

よって、トリガーを無効化したい場合はコンソールでトリガーを削除する必要があると思われる。
