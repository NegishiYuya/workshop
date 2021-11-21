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
        selectMultiple: [] // ラジオボタンの値
    },
    methods: {
        /**
         * 引数で渡した本のIDの配列から、本の名前を抽出する
         * 
         * @param {Array} id 本のIDの配列
         * @return {String} 選択中の本の名前 もしくは、「未選択です」 
         */
        getBookName: function (ids) {
            /**
             * 引数のidsがnull もしくは 長さ0の場合は「未選択です」と表示する
             * 
             * (参考)
             * https://qiita.com/_Hammer0724/items/3d21ef84813ee82e8252
             * https://qiita.com/kozzzz/items/42108bc96b3a0e7c53d5
             */
            if (!ids || !ids.length) {
                return "未選択です";
            }
            /**
             * 引数のIDの配列に含まれる本をfilterメソッドを使って抽出する
             * 
             * (参考)
             * https://qiita.com/hirakuma/items/fd7b6492939951190496
             */
            const dispTargetArray = this.booksArray.filter(function (book) {
                // 
                return ids.includes(book.id)
            })
            /**
             *  引数のIDの配列に含まれる本の配列からmapメソッドを使って名前のみを抽出する
             * 
             *  (例)
             *  [{"id":"2","name":"ノラネコぐんだんはらぺこレシピ抜き型つき"},{"id":"3","name":"ノラネコぐんだんラーメンやさん"}]から
             *  "ノラネコぐんだんはらぺこレシピ抜き型つき"　のみ抽出
             * 
             *  (参考)
             *  https://www.sejuku.net/blog/21812
             */
            const booksName = dispTargetArray.map(function (dispTarget) {
                return dispTarget.name
            })
            return booksName
        },
        /**
         * セレクトボックスの選択をクリアする
         */
        clearSelectBox: function () {
            this.selectMultiple = []
        }
    }
});