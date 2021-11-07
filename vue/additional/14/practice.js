// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "ただうまいだけの塩辛 500g", // 商品名
        "price": 6500, // 価格
        "postagePrice": 0, // 送料
        "quantity": 0, // 数量
        "url": "https://item.rakuten.co.jp/e-iki/1000027-500-1/" // url
    },
    {
        "id": "2",
        "name": "サーモン塩辛（2瓶セット） 三幸",
        "price": 3300,
        "postagePrice": 0,
        "quantity": 0,
        "url": "https://item.rakuten.co.jp/otoshuclub/8100343/"
    },
    {
        "id": "3",
        "name": "イカの塩辛3種食べ比べセット",
        "price": 3000,
        "postagePrice": 1100,
        "quantity": 0,
        "url": "https://item.rakuten.co.jp/marukamemeisanten/10000006/"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray
    },
    methods: {
        /**
         * 商品の数量をイベントとして入力された値で更新する
         * @param {obj} goods 商品
         * @param {obj} event イベント
         */
        setQuantity: function (goods, event) {
            goods.quantity = event.target.value
        },
        /**
         * 商品の金額を送料込みで返却する
         * @param {Number} price 価格
         * @param {Number} quantity 数量
         * @param {Number} postagePrice 送料
         * @return {Number} 送料込みの商品の金額
         */
        getPriceWithPostage: function (price, quantity, postagePrice) {
            if (quantity == 0) {
                return 0
            }
            return price * quantity + postagePrice
        }
    }
});
