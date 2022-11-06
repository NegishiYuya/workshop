package workshop

fun main(args: Array<String>) {
  /**
   * クラスUserのインスタンスを生成して、メソッドを実行してください
   * プライマリコンストラクタを使用すること
   */
  val user = User(name = "太郎", age = 32)
  user.printUser()

  /**
   * クラスUserのインスタンスを生成して、メソッドを実行してください
   * セカンダリコンストラクタを使用すること
   */
  val defaultUser = User(name = "次郎")
  defaultUser.printUser()
}