# 構築手順

※設定について記載がないところは任意でよい  
※今後はIntelliJの最新バージョンを使い、講義を進めます(他バージョンと並行利用可)

## IntelliJ最新バージョンのセットアップ

1. IntelliJの最新バージョンをダウンロードする  
    * ダウンロード元：https://www.jetbrains.com/ja-jp/idea/download/#section=windows  `Community Edition`の`.exe`を選択
2. IntelliJをインストールする
3. IntelliJの起動時に表示されるメニューから`plugin`を選択し、`「Japanese Language Pack / 日本語言語パック」`をインストールする  

## SpringInintilizerから必要なファイルを一式ダウンロード

1. 以下URLにアクセスする
    ```
    https://start.spring.io/#!type=gradle-project&language=kotlin&platformVersion=2.7.7-SNAPSHOT&packaging=jar&jvmVersion=11&groupId=com.example&artifactId=springworkshop&name=springworkshop&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.springworkshop&dependencies=devtools,lombok,configuration-processor,web,thymeleaf
    ```

2. 遷移先のページで`GENERATE`を押下し、zipをダウンロードする

## InteliJでSpringBootプロジェクトの取り込み

1. 前段の手順でダウンロードしたzipを解凍する
2. IntelliJの起動時に表示されるメニューからプロジェクトの取り込みを行う
    * zipの解凍後のフォルダをインポートする
3. gradleによるビルドが自動で始まるため、画面下部のコンソールにビルド成功の旨が出力されることを待つ
4. 画面右側の`ツールウインドウ`の`gradle`の以下を選択し、Webアプリケーションを起動する
    * `springworkshop` > `Tasks` >  `application` > `bootRun`

    ログに以下のような文言が表示されれば起動完了。  
    起動後は停止をしておくこと。
    ```
    2022-12-05 00:56:36.402  INFO 16816 --- [  restartedMain] c.e.s.SpringworkshopApplicationKt        : Started SpringworkshopApplicationKt in 2.217 seconds (JVM running for 2.796)
    ```

以上
