## Docker イメージ とコンテナ(1)

### 再掲：Docker イメージ とコンテナ

Docker のイメージとコンテナの関係性について振り返る。
Docker のイメージは「ひな形」であり、コンテナは環境そのものである。
つまり、イメージから同様のコンテナをすぐに作ることができる。また、複製することができる。

#### 資料

-   [Docker のイメージとコンテナの違い | CodeCampus](https://blog.codecamp.jp/programming-docker-image-container)
    「Docker のイメージとは」の項の 2 個目の画像までと、
    「Docker のコンテナとは（その一）」の最初数行が参考になる。
-   [Docker 入門（第二回）～ Docker セットアップ、コンテナ起動～ | さくらのナレッジ](https://knowledge.sakura.ad.jp/13795/)
    「Docker コンテナの基本操作」の図が参考になる。
    「さくらのナレッジ」の「Docker 入門」の連載は入門としてちょうどよいので、
    学習に有効である。

---

### DockerHub について

公開されているイメージを管理する Web サービスとして、`DockerHub`がある。

-   [Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)
    -   アクセスしてすぐ表示される画面の左上に表示される検索窓にキーワードを入れてイメージを検索できる
    -   アクセスしてすぐ表示される画面の右上に表示される`Explore`のリンクを押すとイメージの検索画面に遷移する
    -   管理されているイメージには`タグ`が付与されている。`タグ`はバージョンを管理するためなどに使う。
        -   参考：[Docker イメージの理解を目指すチュートリアル - Qiita](https://qiita.com/zembutsu/items/24558f9d0d254e33088f#2-hello-world-%E3%82%A4%E3%83%A1%E3%83%BC%E3%82%B8%E3%81%AE%E3%83%80%E3%82%A6%E3%83%B3%E3%83%AD%E3%83%BC%E3%83%89pull)

以下のようなイメージがある

-   ベース OS のみが入ったイメージ
    -   [Centos - Official Image | Docker Hub](https://hub.docker.com/_/centos)
    -   [Amazonlinux - Official Image | Docker Hub](https://hub.docker.com/_/amazonlinux)
    -   [Ubuntu - Official Image | Docker Hub](https://hub.docker.com/_/ubuntu)
    -   [Alpine - Official Image | Docker Hub](https://hub.docker.com/_/alpine)
        -   軽量な linux
-   ベース OS + ソフトウェアが入ったイメージ
    -   [Mysql - Official Image | Docker Hub](https://hub.docker.com/_/mysql)
    -   [Postgres - Official Image | Docker Hub](https://hub.docker.com/_/postgres)
    -   [Wordpress - Official Image | Docker Hub](https://hub.docker.com/_/wordpress)
    -   [Nginx - Official Image | Docker Hub](https://hub.docker.com/_/nginx)
    -   [Tomcat - Official Image | Docker Hub](https://hub.docker.com/_/tomcat)
-   ベース OS + 複数のソフトウェアが入ったイメージ
    -   自作イメージ

---

### DockerHub にある Docker イメージからコンテナを起動する

DockerHub にある、nginx のイメージを使い、`test-nginx`というコンテナを作成し、起動する。  
8080 番ポートで受け付ける。  
以下のコマンドを実行後、`http://localhost:8080/`に
アクセスすると nginx のサンプルページが表示される。

```
docker run --name test-nginx -d -p 8080:80 nginx
```

-   `docker run`は Docker イメージの作成からコンテナの起動までを行う。
    -   `--name`はコンテナ名を指定するオプション
    -   `-d`はバックグラウンドで実行するオプション
    -   `-p ホストのポート番号:コンテナのポート番号`はホスト(自端末)とコンテナのポート番号についてポートフォワードを行う。
        -   この例だと、ホスト側から 8080 番ポート(`http://localhost:8080/`)でアクセスすると コンテナ内の 80 番ポートに疎通し、nginx のサンプルページが表示されるということ。
            -   **1 つのホスト端末のポートに複数の定義が重なるとエラー。複数あると、どこにアクセスを流せばいいのかわからないということが起きる。**
    -   最後の`nginx`の箇所は DockerHub から pull するイメージ名が入る(コンテナの作成対象)

---

### Docker のコマンドの体系

```
docker 上位コマンド 副コマンド オプション 対象
```

-   上位コマンドは`container`,`image`,`volume`,`network`などの Docker の技術要素の大分類的なものになる。
    -   **省略することも可能。技術書や Web の記事だと省略可能なものはしばしば省略されている。**
-   副コマンドは
    -   上位コマンドが`container`の場合、`start`,`stop`,`create`などがある。
    -   上位コマンドが`image`の場合、`pull`,`rm`,`build`などがある。
    -   上位コマンドが`volume`の場合、`create`,`inspect`,`prune`などがある。
    -   上位コマンドが`network`の場合、`connect`,`disconnect`,`create`などがある。
-   オプションはそれぞれの副コマンドに即したものがある。
-   対象にはコンテナ名やイメージ名、ID などが入る。

#### 参考：localhost とは

[ローカルホスト (localhost)とは｜「分かりそう」で「分からない」でも「分かった」気になれる IT 用語辞典](https://wa3.i-3-i.info/word1102.html)より

```
ネットワークでつながっている自分方のコンピュータのことだよ
もしくは「自分自身」を意味するホスト名だよ
```

---

### ハンズオン　コンテナ操作

nginx コンテナを使ってコンテナのライフサイクルを回す。

-   Windows もしくは Mac の Docker のクライアントソフトを起動する。
-   以下の`docker run`コマンドを実行する。

    -   Dockerhub から`nginx`のイメージを PULL し、コンテナの起動まで行う。

    ```
    docker run --name workshop-nginx -d -p 8082:80 nginx
    ```

-   コマンド実行後の標準出力に DockerHub からのイメージの pull が出力されていることを確認する。
    ```
    $ docker run --name workshop-nginx -d -p 8082:80 nginx
    Unable to find image 'nginx:latest' locally
    latest: Pulling from library/nginx
    b4d181a07f80: Pulling fs layer
    66b1c490df3f: Pulling fs layer
    …
    6bbc76cbebeb: Pull complete
    32b766478bc2: Pull complete
    Digest: sha256:353c20f74d9b6aee359f30e8e4f69c3d7eaea2f610681c4a95849a2fd7c497f9
    Status: Downloaded newer image for nginx:latest
    81e46e0514bcfee41070d8f260f2fb5fa941f4a781a08b0bd8fc8b1f49b162c0
    ```
-   ブラウザで`http://localhost:8082/`にアクセスし、nginx のサンプルぺージの表示を確認する
-   以下の`docker ps`コマンドを実行する。
    -   起動中のコンテナを表示する
    ```
    docker ps
    ```
-   コマンドの結果として出力された表の`NAMES`が`workshop-nginx`の行の`CONTAINER ID `をエディタに控えておく
    ```
    CONTAINER ID   IMAGE     COMMAND                  CREATED              STATUS              PORTS                                   NAMES
    81e46e0514bc   nginx     "/docker-entrypoint.窶ｦ"   About a minute ago   Up About a minute   0.0.0.0:8082->80/tcp, :::8082->80/tcp   workshop-nginx
    ```
-   以下の`docker stop`コマンドを実行する。
    -   コンテナの停止
    ```
    docker stop {前段の手順で控えたID}
    ```
-   以下の`docker start`コマンドを実行する。
    -   コンテナの起動
        -   「今度は作成済みのコンテナがあるため、イメージの PULL やコンテナの作成はしない」ということ。
    ```
    docker start {前段の手順で控えた ID}
    ```
-   以下の`docker stop`コマンドを実行する。
    -   コンテナの停止
    ```
    docker stop {前段の手順で控えたID}
    ```
-   以下の`docker rm`コマンドを実行する。
    -   コンテナの破棄
    ```
    docker rm {前段の手順で控えたID}
    ```

---

### コンテナのライフサイクル

-   コンテナの作成 `docker create`
-   コンテナの起動 `docker start`
-   コンテナの停止 `docker stop`
-   コンテナの破棄 `docker rm`

---

### `docker run`コマンドの正体

1 つのコマンドで以下を実行している。

-   イメージの PULL `docker pull`
-   コンテナの作成 `docker create`
-   コンテナの起動 `docker start`

---

### ハンズオン　イメージの PULL について

-   Windows もしくは Mac の Docker のクライアントソフトを起動する。
-   以下の`docker run`コマンドを実行する。

    ```
    docker run --name workshop-nginx2 -d -p 8082:80 nginx
    ```

-   コマンド実行後の標準出力に **DockerHub からのイメージの pull が出力されていない**ことを確認する。

    -   すでにイメージが取得済みの場合は再取得をしないということ。

---

## 資料

-   書籍：[楽天ブックス: 仕組みと使い方がわかる Docker＆Kubernetes のきほんのきほん - 小笠原種高 - 9784839972745 : 本](https://books.rakuten.co.jp/rb/16580202/)
-   [Docker 入門（第一回）～ Docker とは何か、何が良いのか～ | さくらのナレッジ](https://knowledge.sakura.ad.jp/13265/)
-   [Docker イメージの理解とコンテナのライフサイクル](https://www.slideshare.net/zembutsu/docker-images-containers-and-lifecycle)
