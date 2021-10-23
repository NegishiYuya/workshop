var app = new Vue({
    el: "#app",
    data: {
        text: ''
    },
    computed: {
        textLength: function () {
            return this.text.length
        },
        textAreaClass: function () {
            return this.textLength == 0 || this.textLength > 10 ? "alert" : "";
        }
    }
});
