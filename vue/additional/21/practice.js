// 商品一覧
var goodsArray = [
    {
        "id": "1", // ID
        "name": "クリーミーラテ" // 商品名
    },
    {
        "id": "2",
        "name": "エスプレッソ"
    },
    {
        "id": "3",
        "name": "TOKYOキャラメルラブストーリー"
    }
]

// 購入履歴
var orderHistory = [
    {
        "id": 1, // 注文ID(IDが大きいものが最新)
        "order": ["2", "3"] // 注文した商品
    },
    {
        "id": 2,
        "order": ["1", "2"]
    },
    {
        "id": 3,
        "order": ["1", "3"]
    },
]

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray, // 商品一覧
        orderHistory: orderHistory, // 注文履歴
        goodsCheckBox: [] // 選択した商品
    },
    methods: {
        /**
         * 最後の注文をチェックボックスに反映する
         */
        applyLastOrder: function () {
            /**
             * 最終要素は[配列の長さ-1]で指定すると簡単に取得できる
             * (参考)
             * https://pisuke-code.com/javascript-get-array-last-element/
             */
            const lastOrder = this.orderHistory[orderHistory.length - 1]
            this.goodsCheckBox = lastOrder.order
        }
    }
});