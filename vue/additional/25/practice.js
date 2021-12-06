// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "ホット・スイーツパイりんご" // 名前
    },
    {
        "id": "2",
        "name": "シュガーレイズド"
    },
    {
        "id": "3",
        "name": "オールドファッション"
    },
    {
        "id": "4",
        "name": "エンゼルクリーム"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray, // 商品一覧
        selectedGoods: [] // セレクトボックスの値
    },
    computed: {
        /**
         * 選択された商品の件数に応じたメッセージを返す
         * @return {String} メッセージ
         */
        message: function () {
            if (!this.selectedGoods.length) {
                return "選択してください"
            }
            if (this.selectedGoods.length >= 3) {
                return "2個まで選んでください"
            }
            return ""
        }
    }
});