package workshop

class Developer(val programmingLanguage: String) : InterfaceEmployee {
  override fun printCurrentWork() = println("私は${programmingLanguage}を使って開発をしています")
}