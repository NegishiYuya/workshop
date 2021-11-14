// パンのリスト
var breadList = [
    {
        "name": "焼きそばパン",
        "value": 1
    },
    {
        "name": "あんぱん",
        "value": 2
    }
    ,
    {
        "name": "メロンぱん",
        "value": 3
    }
]

var app = new Vue({
    el: "#app",
    data: {
        breadList :breadList
    },
    methods: {
        sendData: function () {
            alert("食べたいパンを送信しました。")
        }
    }
});
