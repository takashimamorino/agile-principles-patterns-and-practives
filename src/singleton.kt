class NoSingleton {
  var x = 0

  fun getX() {
    x++
    println(x)
  }
}

// https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/object-declarations.html#%E3%82%AA%E3%83%96%E3%82%B8%E3%82%A7%E3%82%AF%E3%83%88%E3%81%AE%E5%AE%A3%E8%A8%80
object Singleton {
  var x = 0

  fun getX() {
    x++
    println(x)
  }
}

fun main() {
  val ins = NoSingleton()
  ins.getX()
  ins.getX()
  ins.getX()

  Singleton.getX()
  Singleton.getX()
  Singleton.getX()
}