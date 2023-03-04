# DBflute概論

## 調べるうえで有用な内容

* 辞書 https://dbflute.seasar.org/ja/manual/reference/dictionary/alphabet/
* ORマッパーとしての使い方 https://dbflute.seasar.org/ja/manual/function/ormapper/index.html
    * 各種自動生成クラスのリファレンスへの入り口として有用
* Behaviorの機能一覧 https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/index.html#function
* ConditionBeanの機能一覧 https://dbflute.seasar.org/ja/manual/function/ormapper/conditionbean/index.html

## 抑えておきたい前提知識

* Optionalとは https://www.bold.ne.jp/engineer-club/java-optional

## DBFluteの中に何があるか

* DBFluteエンジン https://dbflute.seasar.org/ja/manual/function/generator/engine/index.html
    * 自動生成タスクやアプリケーション実装や実行時のための資材だが、実装者が気にする必要はない
* DBFluteクライアント https://dbflute.seasar.org/ja/manual/function/generator/client/index.html
    * プロジェクト固有のカスタマイズをするための各種設定ファイルなどが入っている。各種DBFluteタスクのための設定ファイル(DBの接続先やDIの設定や実行設定など)
        * フォルダ`dfprop`の中身は把握が必要
* DBFluteランタイム https://dbflute.seasar.org/ja/manual/function/ormapper/runtime/index.html
    * 自動生成されたクラスが参照するライブラリ


## DBFluteで使うクラス 

* DBFluteで使うクラスに関すること https://dbflute.seasar.org/ja/manual/function/ormapper/runtime/index.html
    * BsとExの違い https://dbflute.seasar.org/ja/manual/reference/dictionary/alphabet/wg.html#generationgap
        * Bs generateタスク実行によって生成されるスーパークラス https://dbflute.seasar.org/ja/manual/reference/dictionary/alphabet/wb.html#bs
            * generateタスクの都度 上書きされる 
        * Ex generateタスク実行によって生成されるサブクラス https://dbflute.seasar.org/ja/manual/reference/dictionary/alphabet/we.html#ex
            * generateタスクを実行しても上書きされない
                * アプリケーション固有の処理を実装できる
            * アプリケーション実装時はこっちを使う！！
    * Entity DBのデータをプログラム上に反映させるためのオブジェクト https://dbflute.seasar.org/ja/manual/function/ormapper/entity/index.html
        * SQLの実行方式による違い
            * テーブル対応のEntity DomainEntity
            * SQL対応のEntity CustomizeEntity
        * OptionalEntity
            * Optionalとは https://www.bold.ne.jp/engineer-club/java-optional
                * 簡単に言うと、クラスの定義 + null考慮の処理をラップできる仕組み
    * Behavior DBアクセスを司るクラス。「行動」や「振る舞い」から転じたものと思われる。 https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/index.html
        * 参照 検索条件にconditionBeanを指定して、DBflute用のクラスで受け取る(ListやOptionalを最適化したクラス)
            * 件数取得: selectCount https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/select/selectcount.html
                * 戻り値: int
            * 1件取得: selectEntity https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/select/selectentity.html
                * 戻り値: OptionalEntity
            * 複数件取得: selectList https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/select/selectlist.html 
                * 戻り値: ListResultBean
            * 子テーブル取得: LoadReferrer https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/select/loadreferrer.html
                * 戻り値: void(引数で渡したListに情報追加)
        * 更新
            * 1件登録: insert https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/insert.html
            * 1件更新: update https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/update.html
            * 1件削除: delete https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/delete.html
            * 複数件登録: batchInsert https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/batchinsert.html
            * 複数件更新: queryUpdate https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/queryupdate.html
            * 複数件削除: queryDelete https://dbflute.seasar.org/ja/manual/function/ormapper/behavior/update/querydelete.html
    * 

* ラムダ式を使った実装の仕方 https://dbflute.seasar.org/ja/tutorial/onjava8.html 

## DBFluteのタスクについて

* 全体像 https://dbflute.seasar.org/ja/manual/function/generator/task/generate/index.html
* 外出しSQLの利用にはルールがある https://dbflute.seasar.org/ja/manual/function/generator/task/sql2entity/index.html

## 保守系統の知識

* DBFluteのアップデート https://dbflute.seasar.org/ja/environment/upgrade/index.html