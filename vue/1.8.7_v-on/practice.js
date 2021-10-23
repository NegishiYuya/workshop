// 飲食店のメニューの一覧
var menuArray = [
    {
        "id": "1", // id
        "name": "屋台の味", // 商品名
        "price": 790, // 金額
        "quantity": 0, // 注文数
        "isPopularMenu": true // 人気商品かどうか
    },
    {
        "id": "2",
        "name": "ニラにんにくラーメン",
        "price": 940,
        "quantity": 0,
        "isPopularMenu": false
    },
    {
        "id": "3",
        "name": "味付煮卵ラーメン",
        "price": 910,
        "quantity": 0,
        "isPopularMenu": false
    },
    {
        "id": "4",
        "name": "キムチラーメン",
        "price": 990,
        "quantity": 0,
        "isPopularMenu": true
    }
]

var app = new Vue({
    el: "#app",
    data: {
        menuArray: menuArray,
        limit: 2000 // 商品ごとの上限金額
    },
    methods: {
        // 商品ごとの金額を返却する
        getAmount: function (price, quantity) {
            return price * quantity
        },
        // 商品ごとの金額が上限を超えているかを判定する
        isOver: function (price, quantity) {
            // dataプロパティやmethodsで定義した関数はthisで呼び出せる
            return this.getAmount(price, quantity) > this.limit
        },
        // v-bindで利用
        getMenuNameStyle: function (isPopularMenu) {
            return isPopularMenu ? 'color:red' : '';
        }
    }
});
