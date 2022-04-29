# アロー関数の復習

## 問題 1

以下をアロー関数を使わずに実装してください。

```javascript
const getTriangle = (bottom, height) => (bottom * height) / 2;
console.log(getTriangle(1, 3));
```

## 問題 2

以下のように 3 つの変数を使って、  
1 件のオブジェクトを作る関数をアロー関数を使って実装してください。

変換前：

```javascript
const name = 'ガジュマル';
const kind = 'クワ科イチジク属';
const flowerWord = '健康';
```

変換後：

```javascript
{
    name : "ガジュマル",
    kind : "クワ科イチジク属"
    flowerWord : "健康"
}
```

### 考え方

3 つの引数を使ってオブジェクトを返却させる

```javascript
// {name: "ガジュマル", kind: "クワ科イチジク属", flowerWord: "健康"} を返却させる
console.log(convertJson('ガジュマル', 'クワ科イチジク属', '健康'));
```

## 問題 3

以下のソースコード内の関数`printPlantInfo`を、仕様に沿って実装してください。

```javascript
const ficus = {
    name: 'ガジュマル',
    kind: 'クワ科イチジク属',
    flowerWord: '健康'
};
const parlorPalm = {
    name: 'テーブルヤシ',
    kind: 'ヤシ科カマエドレア属',
    flowerWord: 'あなたを見守る'
};

printPlantInfo(ficus);
printPlantInfo(parlorPalm);
```

### 仕様

以下がコンソールログに出力される。

```
植物の名前は「ガジュマル」、種は「クワ科イチジク属」、花言葉は「健康」です。
植物の名前は「テーブルヤシ」、種は「ヤシ科カマエドレア属」、花言葉は「あなたを見守る」です。
```
