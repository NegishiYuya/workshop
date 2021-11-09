var app = new Vue({
    el: "#app",
    data: {
        text: ''
    },
    computed: {
        /**
         * dataプロパティ"text"の長さを算出する
         * @return {Number} dataプロパティ"text"の長さ
         */
        textLength: function () {
            return this.text.length
        },
        /**
         * dataプロパティ"text"の長さに応じて、入力要素に付与するクラスを算出する
         * @return {String} 入力要素に付与するクラス
         */
        textAreaClass: function () {
            return this.textLength == 0 || this.textLength > 8 ? "alert" : "";
        }
    },
    methods: {
        /**
         * dataプロパティ"text"をイベントとして入力された値で更新する
         * @param {obj} event イベント
         */
        setText(event) {
            this.text = event.target.value
        }
    }
});
