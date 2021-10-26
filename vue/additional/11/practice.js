// 飲み物の一覧
var menuArray = [
    {
        "id": "1", // id
        "name": "クラフトボス フルーツティー", // 商品名
        "price": 140, // 金額
        "quantity": 0, // 注文数
        "url": "https://www.suntory.co.jp/softdrink/news/pr/article/SBF1087.html" // url
    },
    {
        "id": "2",
        "name": "宇治抹茶ラテ",
        "price": 490,
        "quantity": 0,
        "url": "https://www.tullys.co.jp/menu/drink/other_d/gt_latte.html"
    },
    {
        "id": "3",
        "name": "ココア",
        "price": 517,
        "quantity": 0,
        "url": "https://product.starbucks.co.jp/beverage/others/4524785000674/"
    },
    {
        "id": "4",
        "name": "緑茶",
        "price": 140,
        "quantity": 0,
        "url": "https://www.itoen.jp/products/detail.php?id=1"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        menuArray: menuArray
    }
});
