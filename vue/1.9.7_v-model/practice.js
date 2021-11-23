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
        checkboxMultiple: [] // 複数回答のチェックボックスは配列で扱う
    }
});