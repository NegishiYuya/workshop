## 総復習 2022/09/12

問題の解答は以下に作成してください。  
https://codesandbox.io/

---

### 問題 1

以下の処理を if 文を使わずに実装してください。

```js
let onedayHolidayClass;
if (inputPeriod === 1) {
    onedayHolidayClass = 'oneday-holiday';
} else {
    onedayHolidayClass = '';
}
```

### 問題 2

以下のオブジェクトから分割代入を使って、holidayMaster のみを変数に代入してください。

```js
const master = {
    holidayMaster: [
        { value: 1, label: '全休' },
        { value: 2, label: '半休' },
        { value: 3, label: '2時間休' }
    ],
    employee: []
};
```

### 問題 3

以下の配列からプルダウンの要素を作ってください。

```js
const holidayMaster = [
    { value: 1, label: '全休' },
    { value: 2, label: '半休' },
    { value: 3, label: '2時間休' }
];
```
