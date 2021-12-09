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
    }
});