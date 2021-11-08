open class Hoge {
  fun hoge() {
    println("hoge")
  }
}

class Over : Hoge() {}

class Com {
  val hoge: Hoge = Hoge()

  fun hoge() {
    hoge.hoge()
  }
}

fun main() {
  Over().hoge()
  Com().hoge()
}