# filterの復習

### 問題 1

以下の配列から以下のような配列を作ってください。

#### 元の配列

```javascript
const array = [1, 2, 3, 4, 5, 6];
```

#### 作成イメージ

```javascript
[1, 3, 5];
```

### 問題 2

以下の配列から以下のような配列を作ってください。

#### 元の配列

```javascript
const array = [
  { id: 1, name: "登戸　太郎", address: "神奈川県" },
  { id: 2, name: "神奈川　次郎", address: "神奈川県" },
  { id: 3, name: "九州　太郎", address: "福岡県" },
  { id: 4, name: "埼玉　花子", address: "埼玉県" },
  { id: 5, name: "横浜　太郎", address: "神奈川県" }
];
```

#### 作成イメージ

```javascript
[
  { id: 1, name: "登戸　太郎", address: "神奈川県" },
  { id: 3, name: "九州　太郎", address: "福岡県" },
  { id: 5, name: "横浜　太郎", address: "神奈川県" }
];
```

### 問題 3

以下の配列から以下のような配列を作ってください。

#### 元の配列

```javascript
const array = [
  { id: 1, name: "登戸　太郎", address: "神奈川県" },
  { id: 2, name: "神奈川　次郎", address: "神奈川県" },
  { id: 3, name: "九州　太郎", address: "福岡県" },
  { id: 4, name: "埼玉　花子", address: "埼玉県" },
  { id: 5, name: "横浜　太郎", address: "神奈川県" }
];
```

#### 作成イメージ

```javascript
[
  { id: 1, name: "登戸　太郎", address: "神奈川県" },
  { id: 5, name: "横浜　太郎", address: "神奈川県" }
];
```