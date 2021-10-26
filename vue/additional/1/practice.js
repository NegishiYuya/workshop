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
        examResult: examResult
    },

    filters: {
        addSuffixOfPoint: function (point) {
            return point + '点';
        }
    },
    computed: {
        // 受験者数
        numberOfExaminee: function () {
            return this.examResult.length
        },
        // 国語の平均点
        japanseAverage: function () {
            return this.examResult.reduce(function (sum, result) {
                return sum + result.Japanese
            }, 0) / this.numberOfExaminee
        }
    }
});
