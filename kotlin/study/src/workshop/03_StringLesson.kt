package workshop

/**
 * 文字列の操作に関する練習問題.
 */
fun main(args: Array<String>) {

  val testString = "I can use kotlin.You can use kotlin."

  // testStringをすべて小文字にして標準出力させてください
  println(testString.lowercase())

  // testStringをすべて大文字にして標準出力させてください
  println(testString.uppercase())

  // testStringの文字数を標準出力させてください
  println(testString.length)

  // testStringが0文字もしくはnullかどうかを判定し、標準出力させてください
  println(testString.isNullOrEmpty())

  // testStringが0文字かどうかを判定し、標準出力させてください
  println(testString.isEmpty())

  // 下の変数subjectを使って"We can use kotlin."という文字列を標準出力させてください。(ただし、記号"+"は使ってはいけない)
  val subject = "We"
  println("$subject can use kotlin.")
}