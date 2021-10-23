var app = new Vue({
    el: "#app",
    methods: {
        outputConsoleLog: function (event) {
            const text = event.target.value
            console.log(text);
            console.log(text.length);
        }
    }
});
