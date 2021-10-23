// 飲食店のメニューの一覧
var menuArray = [
    {
        "id": "1", // id
        "name": "屋台の味", // 商品名
        "price": 790, // 金額
        "quantity": 0 // 注文数
    },
    {
        "id": "2",
        "name": "ニラにんにくラーメン",
        "price": 940,
        "quantity": 0
    },
    {
        "id": "3",
        "name": "味付煮卵ラーメン",
        "price": 910,
        "quantity": 0
    },
    {
        "id": "4",
        "name": "キムチラーメン",
        "price": 990,
        "quantity": 0
    }
]

var app = new Vue({
    el: "#app",
    data: {
        menuArray: menuArray
    }
});
