## AWS Well-Architected Framework 　復習問題

---

### 問題 1

以下の説明文の「A」と「B」に当てはまる言葉を答えて下さい。

```
AWS Well-Architected Framework とは、AWS を使ったシステムの設計・運用の「A」をまとめたものである。
また、システムを「B」することが目的である。
```

#### 解答

-   A ⇒ 「ベストプラクティス」
-   B ⇒ 「クラウド最適化」

---

### 問題 2

アーキテクチャの改善のために、実験を繰り返し行いたい。
AWS Well-Architected Framework を参考に、何を取り入れるべきか。

#### 解答

自動化

設計原則「⾃動化によってアーキテクチャでの実験を容易にする」より。

---

### 問題 3

以下の文章は AWS Well-Architected Framework を活用しきれていない事例である。
改善すべき内容をそれぞれ説明してください。

1.  ノウハウ豊富で全幅の信頼を置いている AWS ソリューションアーキテクトからのレビューを受け、指摘内容をすべて取り込んだ。
2.  AWS ソリューションアーキテクトとのレビューの場において、質問のあった特定の領域について出席しているメンバーでは答えられなかったため、仮定で話を進めた。
3.  要件定義工程・設計工程・構築工程の際に、AWS Well-Architected Framework ツールや AWS Well-Architected Framework ホワイトペーパーを使ったため日々の運用もベストプラクティスに沿う形でできている。
4.  構築工程の際に、AWS Well-Architected Framework ツールを始めて実施した。ベストプラクティスに沿っていない設問の回答が多数あったが、「構築がある程度進んでいて改修工数が足りないためそのままにしたい」という理由でその場を収めた。

#### 解答

1.  改善点は「指摘内容をすべて取り込んだ」ことであり、改善方法は「指摘内容を理解の上、ビジネス視点で取り込む・取り込まないを判断すること」である。
2.  改善点は「質問のあった特定の領域について出席しているメンバーでは答えられなかった」ことであり、改善方法は「レビューには質問の内容にすべて回答できるようにメンバーを調整する」ことである。
3.  改善点は「運用工程でアーキテクトの見直しをしていない」ことであり、改善方法は「運用工程でも AWS Well-Architected Framework を通したアーキテクトの見直しをする」ことである。
4.  改善点は「構築工程の際に AWS Well-Architected Framework ツールを始めて実施したこと」であり、改善方法は「要件定義工程や設計工程でも AWS Well-Architected Framework ツールを実施し、手戻りを少なくする」ことである。

---

### 問題 4

とある DB 接続を伴う、AWS で構築されている Web サイトでは開発環境と受け入れ環境で問題なく動いていたが、
本番環境にリリースを行ったところ、SQL のタイムアウトが多発した。
事前に何をすべきでしたか。クラウドの特性を踏まえて回答してください。

#### 解答

本番環境相当の環境を準備して性能テスト・負荷テストをすべきだった。

設計原則「本稼働スケールでシステムをテストする」より。

---

### 問題 5

以下の文章は AWS Well-Architected Framework の「5 つの柱」に関連するものである。
文章に最も近い「柱」を答えてください。

1. 本番稼働用の EC2 をリザーブドインスタンスで購入した
2. 本番環境の RDS をマルチ AZ 構成にすることで単一障害点を減らした
3. 全文検索の ElasticSearch を EC2 に構築することを検討したが、フルマネージドの ElasticSearchService を利用した
4. 1 つの部署で AWS のルートユーザでコンソールにログインしていたが、1 人ずつに IAM ユーザ を作成した
5. アーキテクチャの変更は不具合発生時の切り戻しや顧客への影響を考慮し、小規模に行うようにした

#### 解答

1. コスト最適化
    - 参考：[コストを削減するには、料金モデルをどのように使用したらよいでしょうか? - AWS Well-Architected フレームワーク](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.question.COST_7.ja.html)
2. 信頼性
    - 参考：[ワークロードを保護するために障害分離をどのように使用しますか? - AWS Well-Architected フレームワーク](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.question.REL_10.ja.html)
3. パフォーマンス効率
    - 参考：[パフォーマンス効率 - AWS Well-Architected フレームワーク](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.performance.ja.html) 設計原則：「最新テクノロジーの標準化」より
4. セキュリティ
    - 参考：[セキュリティ - AWS Well-Architected フレームワーク](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.security.ja.html) 設計原則：「強力なアイデンティティ基盤の実装」より
5. 運用上の優秀性
    - 参考：[運用上の優秀性 - AWS Well-Architected フレームワーク](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.pillar.operationalExcellence.ja.html) 設計原則「小規模かつ可逆的な変更を頻繁に行う」より

---

### 問題 6(未習問題)

以下の文章はとある機能の説明文です。
この機能は何でしょうか。

```
AWS の操作ログを「とある機能」を使うことで CloudWatchLogs に 保存している。
ある日　一般公開しているWebサイトの資材が消えてしまうインシデントが発生した。
操作ログより、「いつ」「どのIAMユーザ」がどんな操作をしたかが分かった。
```

#### 解答

AWS CloudTrail

参考：[AWS サービスのイベント履歴を記録する「AWS CloudTrail」とは？実際に利用してみた｜コラム｜クラウドソリューション｜サービス｜法人のお客さま｜ NTT 東日本](https://business.ntt-east.co.jp/content/cloudsolution/column-try-36.html)
