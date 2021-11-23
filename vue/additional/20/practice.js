// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "商品1", // 商品名
        "quantity": 0 // 数量

    },
    {
        "id": "2",
        "name": "商品2",
        "quantity": 0
    },
    {
        "id": "3",
        "name": "商品3",
        "quantity": 0
    }
]
var app = new Vue({
    el: "#app",
    data: {
        goodsArray: goodsArray,
        quantityForAll: 0 // 一括選択用の変数
    },
    methods: {
        /**
         * 数量を一括で設定する
         */
        setQuantityAll: function () {
            /**
             * プルダウンで指定された数量を変数に格納する
             * Vueのdataプロパティはthisで呼び出す
             * forEachの中からだとthisを使ってVueのdataプロパティを呼び出せない。
             * forEachのthisはループで回している一単位分を指すためである。
             * そのため、一度変数に格納する。
             */
            const quantity = this.quantityForAll

            this.goodsArray.forEach(function (goods) {
                // 商品の数量に一括指定した数量を指定する
                goods.quantity = quantity
            });
        },
        /**
         * パラメータで渡した数量に応じたプルダウンのクラスを返却する
         * 
         * @param {Number} quantity 数量 
         */
        getPullDownClass: function (quantity) {
            return quantity == 0 ? "alert" : ""
        }
    }
});