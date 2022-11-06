package workshop

/**
 * 範囲の操作に関する練習問題.
 */
fun main(args: Array<String>) {
  // 1から10までの範囲を表すオブジェクトを作成してください
  val intRange: IntRange = 1..10

  // 3が1から10までの範囲に含まれるかを判定し、結果を標準出力させてください
  println(3 in intRange)

  // 1から10までの範囲オブジェクトから数字のListを作成してください
  val listFromIntRange = intRange.toList()
  println(listFromIntRange)
}