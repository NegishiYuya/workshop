package workshop

fun main(args: Array<String>) {

  /**
   * resources/16_DataClassLesson.xlsxに記載のクラスし、
   * 同ファイルに記載している変数「1人目」と「2人目」を本メソッドに定義してください
   * また、作成した変数を標準出力して結果を確認してください
   */
  val member01 = Member(
    name = "一人目太郎",
    email = "member01@example.com",
    age = 30
  )
  member01.address = "神奈川県"
  member01.education = "大学院卒業"
  println(member01)

  val member02 = Member(
    name = "二人目太郎",
    email = "member02@example.com"
  )
  println(member02)

  /**
   * resources/16_DataClassLesson.xlsxに記載の変数「3人目」を
   * 「1人目」をコピーしたうえで本メソッドに定義してください
   * また、作成した「3人目」と「1人目」を"=="で比較した結果を確認してください
   */
  val member03 = member01.copy()
  member03.address = "東京都"
  member03.education = "高校卒業"
  println(member01 == member03)

  /**
   * resources/16_DataClassLesson.xlsxに記載の変数「4人目」を
   * 「1人目」をコピーしたうえで本メソッドに定義してください
   * また、作成した変数を標準出力して結果を確認してください
   */
  val member04 = member01.copy(
    name = "四人目太郎"
  )
  member04.address = "神奈川県"
  member04.education = "大学院卒業"
  println(member04)
}