var app = new Vue({
    el: "#app",
    data: {
        selectMultiple: [] // 複数の選択の場合は配列で持つ
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をセレクトボックスに設定する
         */
        selectMultipleFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": ["1", "2"]
            }
            alert("APIの実行が成功しました")
            this.selectMultiple = apiResponseMoc.response
        }
    }
});