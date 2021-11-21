var app = new Vue({
    el: "#app",
    data: {
        radioButtonVal: "1"
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をラジオボタンに設定する
         */
        selectFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": "2"
            }
            alert("APIの実行が成功しました")
            this.radioButtonVal = apiResponseMoc.response
        }
    }
});
