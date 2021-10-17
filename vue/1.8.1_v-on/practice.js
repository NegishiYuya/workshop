var app = new Vue({
    el: "#app",
    data: {
        count: 0
    },
    // methodsはVueインスタンスのメソッドとして機能する。
    methods: {
        countUp: function () {
            // dataやcomputedで定義されているプロパティにはthisをつけてアクセスする
            this.count++;
        },
        countDown: function () {
            this.count--;
        }
    }
});
