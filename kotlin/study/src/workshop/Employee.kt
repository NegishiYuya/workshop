package workshop

open class Employee(
  val id: Int,
  val name: String,
) {
  open fun getEmployeeInfo() = "$id $name"
}