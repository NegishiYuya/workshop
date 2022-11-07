package workshop

fun main(args: Array<String>) {

  printHelloWorld()
  printWords("文言1個目", "文言2個目")
  printWords(str1 = "文言1個目", str2 = "文言2個目")
  printWords("文言1個目", str2 = "文言2個目");
  println(concatWordsWithComma("文言1個目", "文言2個目"))
  println(concatWordsWithSlash("文言1個目", "文言2個目"))
  println(concatWords("文言1個目", "文言2個目", "_"))
  println(concatWords("文言1個目", "文言2個目"))
}

/**
 * 以下の関数を実装してください.
 * "HelloWorld"と出力する.
 *
 */
fun printHelloWorld() {
  println("HelloWorld")
}

/**
 * 以下の関数を実装してください.
 * 文字列1と文字列2を"/"でつないで出力する.
 * 呼び出しは変数名なし・変数名を2件とも指定・変数名を文字列2のみ指定で実装してください
 *
 * @param str1 文字列1
 * @param str2 文字列2
 */
fun printWords(str1: String, str2: String) {
  println("$str1, $str2")
}

/**
 * 以下の関数を実装してください.
 * 文字列1と文字列2を","でつないで返却する.
 * return キーワードを使って実装すること
 *
 * @param str1 文字列1
 * @param str2 文字列2
 * @return String 文字列1と文字列2を","でつないだ文字列
 */
fun concatWordsWithComma(str1: String, str2: String): String {
  return "$str1, $str2"
}

/**
 * 以下の関数を実装してください.
 * 文字列1と文字列2を"/"でつないで返却する.
 * return キーワードを使わずに実装すること
 *
 * @param str1 文字列1
 * @param str2 文字列2
 * @return String 文字列1と文字列2を"/"でつないだ文字列
 */
fun concatWordsWithSlash(str1: String, str2: String) = "$str1 / $str2"

/**
 * 以下の関数を実装してください.
 * 文字列1と文字列2をつなぎ文字でつないで返却する.
 *
 * @param str1 文字列1
 * @param str2 文字列2
 * @param delimiter 文字列のつなぎ文字(未指定の場合は"・")
 * @return String 文字列1と文字列2をつなぎ文字でつないだ文字列
 */
fun concatWords(str1: String, str2: String, delimiter: String = "・") = "$str1 $delimiter $str2"
