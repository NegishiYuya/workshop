var app = new Vue({
    el: "#app",
    data: {
        examResultArray: [], // 試験結果を登録する配列
        name: '', // 名前
        japanese: '', // 国語の点数
        math: '', // 数学の点数
        english: '', // 英語の点数
        hasError: false // エラーかどうか
    },
    filters: {
        /**
         * 引数で渡された点数に文言「点」を付与して返却する
         * @param {Number} point 点数 
         * @return {String} 点数に「点」を付与した文字列
         */
        addSuffixOfPoint: function (point) {
            return point + '点';
        }
    },
    computed: {
        /**
         * 受験者数を返却する
         * @return {Number} 受験者数 
         */
        numberOfExaminee: function () {
            return this.examResultArray.length
        },
        /**
         * 国語の平均点を返却する
         * @return {Number} 国語の平均点 
         */
        japanseAverage: function () {
            // 受験者数が0の場合は0を返却する
            if (this.numberOfExaminee == 0) {
                return 0;
            }
            // 試験結果のうち、国語の点数を足していくことで合計点を算出する
            const sumJapaneseResult = this.examResultArray.reduce(function (sum, result) {
                return sum + result.japanese
            }, 0)
            // 国語の合計点 / 受験者数を返却する
            return sumJapaneseResult / this.numberOfExaminee
        },
        /**
         * 赤点かどうかを判定する
         * @return {Boolean} 赤点かどうか
         */
        isFailingGrade: function () {
            // 受験者数が0の場合は0を返却する
            if (this.numberOfExaminee == 0) {
                return false;
            }
            return this.japanseAverage < 50;
        }
    },
    methods: {
        /**
         * 試験結果を送信する
         */
        postExamResult: function () {

            // 必須項目がすべてからの場合はエラーとする
            if (!this.name || !this.japanese || !this.math || !this.english) {
                this.hasError = true;
                return;
            }

            // 結果のオブジェクト
            const examResult = {
                name: this.name,
                japanese: Number(this.japanese),
                math: Number(this.math),
                english: Number(this.english)
            }

            // エラーを解除させる
            this.hasError = false;
            // 結果のオブジェクトを配列に追加
            this.examResultArray.push(examResult);
        }
    }
});
