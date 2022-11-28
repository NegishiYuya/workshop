package workshop

data class Member(
  val name: String,
  var email: String,
  val age: Int = 30,
) {
  var address: String = "東京都"
  var education: String? = null
}