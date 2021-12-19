var app = new Vue({
    el: "#app",
    data: {
        examResultArray: [], // 試験結果を登録する配列
        name: '', // 名前
        japanese: 0, // 国語の点数
        math: 0, // 数学の点数
        english: 0 // 英語の点数
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

        }
    },
    methods: {
        /**
         * 試験結果を送信する
         */
        postExamResult: function () {
            /**
             * 結果のオブジェクト
             * 
             * 数値として扱いたい項目をオブジェクトに
             * そのまま設定すると、文字列として扱われるので、
             * Number関数を使って数値型に変換する
             * 
             * 参考:
             * https://uxmilk.jp/11582
             */
            const examResult = {
                name: this.name,
                japanese: Number(this.japanese),
                math: Number(this.math),
                english: Number(this.english)
            }
            // 結果のオブジェクトを配列に追加
            this.examResultArray.push(examResult);
        }
    }
});
