# centOS(タグが"7")のイメージをベースイメージとしてイメージを作成する
FROM centos:7

# yumコマンドでJavaをインストールする
# -y オプションを聞かないと、途中の対話質問のところでイメージ作成が終わってしまうので注意！！
RUN yum install -y java

# ローカルにあるtomcatの圧縮ファイルをコンテナ内の/opt/に配置して解凍する
ADD files/apache-tomcat-9.0.6.tar.gz /opt/ 

# コンテナ起動時に以下のoptからrunまでのコマンドを実行する
CMD [ "/opt/apache-tomcat-9.0.6/bin/catalina.sh", "run" ]
