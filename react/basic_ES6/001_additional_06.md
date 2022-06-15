# スプレッド構文などの復習

### 問題 1

以下のコードの違いを説明してください。

```javascript
const array1 = [1, null, [`ソフト花子`, `登戸 次郎`]];
const array2 = array1;
array2[0] = { name: `技研 太郎` };
```

```javascript
const array1 = [1, null, [`ソフト花子`, `登戸 次郎`]];
const array2 = [...array1];
array2[0] = { name: `技研 太郎` };
```

### 問題 2

任意のオブジェクトをディープコピーする関数を作ってください。

### 問題 3

以下の配列を加工する関数を作ってください。

#### 仕様

-   元の配列(関数の引数として渡す値)

```javascript
[なし, 1, 2, 3, 4, 5];
```

-   1 番目の要素以外に接尾辞として文言「回以上」をつける
-   スプレッド構文を使って、実装をすること
-   元の配列はそのまま維持されること

### 問題 4

`use strict` を規模の大きいプロジェクトで使う際の注意点を説明してください。

### 問題 5

以下の if 文の違いを説明してください。

```javascript
const numberOne = 1;
const numberString = '1';

if (numberOne === numberString) {
    console.log(`比較1`);
}
if (numberOne == numberString) {
    console.log(`比較2`);
}
```
