// 試験の成績
var examResult = [
    {
        "id": 1,
        "Japanese": 50,
        "Math": 100,
        "English": 70
    },
    {
        "id": 2,
        "Japanese": 60,
        "Math": 70,
        "English": 80
    },
    {
        "id": 3,
        "Japanese": 90,
        "Math": 40,
        "English": 100
    }
]

var app = new Vue({
    el: "#app",
    data: {
    },

    filters: {
        // 引数pointの末尾に"点"という文字を付与する
    },
    computed: {
        // 受験者数
        numberOfExaminee: function () {
            return this.examResult.length
        },
        // 国語の平均点
    }
});
