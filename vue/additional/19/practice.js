var app = new Vue({
    el: "#app",
    data: {
        firstName: '', // 姓
        lastName: '', // 名
        savedData: { // 保存した内容
            firstName: '', // 姓
            lastName: '' // 名
        }
    },
    methods: {
        /**
         * 入力内容を保存する
         */
        saveData: function () {
            this.savedData.firstName = this.firstName
            this.savedData.lastName = this.lastName
        },
        /**
         * 保存した内容を入力に反映する
         */
        applyData: function () {
            this.firstName = this.savedData.firstName
            this.lastName = this.savedData.lastName
        }
    }
});