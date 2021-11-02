var app = new Vue({
    el: "#app",
    data: {
        text: ''
    },
    methods: {
        textLength: function () {
            return this.text.length
        },
        textAreaClass: function () {
            return this.textLength == 0 || this.textLength > 8 ? "alert" : "";
        },
        setText(event) {
            this.text = event.target.value
        }
    }
});
