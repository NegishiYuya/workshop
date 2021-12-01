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
        /**
         * 駅名を表示させるかを返却する
         * 
         * @param {Boolean} isSpecialRapidStop 特快停車駅かどうか
         * @return {Boolean} 駅名を表示させるかどうか 
         */
        dispStation: function (isSpecialRapidStop) {
            // 「特快停車駅のみ表示」が指定されていない場合は常に表示
            if (!this.dispOnlySpecialRapidStop) {
                return true;
            }
            return isSpecialRapidStop;
        },
        /**
         * 駅名に付与するクラス名を返却する
         * 
         * @param {Boolean} isSpecialRapidStop 特快停車駅かどうか
         * @return {String} 駅名に付与するクラス名 
         */
        getStationNameClass: function (isSpecialRapidStop) {
            return isSpecialRapidStop ? "special-rapid" : "rapid"
        }
    }
})