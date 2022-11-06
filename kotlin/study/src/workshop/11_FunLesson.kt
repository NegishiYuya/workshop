package workshop

fun main(args: Array<String>) {
  /**
   * forEachを使って以下のnameListの文字列をを標準出力する処理を記載してください
   * 高階関数を使って2通り実装してください。
   * (1) 関数オブジェクトを使った実装
   * (2) ラムダ式を使った実装
   */
  val nameList = listOf("太郎", "花子")

  /**
   * 以下のようなメソッドを実装し、実行してください。
   * 第1・2引数に数字をとる、第3引数に2数を使った計算処理を返却する.
   * 戻り値はなしで、関数の処理内で第1・2引数を用いた計算結果を出力する
   */
}

/**
 * 2つの数字を足して返却する
 * @param n1 Int 1つ目の数字
 * @param n2 Int 2つ目の数字
 * @return Int 計算結果
 */
fun plus(n1: Int, n2: Int) = n1 + n2