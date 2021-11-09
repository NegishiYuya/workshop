// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "ただうまいだけの塩辛 500g", // 商品名
        "price": 6500, // 価格
        "postagePrice": 0, // 送料
        "url": "https://item.rakuten.co.jp/e-iki/1000027-500-1/" // url
    },
    {
        "id": "2",
        "name": "サーモン塩辛（2瓶セット） 三幸",
        "price": 3300,
        "postagePrice": 0,
        "url": "https://item.rakuten.co.jp/otoshuclub/8100343/"
    },
    {
        "id": "3",
        "name": "イカの塩辛3種食べ比べセット",
        "price": 3000,
        "postagePrice": 1100,
        "url": "https://item.rakuten.co.jp/marukamemeisanten/10000006/"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray,
        priceLimit: 5000 // alertをつける閾値の金額
    },
    methods: {
        /**
         * 価格に付与するクラスを返却する
         * @param {Number} price 金額
         * @return {String} クラス名
         */
        getPriceClass: function (price) {
            return price >= this.priceLimit ? 'alert' : ''
        },
        /**
         * 価格の文字列を返却する
         * @param {Number} price 金額
         * @return {String} 価格の文字列
         */
        getPriceText: function (price) {
            return price == 0 ? "無料" : price + "円"
        }
    }
})