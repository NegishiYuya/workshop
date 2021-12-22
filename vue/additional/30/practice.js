// 科目選択用の配列
var subjectOptionArray = [
    {
        "id": 1,
        "value": "Japanese",
        "label": "国語"
    },
    {
        "id": 2,
        "value": "Math",
        "label": "数学"
    },
    {
        "id": 3,
        "value": "English",
        "label": "英語"
    }
]

var app = new Vue({
    el: "#app",
    data: {
        examResultArray: [], // 試験結果を登録する配列
        subjectOptionArray: subjectOptionArray,
        name: '', // 名前
        subject: '', // 科目
        point: 0, // 点数
    },
    filters: {
        /**
         * 科目を日本語変換した文字列を返却する
         * 
         * @param {String} subject 科目 
         * @return {String} 科目を日本語変換した文字列
         */
        convertTextForSubject: function (subject) {
            // 科目の配列の中で、引数で渡した科目の値と一致するものを抽出し、labelを返却する
            return this.subjectOptionArray.find(function (subjectOption) {
                return subjectOption.value == subject
            }).label
        }
    },
    methods: {
        postExamResult: function () {
            // 結果のオブジェクト
            const examResult = {
                name: this.name,
                subject: this.subject,
                point: this.point
            }
            // 結果のオブジェクトを配列に追加
            this.examResultArray.push(examResult);
        }
    }
});
