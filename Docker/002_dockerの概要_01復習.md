## Docker の概要　復習問題

---

### 問題 1

`docker run`コマンドは3つのコマンドの複合コマンドである。    
3つのコマンドとその意味を答えてください。 

---

### 問題 2

以下のコマンドを実行することによって発生するエラーと回避策を答えてください。  

```
docker run --name test-nginx1 -d -p 8080:80 nginx
docker run --name test-nginx2 -d -p 8080:80 nginx
```

---

### 問題 3

以下のコマンドがしていることを答えてください。  

```
docker start test-mysql
```


---

### 問題 4

起動中のコンテナの一覧を表示するコマンドを答えてください。

---

### 問題 5

Dockerfileを使ってイメージをビルドすることのメリットを答えてください。  

---

### 問題 6

以下のDockerfileをビルドした際に、発生するエラーと回避策を答えてください。  


```
FROM centos

RUN yum install java
```
