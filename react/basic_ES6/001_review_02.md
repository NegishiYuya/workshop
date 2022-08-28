## 総復習 2022/08/22

---

### 問題 1

以下の処理を実装してください。

#### 仕様

数字の配列に対して、1 つ 1 つの要素を 2 倍にして配列に設定して返す。

#### 解答

```javascript
const array = [1, 2, 3];
const twiceArray = array.map((num) => num * 2);
console.log(twiceArray);
```

---

### 問題 2

#### 仕様

数字の配列から奇数のもののみ抽出して配列に設定して返す。

#### 解答

```javascript
const array = [1, 2, 3];
const oddArray = array.filter((num) => num % 2 === 1);
console.log(oddArray);
```

---

### 問題 3

#### 仕様

以下のオブジェクトから name のみを抽出した配列を作ってください。

```javascript
const array = [
    { id: 1, name: 'コースティック', department: '営業部' },
    { id: 2, name: 'シア', department: '開発部' },
    { id: 3, name: 'ジブラルタル', department: '営業推進部' },
    { id: 4, name: 'ニューキャッスル', department: '営業推進部' },
    { id: 5, name: 'バンガロール', department: '営業部' },
    { id: 6, name: 'パスファインダー', department: '総務部' }
];
```

#### 解答

```javascript
const array = [
    { id: 1, name: 'コースティック', department: '営業部' },
    { id: 2, name: 'シア', department: '開発部' },
    { id: 3, name: 'ジブラルタル', department: '営業推進部' },
    { id: 4, name: 'ニューキャッスル', department: '営業推進部' },
    { id: 5, name: 'バンガロール', department: '営業部' },
    { id: 6, name: 'パスファインダー', department: '総務部' }
];

const convertedArray = array.map((obj) => obj.name);
console.log(convertedArray);
```

### 問題 4

#### 仕様

以下のオブジェクトから department のみを抽出した配列を作ってください。  
また、重複を排除すること。

```javascript
const array = [
    { id: 1, name: 'コースティック', department: '営業部' },
    { id: 2, name: 'シア', department: '開発部' },
    { id: 3, name: 'ジブラルタル', department: '営業推進部' },
    { id: 4, name: 'ニューキャッスル', department: '営業推進部' },
    { id: 5, name: 'バンガロール', department: '営業部' },
    { id: 6, name: 'パスファインダー', department: '総務部' }
];
```

#### 解答

```javascript
const array = [
    { id: 1, name: 'コースティック', department: '営業部' },
    { id: 2, name: 'シア', department: '開発部' },
    { id: 3, name: 'ジブラルタル', department: '営業推進部' },
    { id: 4, name: 'ニューキャッスル', department: '営業推進部' },
    { id: 5, name: 'バンガロール', department: '営業部' },
    { id: 6, name: 'パスファインダー', department: '総務部' }
];

const convertedArray = Array.from(new Set(array.map((obj) => obj.department)));
console.log(convertedArray);
```
