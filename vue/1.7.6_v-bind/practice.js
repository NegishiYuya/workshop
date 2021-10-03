var app = new Vue({
    el: "#app",
    data: {
        isClosed: true
    },
    // 算出プロパティ
    computed: {
        // isClosedの値に応じた予約ボタンに付与するクラス
        reservationButtonClass: function () {
            return this.isClosed ? 'disabled-button' : ''
        },
        // isClosedの値に応じた定休日の注意喚起文言に付与するスタイル
        closeDayAlertStyle: function () {
            return {
                'color': (this.isClosed ? 'red' : ''),
                'font-size': (this.isClosed ? '200%' : '')
            }
        }

    }
});
