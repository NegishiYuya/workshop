## Docker イメージとコンテナ　復習問題

---

### 問題 1

`docker run`コマンドは 3 つのコマンドの複合コマンドである。  
3 つのコマンドとその意味を答えてください。

#### 解答

-   イメージの PULL `docker pull`
-   コンテナの作成 `docker create`
-   コンテナの起動 `docker start`

---

### 問題 2

以下のコマンドを実行することによって発生するエラーと回避策を答えてください。

```
docker run --name test-nginx1 -d -p 8080:80 nginx
docker run --name test-nginx2 -d -p 8080:80 nginx
```

#### 解答

test-nginx1 と test-nginx2 でホスト側で受け付けるポートが競合する。  
test-nginx1 と test-nginx2 で、ホスト側のポート番号をかぶらないように設定する。

---

### 問題 3

以下のコマンドがしていることを答えてください。

```
docker start test-mysql
```

#### 解答

test-mysql というコンテナを起動する

---

### 問題 4

起動中のコンテナの一覧を表示するコマンドを答えてください。

#### 解答

```
docker ps
```

もしくは

```
docker container ls
```

---

### 問題 5

Dockerfile を使ってイメージをビルドすることのメリットを答えてください。

#### 解答

-   イメージの配布がしやすい
-   イメージ作成の過程・手順をファイルとして残すことができる

---

### 問題 6

以下の Dockerfile をビルドした際に、発生するエラーと回避策を答えてください。

```
FROM centos

RUN yum install java
```

#### 解答

2 行目の java を yum 経由でインストールするときに対話式のコマンドに
回答できないため、エラーになる。
回避策は yum install のオプション -y を付与することである。
