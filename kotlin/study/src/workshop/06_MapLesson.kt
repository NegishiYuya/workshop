package workshop

/**
 * Mapの操作に関する練習問題.
 */
fun main(args: Array<String>) {

  // 読み取り専用のMapを作成してください
  val immutableMap: Map<String, String> = mapOf("hoge" to "fuga")

  // 変更可のMapを作成してください
  val mutableMap: MutableMap<String, String> = mutableMapOf("fuga" to "bar")

  // 変更可のMapに要素を追加してください
  mutableMap["baz"] = "hoge"

  // Mapに任意のキーがあるかを判定させさせ、結果を標準出力してください
  println(mutableMap.containsKey("baz"))

}