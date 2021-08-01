## AWS で Docker を扱う

### AWS で Docker を扱うための技術

-   Amazon ECR(Amazon Elastic Container Registry)
    -   完全マネージド型の Docker コンテナレジストリ
        -   AWS 内で Docker イメージの管理をする箇所
            -   AWS 内にある「個人用 DockerHub」
-   Amazon ECS(Amazon Elastic Container Service)
    -   AWS で Docker コンテナを動かすための技術
    -   コンテナのオーケストレーションサービス
        -   コンテナの動かす基盤を選択可能である。 EC2 で動かす「EC2」、サーバレスの環境で動かす「Fargate」、AWS 外の環境(オンプレなど)で動かす「EXTERNAL」の 3 種類がある。
-   Amazon EKS(Amazon Elastic Kubernetes Service)
    -   コンテナのオーケストレーションサービス"Kubernetes"のフルマネージドサービス
    -   Amazon ECS は AWS 独自のオーケストレーションサービスである、Amazon EKS はオープンソースのソフトウェア"Kubernetes"を フルマネージド化したものである。
        -   Elastic 社が開発しているオープンソースの全文検索エンジンの`ElasticSearch`とそれをフルマネージドのサービス化した`ElasticSearchService`の関係性に近い。

---

「レジストリ」の意味合いは以下を参照されたい。

```
レジストリとは、登録、登記、登録所、登録簿などの意味を持つ英単語。ITの分野では、外部から情報の登録を受け付け、まとめて保管しておくシステムや機関のことを意味することが多い。
```

