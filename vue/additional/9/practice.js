// 停車駅一覧
var chuoLineStations = [
    {
        "id": "JC12", // 駅のID
        "name": "三鷹", // 駅名
        "isSpecialRapidStop": true // 特快停車駅
    },
    {
        "id": "JC13",
        "name": "武蔵境",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC14",
        "name": "東小金井",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC15",
        "name": "武蔵小金井",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC16",
        "name": "国分寺",
        "isSpecialRapidStop": true
    }
]

var app = new Vue({
    // idがstation-listの要素にVueインスタンスをマウント
    el: "#station-list",
    data: {
        stationsList: chuoLineStations,
        dispOnlySpecialRapidStop: false // 「特快停車駅のみ表示」
    },
    methods: {
        // 「特快停車駅のみ表示」の切り替え
        switchDispSpecialRapidStop: function () {
            this.dispOnlySpecialRapidStop = !this.dispOnlySpecialRapidStop;
        }
    },

})