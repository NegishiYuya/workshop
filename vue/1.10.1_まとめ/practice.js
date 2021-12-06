// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "ノラネコぐんだん パンこうじょう", // 名前
        "price": 1320, // 価格
        "isPictureBook": true // 絵本かどうか
    },
    {
        "id": "2",
        "name": "ノラネコぐんだん はらぺこレシピ 抜き型つき",
        "price": 1540,
        "isPictureBook": false
    },
    {
        "id": "3",
        "name": "ノラネコぐんだん はんたいことばカード",
        "price": 880,
        "isPictureBook": false
    }
]

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray
    },
    filters: {
        /**
         * 引数で渡した価格を3桁ごとに,区切りしたうえで、文言「円」を付与して返却します
         * @param {Number} price 価格 
         * @return {String} 加工した文字列
         */
        dispPrice: function (price) {
            // 3桁ごとに,区切る
            return Number(price).toLocaleString() + '円';
        }
    }
});