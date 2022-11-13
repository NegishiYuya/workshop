package workshop

class Manager(
  id: Int,
  name: String,
  val employeeIdList: List<Int>,
) : Employee(id, name) {
  override fun getEmployeeInfo() = "管理職 $id $name"
  fun aggregateAttendance() = println("${employeeIdList.size}人分の勤怠をまとめました")
}