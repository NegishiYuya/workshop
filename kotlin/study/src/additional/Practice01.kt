package additional

/**
 * println内に設定されている問題文を解いてください.
 */
fun main(args: Array<String>) {
  val stringList = listOf(
    "ホゲータ",
    "アチゲータ",
    "ラウドボーン",
    "ニャオハ",
    "クワッス",
    "ウェルカモ",
    "ウェーニバル",
    "ニャオハ",
    "ニャローテ",
    "マスカーニャ",
    "アチゲータ"
  )
  val testString = "ピカチュウ"
  val testStringList = listOf(
    "ホゲータ",
    "アチゲータ",
    "ラウドボーン"
  )
  val targetString = "アチゲータ"
  val targetStringFromLast = "ニャオハ"

  println("問題1. for文を使い、変数stringListの要素1件ずつを標準出力してください。")
  for (element in stringList) println(element)

  println("問題2. for文を使わずに、変数stringListの要素1件ずつを標準出力してください")
  stringList.forEach { println(it) }

  println("問題3. 変数stringListの長さを標準出力してください")
  println(stringList.size)

  println("問題4. 変数stringListが変数testStringの値を含むかどうかを標準出力してください")
  println(stringList.contains(testString))

  println("問題5. 変数stringListが以下のtestStringListの値をすべて含むかどうかを標準出力してください")
  println(stringList.containsAll(testStringList))

  println("問題6. 変数stringListの3番目の要素を標準出力してください。2通り実装すること")
  println(stringList.get(2))
  println(stringList[2])

  println("問題7. 変数stringListについて以下のtargetStringが初めて登場するインテックスを標準出力してください")
  println(stringList.indexOf(targetString))

  println("問題8. 変数stringListについて以下のtargetStringFromLastが初めて登場するインテックスを標準出力してください")
  println(stringList.lastIndexOf(targetStringFromLast))

  println("問題9. 変数stringListが空かどうかを標準出力してください")
  println(stringList.isEmpty())

  println("問題10. 変数stringListが空でないかどうかを標準出力してください")
  println(stringList.isNotEmpty())
  
}