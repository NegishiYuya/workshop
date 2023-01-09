# 前提

問題を解くのに必要なリソースはフォルダ`practice_resource`の中に格納している。  

# 課題1

`http://localhost:8080/user`にアクセスした際に`list.html`を表示できるようにしてください

## 成果物

* kotlin/com/example/springworkshop/controller/UserController.kt
* resources/templates/list.html

## 備考

* list.htmlはフォルダ`practice_resource`に格納している

---

# 課題2

課題1で作成した一覧ページについて、list部分を動的に出力させるようにしてください


## 成果物

* kotlin/com/example/springworkshop/controller/UserController.kt
* kotlin/com/example/springworkshop/form/UserForm.kt
* resources/templates/list.html

## 備考

Listの作成処理は以下をUserController.ktに実装して使うこと

```
    fun getList(): List<UserForm> {
        return listOf(
            UserForm(
                id = 1,
                name = "ニャオハ"
            ),
            UserForm(
                id = 2,
                name = "ニャローテ"
            ),
            UserForm(
                id = 3,
                name = "マスカーニャ"
            ),
            UserForm(
                id = 4,
                name = "ホゲータ"
            ),
        )
    }
```

---

# 課題3

Listの取得処理を新規作成したServiceクラスに実装してください 

## 成果物

* kotlin/com/example/springworkshop/controller/UserController.kt
* kotlin/com/example/springworkshop/service/UserService.kt
* kotlin/com/example/springworkshop/service/UserServiceImpl.kt
* kotlin/com/example/springworkshop/entity/User.kt

## 備考

Serviceでのデータの取り扱いはUser.ktを使い、Controllerでのデータの取り扱いはUserForm.ktを使うこと   
(※ControllerでServiceから受けとったList<User>をList<UserForm>に変換すること)

---

# 課題4

Listの取得処理を新規作成したDaoクラスに実装してください 

## 成果物

* kotlin/com/example/springworkshop/dao/UserDao.kt
* kotlin/com/example/springworkshop/dao/UserDaoImpl.kt

---

# 課題5

以下の仕様を満たす画面を製造してください。

## 仕様

* /user/detail?userId={userId}にアクセスした場合に、ユーザーの情報が1件のみ表示される
   * `detail.html`を表示させること
* リクエストパラメータuserIdには数値が入る想定であり、数値でない値が入った場合の考慮は不要。
* DBを模したリストは課題2の備考に記載されているものを使うこと。
* リクエストパラメータuserIdに存在しないIDが設定されている場合は以下の値を設定して画面表示すること
  * ID:0, 名前:未設定