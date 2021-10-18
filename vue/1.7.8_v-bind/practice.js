// アイスの一覧
var iceArray = [
    {
        "id": 1, // ID
        "name": "ゆきみ大福", // 商品名
        "imageSrc": "images/01.jpg", // 画像パス
        "url": "https://www.lotte.co.jp/products/brand/yukimi/" // 商品URL
    },
    {
        "id": 2,
        "name": "ザクレープ",
        "imageSrc": "images/02.jpg",
        "url": "https://www.morinaga.co.jp/ice/the_crepe/"
    },
    {
        "id": 3,
        "name": "ブラックモンブラン",
        "imageSrc": "images/03.jpg",
        "url": "https://takeshita-seika.jp/"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        iceArray: iceArray
    }
});
