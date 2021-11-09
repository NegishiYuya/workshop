// 絵本の一覧
var booksArray = [
    {
        "id": "1", // id
        "name": "ノラネコぐんだん パンこうじょう", // 商品名
        "url": "https://www.hakusensha.co.jp/books/wp-content/uploads/2016/01/bk9784592761570.jpg" // 画像url
    },
    {
        "id": "2",
        "name": "ノラネコぐんだん はらぺこレシピ 抜き型つき",
        "url": "https://www.hakusensha.co.jp/books/wp-content/uploads/2018/10/7c69fbf12a03346a81e5675fa9e8820e.jpg"
    },
    {
        "id": "3",
        "name": "ノラネコぐんだん ラーメンやさん",
        "url": "https://www.hakusensha.co.jp/books/wp-content/uploads/2021/10/fdfd964fd0620af8d980e55c4d5840e7-e1634904303887.jpg"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        booksArray: booksArray, // 絵本の一覧 
        imgUrl: '' // 表示させる画像のURL
    },
    methods: {
        // 表示させる画像のURLを設定する
        setDispImage: function (imgUrl) {
            this.imgUrl = imgUrl
        }
    }
});
