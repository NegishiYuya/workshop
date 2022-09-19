/**
 * マスターのオブジェクト
 */
const masters = {
    // 希望日時
    "hopeDate": [
        { value: 20221015, id: 20221015, label: "2022/10/15" },
        { value: 20221022, id: 20221022, label: "2022/10/22" },
        { value: 20221029, id: 20221029, label: "2022/10/29" },
    ],
    // 行先の希望
    "hopeDestination": [
        { value: "", label: "選択してください" },
        { value: "1", label: "高尾山" },
        { value: "2", label: "奥多摩" },
        { value: "3", label: "箱根" }
    ]
};

/**
 * モーダル内のチェックボックスとプルダウンを生成する
 */
const setUpModal = function () {
    // mastersから希望日時と行先の希望のマスタを変数に設定する
    // 希望日時のチェックボックスのliタグのリストを生成する
    // 行先の希望のプルダウンのoptionタグのリストを生成する
    // 希望日時のチェックボックスのliタグのリストをulタグにappendする
    // 行先の希望のプルダウンのoptionタグのリストをselectタグにappendする
};

/**
 * 「回答する」を押下して、アンケート内容を送る
 */
const submitModal = function () {
    // 希望日時を取得する 参考：https://agohack.com/getting-checkbox-with-map-and-each-in-jquery/
    // 行先の希望を取得する
    // リクエストのオブジェクトを設定する(希望日時と行先の希望をそれぞれ設定。例 {"hopeDate":["20221015","20221029"],"hopeDestination":"2"})
    // リクエストをAPIで送る(課題ではアラートでリクエストのjsonを出力してください)
    // モーダルを閉じる
};

/**
 * モーダルを開く
 */
const openModal = function () {
    $("#modal-background").removeClass("display-none");
};

/**
 * モーダルを閉じる
 */
const closeModal = function () {
    $("#modal-background").addClass("display-none");
};

/**
 * モーダルを親要素のイベントによって閉じさせないようにする
 */
const preventCloseModal = function (event) {
    event.stopPropagation();
};

$(function () {
    // 課題1 モーダル内のチェックボックスとプルダウンを設定する
    setUpModal();

    // 課題2 「回答する」を押下して、アンケート内容を送る
    $("#submit-button").on("click", submitModal);

    // モーダルの開閉を行う
    $("#open-button").on("click", openModal);
    $("#modal-background").on("click", closeModal);
    $("#modal-content").on("click", event => preventCloseModal(event));
});