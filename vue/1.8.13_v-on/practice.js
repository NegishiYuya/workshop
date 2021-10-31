var app = new Vue({
    el: "#app",
    data: {
        inputText: ''
    },
    methods: {
        sendData: function () {
            alert("入力した文字列 " + this.inputText + " を送信しました。")
        }
    }
});
