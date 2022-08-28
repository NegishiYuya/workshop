const master = {
    "holidayMaster": [
        { value: 1, label: "全休" },
        { value: 2, label: "半休" },
        { value: 3, label: "2時間休" },
    ],
    "employee": [
    ]
};

const CLASS_FOR_STYLE =
{
    "DISPLAY_NONE": "display-none",
    "ONEDAY_HOLIDAY": "oneday-holiday"
};

const makePullDownOptions = () => {
};

const output = () => {
};

const fliterHistory = () => {
};

$(function () {
    // 課題1 プルダウンを生成する
    $("select").append(makePullDownOptions());
    // 課題2 登録した内容を表示する
    $("#register-button").on("click", output);
    // 課題3 有休履歴にフィルターをかける
    $("#output-only-oneday-holiday").on("change", fliterHistory);
});