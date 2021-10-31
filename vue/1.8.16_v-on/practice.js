var app = new Vue({
    el: "#app",
    data: {
        backgroundClass: ["background", "background-hide"], // モーダルの親要素のclass
        orderCount: 0 // 注文数
    },
    methods: {
        // モーダルとその背景を表示させる
        openModal: function () {
            this.backgroundClass = ["background", "background-disp"]
        },
        // モーダルとその背景を非表示にする
        closeModal: function () {
            this.backgroundClass = ["background", "background-hide"]
        },
        // イベントの伝播を止めるためのメソッド(処理の中身は不要)
        stopPropagation: function () {
        },
        // 注文数を加算する
        increaseCount: function () {
            this.orderCount++;
        },
        // 注文数を減算する
        decreaseCount: function () {
            if (this.orderCount > 0) {
                this.orderCount--;
            }
        },
        // 注文処理をして、モーダルを非表示にする
        order: function () {
            alert(this.orderCount + "個注文しました")
            this.closeModal()
        }
    }
});
