/**
 * マスタ
 */
const masters = {
    // 交通手段
    "facilities": [
        { value: 0, label: "選択してください" },
        { value: 1, label: "IC利用" },
        { value: 2, label: "回数券利用" },
        { value: 3, label: "その他" },
    ],
    // 支払方法
    "payment": [
        { value: 1, label: "現金" },
        { value: 2, label: "振込" },
        { value: 3, label: "その他" },
    ]
};

/**
 * スタイル付与のための汎用クラス
 */
const CLASS_FOR_STYLE =
{
    "DISPLAY_NONE": "display-none",
    "USE_COUPON": "use-coupun"
};

/**
 * 画面で必要なプルダウンを生成する
 */
const makePullDowns = () => {
    // マスタを分割代入を用いて変数に設定する
    const { facilities, payment } = masters;
    // 交通手段のマスタからプルダウンを生成する
    makePullDown("input-facilities", facilities);
    // 支払方法のマスタからプルダウンを生成する
    makePullDown("input-payments", payment);
};

/**
 * 引数で指定したプルダウンに対して、プルダウンの要素を作って追加する
 * 
 * @param {*} id プルダウンのIDの文字列
 * @param {*} masterArray マスタの配列
 */
const makePullDown = (id, masterArray) => {
    const options = masterArray.map(master => `<option value="${master.value}">${master.label}</option>`);
    $(`#${id}`).append(options);
};

/**
 * 登録した内容を表示する
 */
const output = () => {
    // 入力値を取得する
    const inputDate = $("#input-date").val();
    const inputFrom = $("#input-from").val();
    const inputTo = $("#input-to").val();
    const inputCosts = Number($("#input-costs").val());
    const inputFacilities = Number($("#input-facilities").val());

    // 交通手段のラベルを取得する
    const { facilities } = masters;
    const inputFacilitiesText = facilities.find(master => {
        return master.value === inputFacilities;
    }).label;

    // 交通手段が「回数券利用」であれば表示要素にそれを表すクラスを付与する
    const outputFacilitiesClass = inputFacilities === 2 ? CLASS_FOR_STYLE.USE_COUPON : "";

    // 表示するためのli要素を生成する
    const outPutLiElement = `
        <li class="${outputFacilitiesClass}">
            <span>${inputDate}</span>
            <span>${inputFrom}～${inputTo}</span>
            <span>${inputCosts}円</span>
            <span>備考：${inputFacilitiesText}</span>
        </li>`;

    // ul要素にli要素をappendする
    $("#output-container ul").append(outPutLiElement);
};

const fliter = () => {
    // すべての履歴要素
    const liElementArray = $("#output-container li");
    // すべての履歴要素を非表示にする
    liElementArray.addClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`);
    // トグルボタンからの値を取得
    const checked = $("#use-coupon-only").prop("checked");
    // 表示要素を指定する
    const displayLiElementArray = checked ? liElementArray.filter(`.${CLASS_FOR_STYLE.USE_COUPON}`) : liElementArray;
    // 表示要素のみ表示させる
    displayLiElementArray.removeClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`);
};


$(function () {
    // 課題1 プルダウンを生成する
    makePullDowns();
    // 課題2 登録した内容を表示する
    $("#register-button").on("click", output);
    // 課題3 トグルボタン「回数券のみ表示」に応じて表示を切り替える
    $("#use-coupon-only").on("click", fliter);
});