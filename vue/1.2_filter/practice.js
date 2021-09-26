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
    }
});
