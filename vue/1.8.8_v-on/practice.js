// 飲食店のメニューの一覧
var menuArray = [
    {
        "id": "1", // id
        "name": "トリート with トリック フラペチーノ", // 商品名
        "price": 690, // 金額
        "url": "https://product.starbucks.co.jp/beverage/frappuccino/4524785457669/?category=beverage"
    },
    {
        "id": "2",
        "name": "キャラメル アップル ルイボス ティー",
        "price": 540,
        "url": "https://product.starbucks.co.jp/beverage/tea/4524785483293/?category=beverage"
    },
    {
        "id": "3",
        "name": "ダーク モカ チップ フラペチーノ",
        "price": 550,
        "url": "https://product.starbucks.co.jp/beverage/frappuccino/4524785166066/?category=beverage"
    },
    {
        "id": "4",
        "name": "チャイ ティー ラテ",
        "price": 484,
        "url": "https://product.starbucks.co.jp/beverage/tea/4524785034204/?category=beverage"
    }
]

var app = new Vue({
    el: "#cafe",
    data: {
        menuArray: menuArray,
        whipCreamPrice: 50, // ホイップクリームの金額
        priceLimit: 600 // alertをつける閾値の金額
    },
    filters: {
        addSuffixYen: function (price) {
            return price + "円"
        }
    },
    methods: {
        // ホイップクリーム付きの金額を返却する
        priceWithWhipCream: function (price) {
            return price + this.whipCreamPrice;
        },
        // 金額の表示に使うクラスを返却する
        getPriceClass: function (price) {
            return price >= this.priceLimit ? 'alert' : ''
        }
    }
})