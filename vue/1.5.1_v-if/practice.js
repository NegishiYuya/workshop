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
    filters: {
        parsePrice: function (price) {
            return Number(price).toLocaleString() + '円';
        }
    },
    computed: {
        totalPrice: function () {
            return this.menuArray.reduce(function (sum, menu) {
                return sum + menu.price
            }, 0)
        },
        totalPriceWithTax: function () {
            return Math.floor(this.totalPrice * 1.08)
        }
    }

});
