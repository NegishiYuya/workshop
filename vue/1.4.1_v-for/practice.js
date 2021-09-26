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

var lunchToppingArray = [
    {
        "id": 1,
        "name": "明太子おろし",
        "price": 100
    },
    {
        "id": 2,
        "name": "生卵",
        "price": 50
    },
    {
        "id": 3,
        "name": "ごはん大盛り",
        "price": 0
    }
]

var app = new Vue({
    el: "#app",
    data: {
        menuArray: lunchMenuArray,
        toppingArray: lunchToppingArray
    },
    filters: {
        parsePrice: function (price) {
            return Number(price).toLocaleString() + '円';
        }
    }
});
