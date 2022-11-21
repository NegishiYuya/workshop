package workshop

/**
 * resources/14_InterfaceLesson.pdfに記載のインタフェースクラス群を作成し、
 * メソッドの呼び出し処理を実装してください.
 */
fun main(args: Array<String>) {
  val sales: InterfaceEmployee = Sales()
  sales.printCurrentWork()

  val developer: InterfaceEmployee = Developer("kotlin")
  developer.printCurrentWork()
}