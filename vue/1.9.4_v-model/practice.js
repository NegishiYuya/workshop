var app = new Vue({
    el: "#app",
    data: {
        textInput: '入力してください'
    },
    computed: {
        /**
         * dataプロパティ"textInput"の長さに応じて、入力要素に付与するクラスを算出する
         * @return {String} 入力要素に付与するクラス
         */
        textInputClass: function () {
            let textInputLength = this.textInput.length
            return textInputLength >= 1 && textInputLength <= 10 ? "" : "alert"
        }
    }
});
