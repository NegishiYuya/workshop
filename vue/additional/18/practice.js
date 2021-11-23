// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "商品1", // 商品名
        "price": 6500, // 価格
        "quantity": 0 // 数量
    },
    {
        "id": "2",
        "name": "商品2",
        "price": 3300,
        "quantity": 0
    },
    {
        "id": "3",
        "name": "商品3",
        "price": 3000,
        "quantity": 0
    }
]

// 購入履歴取得APIのレスポンス
var apiResponse = {
    "userId": 1,　// ユーザID
    "lastOrder": [ // 最終購入データ
        {
            "id": "1", // id
            "quantity": 3 // 数量
        },
        {
            "id": "2",
            "quantity": 2
        },
        {
            "id": "3",
            "quantity": 10
        }
    ]
}

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray
    },
    methods: {
        /**
         * 商品の数量に応じた、金額を返却する.
         * 
         * @param {Number} price 価格
         * @param {Number} quantity 数量
         * @returns {Number} 金額
         */
        getAmount: function (price, quantity) {
            return price * quantity
        },
        /**
         * 購入履歴の数量を入力に反映する.
         * 
         */
        applyLastOrder: function () {

            // APIのレスポンスから最終購入のデータを取得
            alert("購入履歴を反映します");
            const lastOrderArray = apiResponse.lastOrder;

            // 購入履歴から数量を反映
            lastOrderArray.forEach(function (order) {
                this.goodsArray.forEach(function (goods) {
                    if (order.id == goods.id) {
                        goods.quantity = order.quantity
                    }
                });
            });
        }
    }
});
