var app = new Vue({
    el: "#member-form",
    data: {
        message: "", // メッセージ
        messageClass: "", // メッセージに付与するクラス
        firstName: "", // 姓
        lastName: "", // 名
        email: "", // メールアドレス
        password: "", // パスワード
        gender: "", // 性別
        mailService: [] // メールフラグ
    },
    methods: {
        /**
         * 
         * 登録処理を行う
         */
        registration: function () {
            // 必須項目が未入力の場合
            if (!(this.firstName && this.lastName && this.email && this.password)) {
                this.message = "入力に不備があります"
                this.messageClass = "error"
                // パスワードを初期化する
                this.password = ""
                return;
            }
            this.message = "登録を完了しました"
            this.messageClass = "success"
            this.password = ""
            return;
        }
    }
})