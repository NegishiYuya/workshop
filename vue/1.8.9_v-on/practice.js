var app = new Vue({
    el: "#app",
    methods: {
        outputConsoleLog: function (event) {
            console.log("入力した要素のname: " + event.target.name)
            console.log("入力した要素のvalue: " + event.target.value)
        }
    }
});
