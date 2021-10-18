var app = new Vue({
    el: "#app",
    data: {
        // googleを使用するかどうか
        useGoogle: true
    },
    computed: {
        // useGoogle の値による、検索エンジンのURL
        searchEngineUrl: function () {
            return this.useGoogle ? 'https://www.google.com/?hl=ja' : 'https://www.yahoo.co.jp/'
        }
    }
});
