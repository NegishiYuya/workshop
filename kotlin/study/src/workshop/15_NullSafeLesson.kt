package workshop

fun main(args: Array<String>) {

  // 以下3つの変数の違いについて説明してください
  val nonNullString: String = "nonNull"
  val nullAbleString: String? = "nullAble"
  val nullString: String? = null

  // 以下の変数の値にnullAbleStringを代入してください
  val castString: String = nullAbleString!!

  /**
   * 変数nonNullString・nullAbleString・nullStringの文字列長を標準出力してください
   * 文字列長としてnullが返却される場合については"empty"という文字列を出力すること
   * if文を使わずに実装すること
   */
  println(nonNullString.length)
  println(nullAbleString?.length)
  println(nullString?.length ?: "empty")

  /**
   * nullAbleStringの文字列長を以下条件にしたがって、標準出力してください
   *
   * ・nullAbleStringがnullでないときのみ出力する
   * ・if文を使い、セーフコール演算子は使わずに実装すること
   */
  if (nullAbleString != null) println(nullAbleString.length)
}