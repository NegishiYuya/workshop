var app = new Vue({
    el: "#app",
    data: {
        inputGoodsName: "", // 入力値(名前)
        inputPrice: "", // 入力値(価格)
        goodsArray: [], // 登録した商品を入れる配列
        currentId: 1 // 処理中のID
    },
    methods: {
        /**
         * フォームで入力した商品を登録する
         */
        register: function () {
            // 商品のオブジェクトを作成する
            const goods = {
                id: this.currentId,
                name: this.inputGoodsName,
                price: this.inputPrice
            }
            // 商品のオブジェクトを配列に追加する
            this.goodsArray.push(goods);
            // 登録完了の文言をアラートで表示させる
            alert("ID:" + this.currentId + " 商品名:" + this.inputGoodsName + " の登録を完了しました");
            // IDのインクリメント
            this.currentId++;
        }
    }
});