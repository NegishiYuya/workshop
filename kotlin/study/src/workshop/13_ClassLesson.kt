package workshop

/**
 * resources/13_ClassLesson.pdfに記載のクラス群を作成し、
 * メソッドの呼び出し処理を実装してください.
 */
fun main(args: Array<String>) {
  val employee = Employee(1, "クリプト")
  println(employee.getEmployeeInfo())

  val manager = Manager(2, "ヴァンテージ", listOf(1, 3))
  println(manager.getEmployeeInfo())
  manager.aggregateAttendance()
}