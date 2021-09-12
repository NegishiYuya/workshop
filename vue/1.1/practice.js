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
    el: "#app", // idがappの要素
    // data: テンプレートで使用するデータのオブジェクト
    data: {
        // 文字列の指定
        message: "Hello world!",
        // 配列の指定
        idList: [1, 2, 3],
        // オブジェクトの指定
        obj: {
            key1: "value1",
            key2: "value2"
        },
        // Vueインスタンスのコンストラクタ外で宣言した変数を指定(オブジェクトの配列)
        menuArray: lunchMenuArray
    }
});
