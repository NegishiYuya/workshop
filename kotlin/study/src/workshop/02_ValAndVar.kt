package workshop

/**
 * valとvarの違いを説明するためのプログラムを作成してください
 */
fun main(args: Array<String>) {
  
  val immutableString = "変数immutableString: 変更前"
  var mutableString = "変数mutableString: 変更前"

  // immutableString = "変数immutableString: 変更後" valで宣言した変数は再代入不可
  mutableString = "変数mutableString: 変更後" // varで宣言した変数は再代入可
}