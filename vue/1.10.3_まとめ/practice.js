var app = new Vue({
    el: "#app",
    data: {
        date: '', // 日付
        destination: '', // 出張先
        from: '', // 区間(from)
        to: '', // 区間(to)
        amount: 0, // 金額
        travelExpensesArray: [], // 明細
        applicationAmount: 0 // 申請額
    },
    methods: {
        /**
         * 登録処理
         */
        register: function () {
            // 明細のオブジェクトの作成
            const travelExpenses = {
                date: this.date,
                destination: this.destination,
                from: this.from,
                to: this.to,
                amount: Number(this.amount) // 数値型に変換
            }
            // 明細の配列にPUSH
            this.travelExpensesArray.push(travelExpenses);
        }
    },
    computed: {
        // 精算額
        settlementAmount: function () {
            return this.travelExpensesArray.reduce(function (sum, travelExpenses) {
                return sum + travelExpenses.amount
            }, 0)
        },
        // 過不足額
        excessOrDeficiency: function () {
            return this.settlementAmount - this.applicationAmount
        },
        // 過不足額に付与するクラス
        excessOrDeficiencyClass: function () {
            return this.excessOrDeficiency == 0 ? '' : 'error'
        }
    }
});