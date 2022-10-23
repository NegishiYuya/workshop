package workshop

/**
 * Listの操作に関する練習問題.
 */
fun main(args: Array<String>) {

  // 読み取り専用のListを作成してください
  val immutableIntList = listOf(1, 2, 3)

  // 変更可のListを作成してください
  val mutableStringList = mutableListOf("りんご", "みかん", "かぼちゃ")

  // 変更可のListに要素を追加してください
  mutableStringList.add("くり")

  // Listの長さを標準出力してください
  println(mutableStringList.size)

  // Listに対して任意の要素があるかどうかを判定させ、結果を標準出力してください
  println(mutableStringList.contains("もも"))
}