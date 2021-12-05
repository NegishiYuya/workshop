// 登録済みの住所
var registratedAddress = {
    postalCode: "214-0014",
    prefecture: 2,
    address: "川崎市多摩区登戸"
}

// 都道府県のリスト(プルダウン用)
var postalCodeOptionList = [
    {
        "value": 0,
        "label": "選択してください"
    },
    {
        "value": 1,
        "label": "東京都"
    },
    {
        "value": 2,
        "label": "神奈川県"
    },
    {
        "value": 3,
        "label": "千葉県"
    }
]

var app = new Vue({
    el: "#member-form",
    data: {
        inputType: 1, // 入力方法
        postalCode: "", // 郵便番号
        prefecture: 0, // 都道府県
        address: "", // 住所
        postalCodeOptionList: postalCodeOptionList // 郵便番号のリスト(プルダウン用)
    },
    methods: {
        /**
         * 入力方法を切り替える
         */
        changeInputType: function () {
            if (this.inputType == 1) {
                this.postalCode = ""
                this.prefecture = 0
                this.address = ""
                return;
            } else {
                this.postalCode = registratedAddress.postalCode
                this.prefecture = registratedAddress.prefecture
                this.address = registratedAddress.address
                return;
            }
        }
    }
})