## AWS Well-Architected Framework

[AWS Cloud Practitioner Essentials (Japanese) (日本語字幕版) | AWS トレーニングと認定](https://www.aws.training/Details/eLearning?id=66479) モジュール 10 　「AWS Well-Architected フレームワーク」より

### AWS Well-Architected Framework とは

-   AWS を使ったシステムの設計・運用のベストプラクティス集。
    -   考え方をまとめたものなので、設計や開発の具体的な内容をまとめたものではない。
-   ソリューションアーキテクトと AWS の顧客が長年の経験から作り上げたもの。10 年以上の蓄積がある。
    -   AWS の BlackBeltOnlineSeminar で講義をされていた方曰く「高速道路」のようなものであり、「PMBOK」に近いとのこと。
        -   すでに他の人がぶち当たった課題などがノウハウとして蓄積されている、ということ。
    -   AWS も機能追加や改善を行っている、また　顧客との事例も増えているため、Well-Architected Framework も改善され続けている。
-   システムをクラウド最適化することが目的。
    -   ベストプラクティスにすべて則っている必要はない。
        -   内容を理解の上、ビジネス視点で取り込む・取り込まないを判断することが大事。
        -   ベストプラクティスの内容を理解することは、システムの改善点を見つけ出す・考えるきっかけとなる。
    -   要件定義・設計・構築(開発)・運用　それぞれのフェーズでアーキテクチャの見直しに有用
        -   なるべく早めにレビューを行い手戻りを少なくすることが推奨される。
        -   運用開始後の定期的な KAIZEN (よりクラウド最適化されたシステム)に役立てることもできる。

### 活用方法

-   Well-Architected Framework ホワイトペーパー の利用
    -   ベストプラクティスが記載されたドキュメント
    -   [AWS Well-Architected フレームワークホワイトペーパー 日本語版の更新 | Amazon Web Services ブログ](https://aws.amazon.com/jp/blogs/news/aws-well-architected-whitepaper/)
-   AWS ソリューションアーキテクトや Well-Architected 認定パートナーによるレビューや個別相談の利用

    -   [【毎週火、木曜開催】AWS Well-Architected 個別技術相談会 | AWS](https://pages.awscloud.com/well-architected-consulting-jp.html)
    -   レビューは「監査」ではないということが重要
    -   Well-Architected フレームワークのすべての質問に回答できるに参加者を手配することが推奨される。

-   Well-Architected Tool によるセルフチェックの実施

    -   [Well-Architected Tool を試してみた - Qiita](https://qiita.com/kc_n/items/4b6e84e3b1113e4e37e5)
    -   [AWS Well-Architected Tool が日本語をサポートしました(東京リージョンでご利用いただけます) | Amazon Web Services ブログ](https://aws.amazon.com/jp/blogs/news/wellarchitectedtool_support_jplang/)

-   上記 3 つ共通の特徴
    -   ベストプラクティスに則っているかは、以下、「5 つの柱」の分野別の質問と回答が設けられており、確認することができる。

### 内容

設計原則と 5 つの柱から構成される

-   [設計原則](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.design_principles.wa-dp.ja.html)

    -   必要キャパシティーの推測が不要に
    -   本稼働スケールでシステムをテストする
    -   ⾃動化によってアーキテクチャでの実験を容易にする
    -   発展するアーキテクチャが可能に
    -   データに基づいてアーキテクチャを進化させる
    -   ゲームデーを利用して改善する

-   [5 つの柱](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillars.wa-pillars.ja.html) 以下 5 項目それぞれの設計原則もある
    -   [運用の優秀性](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.operationalExcellence.ja.html)
    -   [セキュリティ](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.security.ja.html)
    -   [信頼性](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.reliability.ja.html)
    -   [パフォーマンス効率](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.performance.ja.html)
    -   [コスト最適化](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.costOptimization.ja.html)

## 資料

-   [【AWS Black Belt Online Seminar】AWS Well-Architected Framework - YouTube](https://www.youtube.com/watch?v=jMJFFo1Oybo)
    -   slideshare 版:
        [AWS Black Belt Online Seminar 2018 AWS Well-Architected Framework](https://www.slideshare.net/AmazonWebServicesJapan/aws-black-belt-online-seminar-2018-aws-wellarchitected-framework)
-   [W-A 営業提案資料(Territory 向け)](http://awsmedia.s3.amazonaws.com/jp/W-A-Introduction.pdf)
-   [JAWS-UG 初心者支部 初心者が避けがちな AWS Well-Architected フレームワークを使って WordPress サイトを評価してみた - YouTube](https://www.youtube.com/watch?v=Fo5o262K-WE)
    -   Speaker Deck 版：[初心者が避けがちな AWS Well-Architected フレームワークを使って WordPress サイトを評価してみた - Speaker Deck](https://speakerdeck.com/shonansurvivors/chu-xin-zhe-gabi-kegatinaaws-well-architectedhuremuwakuwoshi-tutewordpresssaitowoping-jia-sitemita)
