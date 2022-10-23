package workshop

/**
 * 条件分岐に関する練習問題.
 */
fun main(args: Array<String>) {
  /**
   * 変数resultに以下のように文字列を設定してください
   * pointがborder以上である場合⇒"合格"
   * 上記を満たさない場合⇒"不合格"
   */
  val point = 51
  val BORDER = 50
  val result = if (point >= BORDER) "合格" else "不合格"
  println(result)

  /**
   * 以下を条件分岐を使って実装してください
   * pointがborder未満である場合⇒"赤点"と標準出力
   * 上記を満たさない場合⇒何もしない
   */
  if (point < BORDER) {
    println("赤点")
  }

}