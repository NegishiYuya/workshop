# 分割代入の復習

## 問題 1

以下を分割代入を用いない実装に書き換えてください。

```javascript
const nameArray = ['登戸', '宿河原', '久地'];
const [name1, , name2] = nameArray;
console.log(name1);
console.log(name2);
```

## 問題 2

以下を分割代入を用いない実装に書き換えてください。

```javascript
const bar = {
    name: "Will'S BAR",
    address: 'https://www.willwillstation.com/entry/road-to-willsbar'
};
const { name, address } = bar;
console.log(name);
console.log(address);
```

## 問題 3

以下を分割代入を用いた実装に書き換えてください。

```javascript
const user = {
    id: 1,
    name: '技研太郎'
};
const userId = user.id; // 変数名はuserIdとすること
const userName = user.name; // 変数名はuserNameとすること
console.log(userId);
console.log(userName);
```

## 問題 4

以下を分割代入を用いた実装に書き換えてください。

```javascript
const company = {
    name: '神奈川ソフト技研',
    address: {
        zip: '214-0014',
        prefecture: '神奈川'
    }
};
const companyName = company.name; // 変数名はcompanyNameとすること
const companyZip = company.address.zip; // 変数名はcompanyZipとすること
console.log(companyName);
console.log(companyZip);
```
