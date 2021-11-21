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
         * 引数で渡した本のIDから、本の名前を抽出する
         * 
         * @param {Number} id 本のID
         * @return {String} 選択中の本の名前 もしくは、「未選択です」 
         */
        getBookName: function (id) {
            /**
             * 引数のidがnullなど の場合は「未選択です」と表示する
             * 
             * (参考)
             * https://qiita.com/_Hammer0724/items/3d21ef84813ee82e8252
             */
            if (!id) {
                return "未選択です";
            }
            /**
             * 引数のidと一致するidを持つ本をfindメソッドを使って抽出する
             * 
             * (参考) https://www.javadrive.jp/javascript/array/index13.html#section2
             */
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