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
        menuArray: lunchMenuArray
    },
});
