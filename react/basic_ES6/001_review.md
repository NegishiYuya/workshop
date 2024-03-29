## 総復習 2022/06/02

---

### 問題1

以下の関数を実装してください。  

#### 仕様

* 三角形の面積を算出する。  
   * 引数には「底辺」「高さ」を持つ。 
* 関数は1行で実装すること 

#### 解答

```javascript
const calcTriangleArea = (width, height) => (width * height) / 2;
// console.log(calcTriangleArea(1, 2));
```

### 問題2

以下の関数を実装してください。  

#### 仕様

* 引数で与えた商品の税込価格を算出する。 
   * 引数には「税抜価格」「税率」を持つ。
   * 「税率」は関数の呼び出し元で設定されていない場合は`10%`を設定すること。

#### 解答

```javascript
const getPriceIncludingTax = (price, taxRate = 10 * 0.01) =>
  price + price * taxRate;
// console.log(getPriceIncludingTax(100));
// console.log(getPriceIncludingTax(100, 8 * 0.01));
```

### 問題3

以下の配列から仕様を満たす配列に作り替えるコードを書いてください。  

#### 仕様

* 以下の配列から`department`が「営業部」のもののみ抽出する。 

```javascript
const array = [
  { id: 1, name: "コースティック", department: "営業部" },
  { id: 2, name: "シア", department: "開発部" },
  { id: 3, name: "ジブラルタル", department: "営業推進部" },
  { id: 4, name: "ニューキャッスル", department: "営業推進部" },
  { id: 5, name: "バンガロール", department: "営業部" },
  { id: 6, name: "パスファインダー", department: "総務部" }
];
```

#### 解答

```javascript
const array = [
  { id: 1, name: "コースティック", department: "営業部" },
  { id: 2, name: "シア", department: "開発部" },
  { id: 3, name: "ジブラルタル", department: "営業推進部" },
  { id: 4, name: "ニューキャッスル", department: "営業推進部" },
  { id: 5, name: "バンガロール", department: "営業部" },
  { id: 6, name: "パスファインダー", department: "総務部" }
];
const salesArray = array.filter((element) => element.department === "営業部");
// console.log(salesArray);
// console.log(JSON.stringify(salesArray));
```


### 問題4

以下の関数を実装してください。  

#### 仕様

* 引数で与えた「名前」と「年齢」を使って情報を出力する。 
   * コンソールのログに、文言「名前は`[引数として与えた名前]`です。年齢は``[引数として与えた年齢]`です。」と出力すること。
   * アラートに、文言「名前は`[引数として与えた名前]`です。年齢は``[引数として与えた年齢]`です。」と出力すること。

#### 解答

```javascript
const printUserInfo = (name, age) => {
  const message = `名前は${name}です。年齢は${age}です。`;
  console.log(message);
  alert(message);
};
// printUserInfo("ぎけん太郎", 28);
```

### 問題5

以下の配列から仕様を満たす配列に作り替えるコードを書いてください。  

#### 仕様

配列の要素1件につき、「名前は`[社員名(name)]` 部署名は`[部署名(department)]`です`」という文字列に変換する。 
変換後、6件の文字列を持つ、配列ができる。


```javascript
const array = [
  { id: 1, name: "コースティック", department: "営業部" },
  { id: 2, name: "シア", department: "開発部" },
  { id: 3, name: "ジブラルタル", department: "営業推進部" },
  { id: 4, name: "ニューキャッスル", department: "営業推進部" },
  { id: 5, name: "バンガロール", department: "営業部" },
  { id: 6, name: "パスファインダー", department: "総務部" }
];
```

#### 解答

```javascript
const array = [
  { id: 1, name: "コースティック", department: "営業部" },
  { id: 2, name: "シア", department: "開発部" },
  { id: 3, name: "ジブラルタル", department: "営業推進部" },
  { id: 4, name: "ニューキャッスル", department: "営業推進部" },
  { id: 5, name: "バンガロール", department: "営業部" },
  { id: 6, name: "パスファインダー", department: "総務部" }
];
const staffArray = array.map(
  (element) => `名前は${element.name} 部署名は${element.department}です`
);
// console.log(staffArray);
```

### 問題6

以下の仕様を満たすように、コードを追加実装してください。

#### 仕様

* コンソールに「アッシュ」「クリプト」と出力すること。
*  ソースコード内のコメントの「ここを実装」の箇所は1行で実装すること。

```javascript
const nameArray = ["アッシュ", "オクタン", "クリプト"];
// ここを実装
console.log(name1);
console.log(name2);
```

#### 解答

```javascript
const nameArray = ["アッシュ", "オクタン", "クリプト"];
const [name1, , name2] = nameArray;
console.log(name1);
console.log(name2);
```
