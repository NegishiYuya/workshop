# IE で使えない JavaScript の構文について 補足

## IE では ES6(EcmaScript6)から導入された文法がほぼ使えない

[IE でアロー関数が使えなかった話 - gsol-dev's blog](https://gsol.hatenablog.com/entry/2020/12/23/IE%E3%81%A7%E3%82%A2%E3%83%AD%E3%83%BC%E9%96%A2%E6%95%B0%E3%81%8C%E4%BD%BF%E3%81%88%E3%81%AA%E3%81%8B%E3%81%A3%E3%81%9F%E8%A9%B1_)

上記記事内の以下の文章が重要  
アロー関数のみならず、ES6(EcmaScript6)から導入された文法がほぼ使えないということ。

```
JavaScriptにはES〇〇（数字または西暦）の名前でバージョンが複数存在します。
2015年以降は毎年新しいバージョンがリリースされています。

それに対し、IEは最新バージョンに対応していないため、
過去にリリースされたJavaScriptの機能には対応できても、
一部の新しい機能には対応できないという状況になっています。

IEではES5（2009年リリース）までが使用可能ですが、アロー関数はES6（2015年リリース）から実装された関数であるため、IEではアロー関数が使えないのです。

以下ES6の各ブラウザ対応表です。（IEは真っ赤ですね。。。）
http://kangax.github.io/compat-table/es6/
```

IE で使えない ES6 から導入された JavaScript の文法は以下にまとめられているので、  
実装時はぜひ参照されたい。  
[注意！IE11 で使えない最新 JavaScrit コード（ES6） – console dot log](https://blog.capilano-fw.com/?p=1273)

以下の記事でhttps://babeljs.io/　というサイトで IE でも動かせるコードに変換できることが紹介されている。(詳細未調査のため、使うときは要調査)  
[【JavaScript】IE でアロー関数が効かなくて悲しくなった | Zakkuri ブログ](https://zakkuri.life/%E3%80%90javascript%E3%80%91ie%E3%81%A7%E3%82%A2%E3%83%AD%E3%83%BC%E9%96%A2%E6%95%B0%E3%81%8C%E5%8A%B9%E3%81%8B%E3%81%AA%E3%81%8F%E3%81%A6%E6%82%B2%E3%81%97%E3%81%8F%E3%81%AA%E3%81%A3%E3%81%9F/)
