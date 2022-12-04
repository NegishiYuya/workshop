package additional

fun main(args: Array<String>) {

  /**
   * 問題1. 変更不可のListを作成してください。
   * 以下2件の要素を設定すること。
   * "小先生"
   * "中先生"
   */
  val immutableList = listOf(
    "小先生",
    "中先生"
  )
  println(immutableList)

  /**
   * 問題2. 変更不可のMapを作成してください。
   * 以下2件の要素を設定すること。
   * Key: 1 / value: "小先生"
   * Key: 2 / value: "中先生"
   */
  val immutableMap = mapOf(
    1 to "小先生",
    2 to "中先生"
  )
  println(immutableMap)

  /**
   * 問題3. 変更不可のSetを作成してください。
   * 以下3件の要素を設定すること。
   * "小先生"
   * "中先生"
   * "小先生"
   */
  val immutableSet = setOf(
    "小先生",
    "中先生",
    "小先生"
  )
  println(immutableSet)

  /**
   * 問題4. 変更可のListを作成してください。
   * 生成時に以下2件の要素を設定すること。
   * "小先生"
   * "中先生"
   *
   * 生成後に以下1件の要素を設定すること。
   * "大先生"
   */
  val mutableList = mutableListOf(
    "小先生",
    "中先生"
  )
  mutableList.add("大先生")
  println(mutableList)

  /**
   * 問題5. 変更可のMapを作成してください。
   * 要素は以下2件の要素を設定すること。
   * Key: 1 / value: "小先生"
   * Key: 2 / value: "中先生"
   *
   * 生成後に以下1件の要素を設定すること。
   * Key: 3 / value: "大先生"
   */
  val mutableMap = mutableMapOf(
    1 to "小先生",
    2 to "中先生"
  )
  mutableMap.put(3, "大先生")
  println(mutableMap)

  /**
   * 問題6. 変更可のSetを作成してください。
   * 以下2件の要素を設定すること。
   * "小先生"
   * "中先生"
   *
   * 生成後に以下1件の要素を設定すること。
   * "小先生"
   */
  val mutableSet = mutableSetOf(
    "小先生",
    "中先生"
  )
  mutableSet.add("小先生")
  println(mutableSet)

  /**
   * 問題7.
   * 以下のlistForQ7の中身を1件ずつに対して、
   * `${N}番目: ${N番目の要素}`の形式で出力してください.
   * ${N}番目は0始まりでよい.
   */
  val listForQ7 = listOf(
    "小先生",
    "中先生",
    "大先生"
  )
  listForQ7.forEachIndexed { index, value -> println("${index}番目: ${value}") }

  /**
   * 問題8.
   * 以下のlistForQ8について、以下の結果を出力してください.
   * ・すべての要素が3文字より長いか
   * ・すべての要素が2文字より長いか
   *
   */
  val listForQ8 = listOf(
    "小先生",
    "中先生",
    "大先生",
    "特大先生"
  )
  println(listForQ8.all { it.length > 3 })
  println(listForQ8.all { it.length > 2 })

  /**
   * 問題7.
   * 以下のlistForQ9について、以下の結果を出力してください.
   * ・どれか1つでも3文字より長い要素があるか
   * ・どれか1つでも4文字より長い要素があるか
   *
   */
  val listForQ9 = listOf(
    "小先生",
    "中先生",
    "大先生",
    "特大先生"
  )
  println(listForQ9.any { it.length > 3 })
  println(listForQ9.any { it.length > 4 })

  /**
   * 問題10.
   * 以下のlistFor10について、以下の結果を出力してください.
   * ・2文字より長い要素の件数
   * ・3文字より長い要素の件数
   *
   */
  val listForQ10 = listOf(
    "小先生",
    "中先生",
    "大先生",
    "特大先生"
  )
  println(listForQ10.count { it.length > 2 })
  println(listForQ10.count { it.length > 3 })

}