// 絵本の一覧
var booksArray = [
    {
        "id": "1", // id
        "name": "ノラネコぐんだん パンこうじょう" // 名前
    },
    {
        "id": "2",
        "name": "ノラネコぐんだん はらぺこレシピ 抜き型つき"
    },
    {
        "id": "3",
        "name": "ノラネコぐんだん ラーメンやさん"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        booksArray: booksArray,
        radioButtonVal: "" // ラジオボタンの値
    },
    methods: {
        /**
         * 
         * @param {Number} id 本のID
         * @return {String} 選択中の本の名前 もしくは、「未選択です」 
         */
        dispBookName: function (id) {
            // 引数のidがnullなどの場合は「未選択です」と表示する
            if (!id) {
                return "未選択です";
            }
            // 引数のidと一致する本をfindメソッドを使って抽出する
            const dispTarget = this.booksArray.find(function (book) {
                return book.id == id
            })
            return dispTarget.name
        },
        /**
         * ラジオボタンの選択をクリアする
         */
        clearRadioButton: function () {
            this.radioButtonVal = ""
        }
    }
});