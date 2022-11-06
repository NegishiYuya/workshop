package workshop

fun main(args: Array<String>) {
  /**
   * forEachを使って以下のnameListの文字列をを標準出力する処理を記載してください
   * 高階関数を使って2通り実装してください。
   * (1) 関数オブジェクトを使った実装
   * (2) ラムダ式を使った実装
   */
  val nameList = listOf("太郎", "花子")
  nameList.forEach(::printName)
  nameList.forEach { println(it) }
  /**
   * 以下のようなメソッドを実装し、実行してください。
   * 第1・2引数に数字をとる、第3引数に2数を使った計算処理を返却する.
   * 戻り値はなしで、関数の処理内で第1・2引数を用いた計算結果を出力する
   */
  calc(1, 2, ::plus)
  calc(1, 2) { n, m -> n - m }
}

/**
 * 引数で渡した文字列を出力する.
 *
 * @param name String 文字列
 */
fun printName(name: String) = println(name)

/**
 * 2つの数字を第3引数で渡した計算処理にて計算して結果を出力する
 * @param x Int 1つ目の数字
 * @param y Int 2つ目の数字
 * @param func (Int, Int) -> Int 計算処理
 */
fun calc(x: Int, y: Int, func: (Int, Int) -> Int) = println(func(x, y))

/**
 * 2つの数字を足して返却する
 * @param n1 Int 1つ目の数字
 * @param n2 Int 2つ目の数字
 * @return Int 計算結果
 */
fun plus(n1: Int, n2: Int) = n1 + n2