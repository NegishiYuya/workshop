# JavaScript の構文について 補足

## JavaScript での for 文の書き方

-   [【for/forEach/jQuery.each】JavaScript で foreach するためのコードと速度の比較！](https://www.creativevillage.ne.jp/72411)
    -   JavaScript には 4 通りの for の書き方がある。(記事で扱われているもののうち、1 種類は jQuery の構文)
        -   `for`
        -   `for in`
        -   `for of`
        -   `forEach`
-   [【JavaScript の基本】配列の繰り返し処理に使えるメソッド forEach とは？for 文との違いも解説 | ワードプレステーマ TCD](https://tcd-theme.com/2021/07/javascript-foreach.html)
    -   `for` や `for of` は `break` や `continue` を使える
    -   `forEach`はインデックスを使いやすい
-   [JavaScript で forEach を使うのは最終手段 - Qiita](https://qiita.com/diescake/items/70d9b0cbd4e3d5cc6fce)
    -   繰り返して、「何か」をする場合は`filter`、`find`、`map`、`reduce`などの使用も有効

## アロー関数

-   [JavaScript アロー関数を説明するよ - Qiita](https://qiita.com/may88seiji/items/4a49c7c78b55d75d693b)
    -   関数を`(引数,...)=>{...関数の本体...}`の形式で書くことができる。
    -   引数の数などによって省略記法がある。
-   [【JavaScript】１分で理解する！=>アロー関数の基本 | ビズドットオンライン](https://it-biz.online/web-design/arrow-function/#toc1)
-   [【JavaScript】アロー関数式を学ぶついでに this も復習する話 - Qiita](https://qiita.com/mejileben/items/69e5facdb60781927929)
    -   `thisが指す対象`がアロー関数と通常の関数では異なる、ということ。
