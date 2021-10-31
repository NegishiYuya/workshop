var app = new Vue({
    el: "#app",
    methods: {
        alertParent: function () {
            alert("親要素のclick");
        },
        alertChild: function () {
            alert("子要素のclick");
        },
        alertGrandChild: function () {
            alert("孫要素のclick");
        }
    }
});
