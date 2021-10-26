var app = new Vue({
    el: "#app",
    data: {
        estimate: 1000, // 予算
        expenditure: 1001 // 支出
    },
    filters: {
        addSuffix: function (amount) {
            return amount + '円'
        }
    },
    computed: {
        isOverEstimate: function () {
            return this.estimate < this.expenditure
        }
    }
});
