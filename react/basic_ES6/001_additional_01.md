# テンプレートリテラルの復習

## 問題 1

以下のコードを修正して、「私の名前は技研太郎です。年齢は 32 です。」とコンソールに出力されるようにしてください。

```javascript
const user = { name: '技研太郎', age: 32 };
console.log('私の名前は%{user.name}です。年齢は%{user.age}です。');
```

### 解答

```javascript
const user = { name: '技研太郎', age: 32 };
console.log(`私の名前は${user.name}です。年齢は${user.age}です。`);
```

「囲む文字がバッククォートであること」、「変数は$を使って表現すること」がポイント。

## 問題 2

以下の配列を使い、人数分だけ「私の名前は ○○ です。年齢は ×× です。」とコンソールに出力されるようにしてください。
○○ と ×× には動的に名前と年齢を出力させること。

```javascript
const userArray = [
    {
        name: '技研 太郎',
        age: 15
    },
    {
        name: 'ソフト 花子',
        age: 22
    },
    {
        name: '登戸 次郎',
        age: 23
    }
];
```

### 解答

```javascript
const userArray = [
    {
        name: '技研 太郎',
        age: 15
    },
    {
        name: 'ソフト 花子',
        age: 22
    },
    {
        name: '登戸 次郎',
        age: 23
    }
];
userArray.forEach(function (user) {
    console.log(`私の名前は${user.name}です。年齢は${user.age}です。`);
});
```

「配列のループに forEach を使うこと」がポイント。  
参考：https://developer.mozilla.org/ja/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach

## 問題 3

以下の商品について「商品名は ○○ です。税込みは ×× 円です。」とコンソールに出力されるようにしてください。  
金額はすべて税抜きです。

```
商品1 100 円
商品2 50 円
商品3 60 円
```

### 解答

```javascript
const goodsArray = [
    {
        name: '商品名1',
        price: 100
    },
    {
        name: '商品名2',
        price: 50
    },
    {
        name: '商品名3',
        price: 60
    }
];
goodsArray.forEach(function (goods) {
    console.log(
        `商品名は${goods.name}です。税込みは${Math.ceil(
            goods.price * 1.08
        )}円です。`
    );
});
```

「${}の中で式も扱えること」「Math.celi(数値)で小数点の切り上げができること」がポイント。