引用：[レジストリ（registry）とは - IT 用語辞典 e-Words](https://e-words.jp/w/%E3%83%AC%E3%82%B8%E3%82%B9%E3%83%88%E3%83%AA.html)

`register`が「登録する」という単語なので、それと関連付けて覚えると理解しやすい。

---

「オーケストレーション」の意味合いは以下を参照されたい。

```
オーケストレーションとは、コンピュータシステム、アプリケーション、およびサービスにおける、設定、管理、調整の自動化を意味します。オーケストレーションを活用すると、IT 部門は複雑なタスクやワークフローをより簡単に管理できるようになります。
```

引用：[オーケストレーションとは - 概要、ツール、方法 | Red Hat](https://www.redhat.com/ja/topics/automation/what-is-orchestration)

「オーケストラ」は「複数の楽器」から構成される楽団である。  
「オーケストラ」は「複数の楽器」 ⇒ 「オーケストレーション」は「複数のリソースの管理」と考えると意味が理解しやすい。

---

起動タイプ「EXTERNAL」は 2020/12 から選択できるようになった。
[【速報】オンプレでも ECS が動く Amazon ECS Anywhere が発表されました！#reinvent | DevelopersIO](https://dev.classmethod.jp/articles/ecs-anywhere/)

---

#### 本テーマにて扱わない内容

Docker と AWS の関連の概要部分を扱うため、  
以下の内容は本テーマから割愛する

-   EKS・Kubernetes について
-   ECS のサービス・タスク・クラスタの詳細について
-   起動タイプ Fargate・EXTERNAL について

---

### ECR の概要

-   AWS 上で Docker のイメージを管理することができる。
-   ECS のメニューバーからアクセスすることができる。
-   ECS でコンテナの定義を作成する際に、ECR に格納されているイメージを選択することができる。
-   AWSCLI を使って、ローカル端末でビルドした Docker イメージを ECR に PUSH する

### ECR の使用手順

-   事前準備 AWS CLI の設定

    -   ローカル端末に AWS CLI をインストールする。
        -   [AWS CLI のインストール、更新、アンインストール - AWS Command Line Interface](https://docs.aws.amazon.com/ja_jp/cli/latest/userguide/cli-chap-install.html)
    -   AWS CLI に IAM に紐づく認証情報を設定する
        -   [設定ファイルと認証情報ファイルの設定 - AWS Command Line Interface](https://docs.aws.amazon.com/ja_jp/cli/latest/userguide/cli-configure-files.html)

-   リポジトリ作成～イメージの PUSH 　参考：[【ECR】リポジトリの作成からイメージのプッシュまで - サーバーワークスエンジニアブログ](https://blog.serverworks.co.jp/tech/2020/01/23/ecr/)
    -   AWS コンソールでリポジトリを作成する
        -   1 種類のイメージにつき、1 リポジトリになる
            -   1 種類と記載しているのは、タグをつけることによってバージョン管理的なことができるためである。1 種類のイメージをタグで複数バージョン保有できるということ。
    -   作成したリポジトリにログインする
    -   イメージをローカル端末上でビルドする
    -   ビルドしたイメージを ECR で作成したリポジトリで扱えるように、タグをつける
    -   タグをつけたイメージを PUSH する

「作成したリポジトリにログインする」～「タグをつけたイメージを PUSH する」のコマンドは AWS コンソール上で確認することができる。  
ECR のリポジトリの画面内に「プッシュコマンドの表示」というボタンがあり、押下するとコマンドが表示される。  
動的に設定しないといけない値もすべて設定された状態でコマンドが作られているため、表示されたコマンドをそのまま打ち込むことでリポジトリへのログインからイメージの PUSH までができる。

---

### ECS の概要

Docker コンテナを AWS 上で動かす。  
必要なリソースは AWS 側でよしなに作成する。

-   クラスター…コンテナを動かすための EC2 の集合体。
    -   「クラスター」とは「房」「集団」「群れ」を表す。参考：[クラスター | IT 用語辞典 | 大塚商会](https://www.otsuka-shokai.co.jp/words/cluster.html)
-   タスク
    -   起動するコンテナの設定
        -   複数指定もできる。docker-compose.yml に記載する内容とほぼ同等の内容の設定もできる。
-   サービス
    -   タスクの起動数やロードバランサーとの紐づけを指定できる。

参考：[Amazon EC2 Container Service(ECS)のデータモデルについて整理した | DevelopersIO](https://dev.classmethod.jp/articles/amazon-ecs-datamodel/)

### ハンズオン ECR に PUSH したイメージをコンテナとして動かす

#### 前提

あらかじめ ECR に`workshop0802_00`というリポジトリを作成して、イメージを PUSH 済。  
ビルド前の Dockerfile は以下を参照されたい。  
https://github.com/NegishiYuya/workshop/blob/master/Docker/ecsSample/Dockerfile

#### 手順

-   タスク定義を作る
    -   別タブで ECR のリポジトリの画面を開く
    -   「タスク定義」を開く
    -   「新しいタスク定義の作成」を押下
    -   「起動タイプの互換性の選択」で「EC2」を選択
    -   次の画面で以下を入力
        -   `タスク定義名` : `workshop0802`
        -   `タスクロール` : `ecsTaskExectionRole`
        -   `タスク実行ロール` : `ecsTaskExectionRole`
        -   `コンテナの定義`(`「コンテナの追加」`を押下)
            -   `コンテナ名` : `workshop0802`
            -   `イメージ` : ECR のリポジトリ`workshop0802_00 `の詳細画面に表示されるイメージの URI を入力
            -   `メモリ制限 (MiB)` : `128`
            -   `ポートマッピング` : `8080:80`
        -   `「作成」`を押下
-   クラスターを作る
    -   「クラスター」を開く
    -   「クラスターの作成」を押下
    -   「EC2 Linux + ネットワーキング」を選択し、「次のステップ」を押下
    -   以下を入力
        -   `クラスター名` : `workshop0802`
        -   `EC2 インスタンスタイプ` : `t3.micro`
        -   `セキュリティグループのインバウンドルール`の`ポート範囲` : `8080`
    -   `作成`を押下
        -   進捗が画面に表示される。下のほうに複数のリソースの作成状況が表示されていることを確認されたい。
    -   作成後、`クラスターの表示`を押下する
-   タスクを実行する。(クラスターの上でタスク定義で記載したコンテナを動かせるようにする)
    -   `タスク`タブを押下する
    -   `新しいタスクの実行`を押下する
    -   以下を入力
        -   `起動タイプ` : `EC2`
        -   `タスク定義` : `workshop0802`
    -   `タスクの実行`を押下する
-   コンテナ作成後、コンテナによって起動した nginx にアクセスする
    -   `タスク`タブ内に表示されている表の`コンテナインスタンス`列に表示されているリンクを押下する
        -   列幅が狭く見えづらいが、左から 3 列目の項目
    -   画面内に表示される`パブリックDNS`をコピーする
    -   以下の URL にアクセスする
        -   http://{パブリック DNS}:8080/
    -   画面内に`Hello world From workShop!!`と表示されることを確認する

参考：[初心者でも試せる！Docker を ECR に push して ECS 上で動かしてみた - Qiita](https://qiita.com/satoken/items/da8b65b349cf282cb5bb)
