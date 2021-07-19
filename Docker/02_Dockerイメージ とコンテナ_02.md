## Docker イメージ とコンテナ(2)

### 再掲：Docker イメージ とコンテナ

Docker のイメージとコンテナの関係性について振り返る。
Docker のイメージは「ひな形」であり、コンテナは環境そのものである。
つまり、イメージから同様のコンテナをすぐに作ることができる。また、複製することができる。

### Dockerイメージの作成

Dockerイメージの作成は2種類ある。  
-   (1) Dockerコンテナに対して直接修正を施して、`docker commit`コマンドを実行する  
    参考：https://knowledge.sakura.ad.jp/14427/
-   (2) Dockerfileをビルドする
    参考：https://knowledge.sakura.ad.jp/15253/
 
(1) は一時的な修正を配布することなどに有効。 
だが、永続化できない・修正の経緯などがわからなくなるというデメリットを  
はらんでいるため、(2) のDockerfileを使ったイメージ作成のほうが、Dockerのメリットを享受しやすいといえるだろう。  

#### Dockerfileの記法

参考：
https://www.wakuwakubank.com/posts/270-docker-build-image/
