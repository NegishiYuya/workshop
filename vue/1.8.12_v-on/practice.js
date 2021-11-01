var app = new Vue({
    el: "#app",
    data: {
        bookName: ''
    },
    computed: {
        pulldownClass: function () {
            return this.bookName == '' ? "alert" : "";
        }
    }
});
