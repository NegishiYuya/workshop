var app = new Vue({
    el: "#app",
    data: {
        textInput: 'デフォルトの値', // テキスト
        textareaInput: '', // 複数行テキスト
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をテキストに設定する
         */
        addTextFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": "APIからのレスポンス"
            }
            alert("APIの実行が成功しました")
            this.textInput = apiResponseMoc.response
        }
    }
});
