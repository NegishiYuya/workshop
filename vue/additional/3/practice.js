var chuoLineStations = [
    {
        "id": "JC05", // 駅のID
        "name": "新宿", // 駅名
        "isSpecialRapidStop": true // 特快停車駅
    },
    {
        "id": "JC06",
        "name": "中野",
        "isSpecialRapidStop": true
    },
    {
        "id": "JC07",
        "name": "高円寺",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC08",
        "name": "阿佐ヶ谷",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC09",
        "name": "荻窪",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC10",
        "name": "西荻窪",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC11",
        "name": "吉祥寺",
        "isSpecialRapidStop": false
    },
    {
        "id": "JC12",
        "name": "三鷹",
        "isSpecialRapidStop": true
    }
]

var app = new Vue({
    el: "#app",
    data: {
        stationsList: chuoLineStations
    },
});
