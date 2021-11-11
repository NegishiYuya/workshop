// 絵本の一覧
var booksArray = [
    {
        "id": "1", // id
        "name": "ノラネコぐんだん パンこうじょう", // 商品名
        "url": "https://www.hakusensha.co.jp/books/9784592761570" // url
    },
    {
        "id": "2",
        "name": "ノラネコぐんだん はらぺこレシピ 抜き型つき",
        "url": "https://www.hakusensha.co.jp/books/9784592107071"
    },
    {
        "id": "3",
        "name": "ノラネコぐんだんのりものGIFT BOX（2さつセット）",
        "url": "https://books.rakuten.co.jp/rb/14513630/"
    },
    {
        "id": "4",
        "name": "ノラネコぐんだんコミック",
        "url": "https://www.hakusensha.co.jp/books/9784592762492"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        backgroundClass: ["background", "background-hide"] // モーダルの親要素のclass
    },
    methods: {
        // モーダルとその背景を表示させる
        openModal: function () {
            this.backgroundClass = ["background", "background-disp"]
        },
        // モーダルとその背景を非表示にする
        closeModal: function () {
            this.backgroundClass = ["background", "background-hide"]
        },
        // イベントの伝播を止めるためのメソッド(処理の中身は不要)
        stopPropagation: function () {
        }
    }
});
