// 飲食店のメニューの一覧
var menuArray = [
    {
        "id": "1", // id
        "name": "こってり", // 商品名
        "price": 790 // 金額
    },
    {
        "id": "2",
        "name": "あっさり　大盛",
        "price": 950
    },
    {
        "id": "3",
        "name": "味がさね",
        "price": 980
    },
    {
        "id": "4",
        "name": "焼豚2倍盛りチャーシューメン",
        "price": 1230
    }
]

var app = new Vue({
    // idがrame-shopの要素にVueインスタンスをマウント
    el: "#ramen-shop",
    data: {
        menuArray: menuArray
    },
    filters: {
        // 引数で与えられた値段に「円」を付与して返却する
        addSuffixYen: function (price) {
            return price + "円"
        }
    },
    computed: {
        // 合計金額を算出する
        totalPrice: function () {
            // menuArrayの1件ずつに対して、合計金額+値段を計算する
            return this.menuArray.reduce(function (sum, menu) {
                return sum + menu.price
            }, 0)
        }
    }
})