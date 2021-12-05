var app = new Vue({
    el: "#member-form",
    data: {
        firstName: "", // 姓
        lastName: "", // 名
        email: "", // メールアドレス
    },
    computed: {
        /**
         * 姓　の入力内容にエラーがあるかどうかを返却する
         * @return {Boolean} エラーの有無 
         */
        hasErrorInFirstName: function () {
            if (!this.firstName || this.firstName.length > 8) {
                return true
            }
            return false
        },
        /**
         * 姓　の入力エリアに付与するクラス名を返却する
         * @return {String} クラス名 
         */
        firstNameClass: function () {
            return this.hasErrorInFirstName ? "error" : ""
        },
        /**
         * 名　の入力内容にエラーがあるかどうかを返却する
         * @return {Boolean} エラーの有無 
         */
        hasErrorInLastName: function () {
            if (!this.lastName || this.lastName.length > 8) {
                return true
            }
            return false
        },
        /**
         * 名　の入力エリアに付与するクラス名を返却する
         * @return {String} クラス名 
         */
        lastNameClass: function () {
            return this.hasErrorInLastName ? "error" : ""
        },
        /**
         * メールアドレス　の入力内容にエラーがあるかどうかを返却する
         * @return {Boolean} エラーの有無 
         */
        hasErrorInEmail: function () {
            if (!this.email || this.email.length > 256) {
                return true
            }
            return false
        },
        /**
         * メールアドレス　の入力エリアに付与するクラス名を返却する
         * @return {String} クラス名 
         */
        emailClass: function () {
            return this.hasErrorInEmail ? "error" : ""
        },
        /**
         * ボタンを非活性にするかどうかを返却する
         * @return {Boolean} 非活性にするかどうか 
         */
        isDisableButton: function () {
            return this.hasErrorInFirstName || this.hasErrorInLastName || this.hasErrorInEmail
        }
    }
})