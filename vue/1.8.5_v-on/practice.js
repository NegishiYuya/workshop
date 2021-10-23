var app = new Vue({
    el: "#app",
    data: {
        price: 0
    },
    computed: {
        priceWithTax: function () {
            return Math.floor(this.price * 1.08)
        }
    }
});
