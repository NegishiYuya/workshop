/**
 * 有休マスタ
 */
const master = {
    "holidayMaster": [
        { value: 1, label: "全休" },
        { value: 2, label: "半休" },
        { value: 3, label: "2時間休" },
    ],
    "employee": [
    ]
};

/**
 * スタイル付与のための汎用クラス
 */
const CLASS_FOR_STYLE =
{
    "DISPLAY_NONE": "display-none",
    "ONEDAY_HOLIDAY": "oneday-holiday"
};

/**
 * プルダウンを作成する
 * @returns Array プルダウンの要素
 */
const makePullDownOptions = () => {
    // 分割代入を使って、masterのオブジェクトから有休マスタを取得する
    const { holidayMaster } = master;
    // 有休マスタからプルダウンを生成する
    return holidayMaster.map(master => `<option value="${master.value}">${master.label}</option>`);
};

/**
 * 登録した内容を表示する
 */
const output = () => {
    // 入力値を取得する
    const inputDate = $("#input-date").val();
    const inputPeriod = Number($("#input-period").val());

    // 有休マスタから入力した期間に合致するラベルを取得する
    const { holidayMaster } = master;
    const inputPeriodText = holidayMaster.find(master => {
        return master.value === inputPeriod;
    }).label;

    // 取得した有休が「全休」であれば表示要素にそれを表すクラスを付与する
    const onedayHolidayClass = inputPeriod == 1 ? CLASS_FOR_STYLE.ONEDAY_HOLIDAY : "";

    // 表示するためのli要素を生成する
    const outPutLiElement = `
        <li class="${onedayHolidayClass}">
            <span>${inputDate}</span>
            <span class="icon">${inputPeriodText}</span>
        </li>`;

    // ul要素にli要素をappendする
    $("#output-container ul").append(outPutLiElement);
};

/**
 * 有休履歴にフィルターをかける
 */
const fliterHistory = () => {
    // すべての履歴要素
    const liElementArray = $("#output-container li");
    // すべての履歴要素を非表示にする
    for (const liElement of liElementArray) {
        $(liElement).addClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`);
    }
    // チェックボックスの状態を取得
    const checked = $("#output-only-oneday-holiday").prop("checked");
    /**
     * 表示対象を指定する
     * チェックボックスがONの場合 ⇒ 「全休」の履歴のみ
     * チェックボックスがOFFの場合 ⇒ すべての履歴要素
     */
    let displayLiElementArray = checked ? liElementArray.filter(`.${CLASS_FOR_STYLE.ONEDAY_HOLIDAY}`) : liElementArray;
    // 表示対象のみ表示させる
    for (const liElement of displayLiElementArray) {
        $(liElement).removeClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`);
    }
};

$(function () {
    // 課題1 プルダウンを生成する
    $("select").append(makePullDownOptions());
    // 課題2 登録した内容を表示する
    $("#register-button").on("click", output);
    // 課題3 有休履歴にフィルターをかける
    $("#output-only-oneday-holiday").on("change", fliterHistory);
});