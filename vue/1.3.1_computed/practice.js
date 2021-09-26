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

var app = new Vue({
    el: "#app",
    data: {
        menuArray: lunchMenuArray
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
        }
    }
});
