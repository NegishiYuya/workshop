// 百人一首の一覧
var poemList = [
    {
        "id": "1", // ID
        "body": "秋の田の 仮庵の庵の 苫をあらみ わが衣手は 露にぬれつつ", // 本文
        "url": "https://ogurasansou.jp.net/columns/hyakunin/2017/10/18/17/" //URL
    },
    {
        "id": "2",
        "body": "春過ぎて夏来にけらし白妙の 衣ほすてふ天の香具山",
        "url": "https://ogurasansou.jp.net/columns/hyakunin/2017/10/17/213/"
    },
    {
        "id": "3",
        "body": "あしひきの山どりの尾のしだり尾の ながながし夜をひとりかもねむ",
        "url": "https://ogurasansou.jp.net/columns/hyakunin/2017/10/17/220/"
    },
]

var app = new Vue({
    el: "#poem-list",
    data: {
        poemList: poemList,
        dispLink: "_self" // aタグのtargetに設定する値
    },
})