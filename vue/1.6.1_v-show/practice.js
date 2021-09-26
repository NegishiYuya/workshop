var lunchMenuArray = [
    {
        "id": 1,
        "name": "豚冷しゃぶともも竜田　天然ぶり刺身",
        "price": 1000,
        "isSoldOut": false
    },
    {
        "id": 2,
        "name": "和風牛すじカレーともも竜田と和牛タタキ",
        "price": 1100,
        "isSoldOut": true
    },
    {
        "id": 3,
        "name": "若鶏もも竜田揚げとサバ塩焼と天然ブリ刺身",
        "price": 10000,
        "isSoldOut": false
    }
]

var app = new Vue({
    el: "#app",
    data: {
        menuArray: lunchMenuArray
    }
});
