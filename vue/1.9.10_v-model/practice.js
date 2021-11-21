var app = new Vue({
    el: "#app",
    data: {
        selectSingle: "" // 単一の選択
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をセレクトボックスに設定する
         */
        selectSingleFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": "2"
            }
            alert("APIの実行が成功しました")
            this.selectSingle = apiResponseMoc.response
        }
    }
});
