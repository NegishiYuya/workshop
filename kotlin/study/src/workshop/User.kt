package workshop

/**
 * 以下のようなクラスを作成してください.
 * コンストラクタ：以下のプロパティを初期設定する.
 * 名前: String
 * 年齢: Int
 *
 * セカンダリコンストラクタ：以下のプロパティを初期設定する.
 * 名前: String
 * 年齢: 10を設定
 *
 * 関数：名前と年齢を標準出力する.
 */
class User(
  val name: String,
  val age: Int,
) {
  constructor(name: String) : this(
    name = name,
    age = 10
  )

  fun printUser() {
    println("名前:${name}, 年齢:${age}")
  }
}