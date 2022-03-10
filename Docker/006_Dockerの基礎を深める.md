# Docker の基礎を深める

## 記事

-   https://zenn.dev/koduki/articles/b4cb0551523919
-   https://iga-ninja.hatenablog.com/entry/2018/06/28/091412

### 押さえておきたいこと

-   Dockerfile・Docker Image・Docker Container の関係性
-   IaC (Infrastructure as a Code)
    -   コードを使用してインフラストラクチャの管理やプロビジョニングを行う
    -   同じような環境を複製しやすい。作成 ⇒ 削除 ⇒ 再作成がしやすい
    -   手作業によるエラーや工数を削減する
    -   Chef,Puppet,Terraform というツールがあり、よく「構成管理ツール」ともいわれる。
    -   AWS では、`AWS CloudFormation`という機能がそれにあたる
    -   参考
        -   https://www.sbbit.jp/article/cont1/39402
        -   https://www.redhat.com/ja/topics/automation/what-is-infrastructure-as-code-iac
        -   https://udemy.benesse.co.jp/development/system/iac.html
        -   https://dev.classmethod.jp/articles/cloudformation-beginner01/ AWS CloudFormation について
-   コンテナオーケストレーション
    -   コンテナを効率よく運用・開発するための技術
    -   複数のコンテナを管理するための仕組み
        -   ネットワークやストレージの管理
        -   アプリケーションのリリース
        -   どのホストでコンテナを起動するか(スケーリングなど)
    -   参考
        -   https://www.slideshare.net/AmazonWebServicesJapan/20200422-aws-black-belt-online-seminar-amazon-elastic-container-service-amazon-ecs 10 ページ
        -   https://xtech.nikkei.com/atcl/nxt/keyword/18/00002/080500086/
        -   https://cybersecurity-jp.com/column/34930
-   CI/CD
    -   「Continuous Integration／Continuous Delivery」の略
        -   継続的インティグレーション／継続的デリバリー
        -   ソフトウェアの変更を常にテストし自動で本番環境にリリース可能な状態にしておく、ソフトウェア開発の手法
        -   品質の担保と早いリリースをすることに貢献
            -   ビルド ⇒ テスト ⇒ デプロイ　のサイクルをいかに回すか
        -   Jenkins も CI/CD のツールの一つである
    -   参考
        -   https://codezine.jp/article/detail/11083
        -   https://www.kagoya.jp/howto/it-glossary/develop/cicd/
        -   https://www.ashisuto.co.jp/enishi/service_quality/cicd.html
        -   https://anken-hyouban.com/blog/2020/10/27/ci-cd/#the_post_3D

#### 参考 devops の考え方

-   https://www.buildinsider.net/enterprise/devops/01
-   https://www.kagoya.jp/howto/it-glossary/develop/devops/
