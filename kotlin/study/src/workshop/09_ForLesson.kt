package workshop

/**
 * 繰り返しに関する練習問題.
 */
fun main(args: Array<String>) {

  // 以下のListの中身を繰り返し処理を使って標準出力してください
  val stringList: List<String> = listOf("牡牛座", "牡羊座", "双子座")
  for (str in stringList) {
    println(str)
  }
}