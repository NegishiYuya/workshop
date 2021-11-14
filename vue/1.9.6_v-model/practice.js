var app = new Vue({
    el: "#app",
    data: {
        checkboxMultiple: [] // 複数回答のチェックボックスは配列で扱う
    },
    methods: {
        /**
         * APIからのレスポンス(を模したもの)をチェックボックスに設定する
         */
        checkFromAPI: function () {
            // APIからのレスポンスのモック
            const apiResponseMoc = {
                "status": 200,
                "response": ["checkbox-1", "checkbox-3"]
            }
            alert("APIの実行が成功しました")
            this.checkboxMultiple = apiResponseMoc.response
        }
    }
});