# 関数のデフォルト値の復習

## 問題 1

以下の処理を書き換えてください。

```javascript
const getUser = (name, age = 28) => `${name}さん ${age}歳`;
console.log(getUser('技研太郎'));
```

### 書き換えの仕様

関数の引数のデフォルト値は使ってはいけない。


### 解答

```javascript
const getUser = function (name, age) {
  if (!age) {
    age = 28;
  }
  return `${name}さん ${age}歳`;
};
console.log(getUser("技研太郎"));
```