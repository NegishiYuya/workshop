var lunchMenuArray = [
    {
        "id": 1,
        "name": "豚冷しゃぶともも竜田　天然ぶり刺身",
        "price": 1000
    },
    {
        "id": 2,
        "name": "和風牛すじカレーともも竜田と和牛タタキ",
        "price": 1100
    },
    {
        "id": 3,
        "name": "若鶏もも竜田揚げとサバ塩焼と天然ブリ刺身",
        "price": 10000
    }
]

// Vueインスタンスを生成する
var app = new Vue({
    // el: Vueインスタンスをマウントする対象の要素
    el: "#app",

    // data: テンプレートで使用するデータのオブジェクト
    data: {
        menuArray: lunchMenuArray,
        date: new Date()
    },

    // filter: 汎用的なテキストフォーマットを適用する仕組み
    filters: {
        // 日付の変換
        parseDate: function (date) {
            // YYYY年M月D日
            return date.getFullYear() + '年' + (date.getMonth() + 1) + '月' + date.getDate() + '日';
        },
        // 数値の変換
        parsePrice: function (price) {
            // 3桁ごとに,区切り
            return Number(price).toLocaleString() + '円';
        }
    },

    // computed: 算出プロパティ…あるデータから派生するデータを変数として公開する
    computed: {

        // 合計金額の算出
        totalPrice: function () {
            // reduceメソッドを使って変数sumに対してmenu.priceの値を合算
            return this.menuArray.reduce(function (sum, menu) {
                return sum + menu.price
            }, 0)
        },
        // 合計金額を税込みで算出
        totalPriceWithTax: function () {
            // 算出プロパティから算出プロパティを呼び出すこともできる
            return Math.floor(this.totalPrice * 1.08)
        },
        // 税込み合計金額を3で割る
        priceDividedByThree: function () {
            return Math.floor(this.totalPriceWithTax / 3)
        }
    }

});
