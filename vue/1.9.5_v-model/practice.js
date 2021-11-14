var app = new Vue({
    el: "#app",
    data: {
        checkboxSingle: true // 単一のチェックボックスはbooleanで扱う
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をチェックボックスに設定する
         */
        checkFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": false
            }
            alert("APIの実行が成功しました")
            this.checkboxSingle = apiResponseMoc.response
        }
    }
});
