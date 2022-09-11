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
    // 交通手段のマスタからプルダウンを生成する
    // 支払方法のマスタからプルダウンを生成する
};

/**
 * 引数で指定したプルダウンに対して、プルダウンの要素を作って追加する
 * 
 * @param {*} id プルダウンのIDの文字列
 * @param {*} masterArray マスタの配列
 */
const makePullDown = (id, masterArray) => {
};

/**
 * 登録した内容を表示する
 */
const output = () => {
    // 入力値を取得する
    // 交通手段のラベルを取得する
    // 交通手段が「回数券利用」であれば表示要素にそれを表すクラスを付与する
    // 表示するためのli要素を生成する
    // ul要素にli要素をappendする
};

const fliter = () => {
    // すべての履歴要素
    // すべての履歴要素を非表示にする
    // トグルボタンからの値を取得
    // 表示要素を指定する
    // 表示要素のみ表示させる
};


$(function () {
    // 課題1 プルダウンを生成する
    // 課題2 登録した内容を表示する
    // 課題3 トグルボタン「回数券のみ表示」に応じて表示を切り替える
});