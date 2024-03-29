## Fargate を触ってみる

### タスク定義の作成

-   別タブで ECR のリポジトリの画面を開く
-   「タスク定義」を開く
-   「新しいタスク定義の作成」を押下
-   「起動タイプの互換性の選択」で「Fargate」を選択
-   次の画面で以下を入力
    -   `タスク定義名` : 任意
    -   `タスクロール` : `ecsTaskExectionRole`
    -   `タスク実行ロール` : `ecsTaskExectionRole`
    -   `タスクメモリ` : 0.5
    -   `タスクCPU` : 0.25
    -   `コンテナの定義`(`「コンテナの追加」`を押下)
        -   `コンテナ名` : 任意
        -   `イメージ` : ECR のリポジトリ`testfg `の詳細画面に表示されるイメージの URI を入力
        -   `ポートマッピング` : `8080`
    -   `「作成」`を押下

### クラスターの作成

-   「クラスター」を開く
-   「クラスターの作成」を押下
-   「ネットワーキングのみ」を選択し、「次のステップ」を押下
-   以下を入力
    -   `クラスター名` : 任意
-   `作成`を押下
-   作成後、`クラスターの表示`を押下する

### タスクの実行

-   `タスク`タブを押下する
-   `新しいタスクの実行`を押下する
-   以下を入力
    -   `起動タイプ` : `FARGATE`
    -   `タスク定義` : 先ほど作成したもの
    -   `クラスターVPC` : もとから入っているもの
    -   `サブネット` : 1a,1c,1d いずれか選択
    -   `パブリックIPの自動割り当て` : `ENABLED`
        -   パブリックサブネットを指定している場合は、`ENABLED`を指定していないとインターネット接続ができず、ECR からイメージが pull できなくなるため注意
-   `タスクの実行`を押下する
-   コンテナ作成後、コンテナによって起動した nginx にアクセスする
    -   `タスク`タブ内に表示されている表の`タスク`列に表示されているリンクを押下する
        -   EC2 起動タイプのときに表示されていた`コンテナインスタンス`の箇所が`-`で表示されていることに注目
    -   画面内に表示される`パブリックIP`をコピーする
    -   以下の URL にアクセスする
        -   http://{パブリック IP}:8080/
    -   画面内に`Hello world From workShop!!`と表示されることを確認する

### 確認しておきたいこと

-   クラスターのタブの中に表示される`ECSインスタンス`の中に何も表示されないこと
    -   Fargate の場合は EC2 ができないことを確認する
-   起動時に実行環境のスペックを詳細に決定していないこと
    -   EC2 起動タイプに比べて、設定項目が少ないこと(=管理すべきことが少ないということ)

### 参考資料

-   AWS におけるコンテナ利用について知識を深めたい

    -   [AWS-41_AWS_Summit_Online_2020.pdf](https://pages.awscloud.com/rs/112-TZM-766/images/AWS-41_AWS_Summit_Online_2020.pdf)

-   「Fargate とは何か」だったりメリットをしりたい
    -   [基礎から応用までじっくり学ぶECS Fargateを利用したコンテナ環境構築 #devio2020](https://www.youtube.com/watch?v=wnhgcJRsRd0) youtubeの動画
    -   [スタートアップのためのコンテナ入門 – AWS Fargate 編 | AWS Startup ブログ](https://aws.amazon.com/jp/blogs/startup/techblog-container-fargate-1/)
    -   [AWS Fargate とは？Amazon ECS との関係性やメリット・デメリットを解説｜コラム｜クラウドソリューション｜サービス｜法人のお客さま｜ NTT 東日本](https://business.ntt-east.co.jp/content/cloudsolution/column-171.html)

-   Fargate を触ってみたい
    -   [[初心者向け]言われるままに Fargate 初めて触ったので、忘れないための記録 | DevelopersIO](https://dev.classmethod.jp/articles/fargate-my-first-step/)
    -   [AWS Fargate の素晴らしさをチュートリアルで体験する | MISO](https://www.tdi.co.jp/miso/aws-fargate-tutorial)
