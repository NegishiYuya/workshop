## 総復習 2022/09/25

---

### 問題 1

以下のコードを改善してください。

```js
const employee = {
    id: 1,
    name: '技研太郎'
};
console.log('私は' + employee.name + 'です。社員番号は' + employee.id + 'です');
```

### 問題 2

以下のコードは、const で宣言した値の一部を変更している。  
このコードがエラーにならない理由を答えてください。

```js
const employee = {
    id: 1,
    name: '技研太郎'
};
employee.id = 2;
```

### 問題 3

以下を満たす関数を実装してください。

-   引数に「価格」「税率」を受けとって、戻り値として「税込み価格」を返却する。
-   「税率」は未設定の場合もある。その場合は「税率」を 10%とすること。
-   if 文は使ってはいけない。

### 問題 4

以下の配列を分割してください。

分割対象の配列

```js
const array = [1, 2, 3, 4];
```

分割した結果

```js
console.log(firstElement); // 1 と出力される
console.log(secondElement); // [2,3,4]と出力される
```

### 問題 5

以下のオブジェクトを結合してください。

結合対象の配列

```js
const firstObject = { key1: 'val1', key2: 'val2' };
const secondObject = { key3: 'val3' };
```

結合した結果

```js
console.log(mergedObject); //  { key1: 'val1', key2: 'val2', key3: 'val3' } と出力される
```

### 問題 6

以下のコードを改善してください。

```js
const isEmptyArray = function (array) {
    if (!array || array.length === 0) {
        return true;
    } else {
        return false;
    }
};
```

実行イメージ

```js
console.log(isEmptyArray()); // trueと出力される
console.log(isEmptyArray([])); // trueと出力される
console.log(isEmptyArray([1, 2])); // falseと出力される
console.log(convertTextIfNeed('textString')); // textStringと出力される
```

### 問題 7

以下のコードを改善してください。

```js
const convertTextIfNeed = function (text) {
    if (text === '' || text === null || text === undefined) {
        return 'emptyText';
    } else {
        return text;
    }
};
```

実行イメージ

```js
console.log(convertTextIfNeed()); // emptyTextと出力される
console.log(convertTextIfNeed(null)); // emptyTextと出力される
console.log(convertTextIfNeed('')); // emptyTextと出力される
console.log(convertTextIfNeed('textString')); // textStringと出力される
```

### 問題 8

以下の配列 array を加工して、新しい配列を作ってください。

```js
const array = [
    { id: 1 },
    { id: 2 },
    { id: 3 },
    { id: 4 },
    { id: 5 },
    { id: 6 }
];
```

加工後の配列

```js
const array = [
    { id: 1 },
    { id: 2 },
    { id: 3 },
    { id: 4 },
    { id: 5 },
    { id: 6 }
];
console.log(JSON.stringify(newArray)); // [{"id":1},{"id":3},{"id":5}] と出力される
```

### 問題 9

以下の配列 array を加工して、新しい配列を作ってください。

```js
const array = [1, 2, 3, 4, 5, 6];
```

加工後の配列

```js
const array = [1, 2, 3, 4, 5, 6];
console.log(JSON.stringify(newArray)); // [{"id":1},{"id":2},{"id":3},{"id":4},{"id":5},{"id":6}] と出力される
```

### 問題 10

以下のコードを改善してください。

```js
const array = [1, 2, 3, 4, 5, 6];
for (let index = 0; index < array.length; index++) {
    console.log(array[index]);
}
```

### 問題 11

配列の持つ find メソッドと filter メソッドの違いを説明してください。

#### 解答

find メソッドは配列から条件に一致した最初の値を返す。  
filter メソッドは配列から条件に一致した値をすべて返す。

参考：https://qiita.com/kuro_96/items/3620dfbb9482bd16945d

### 問題 12

以下の配列 array を加工して、新しい配列を作ってください。

```js
const array = [
    { id: 1, name: '名前1', workPlace: '東京支店' },
    { id: 2, name: '名前2', workPlace: '九州支店' },
    { id: 3, name: '名前3', workPlace: '九州支店' },
    { id: 4, name: '名前4', workPlace: '東京支店' }
];
```

加工後の配列

```js
const array = [
    { id: 1, name: '名前1', workPlace: '東京支店' },
    { id: 2, name: '名前2', workPlace: '九州支店' },
    { id: 3, name: '名前3', workPlace: '九州支店' },
    { id: 4, name: '名前4', workPlace: '東京支店' }
];
/**
 * [{"id":1,"isWorkingInTokyo":true},{"id":2,"isWorkingInTokyo":false},{"id":3,"isWorkingInTokyo":false},{"id":4,"isWorkingInTokyo":true}]
 * と出力される
 * isWorkingInTokyoは「東京勤務」を表す
 */
console.log(JSON.stringify(newArray));
```
