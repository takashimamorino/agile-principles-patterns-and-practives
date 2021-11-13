abstract class Human {
  fun start() {
    getUp()
    work()
    sleep()
  }

  abstract fun work()

  fun getUp() {
    println("起床")
  }

  fun sleep() {
    println("就寝")
  }
}

class Student : Human() {
  override fun work() {
    println("学校")
  }
}

class Adult : Human() {
  override fun work() {
    println("会社")
  }
}


fun main() {
  val student = Student()
  val adult = Adult()
  println("=== student ===")
  student.start()
  println("=== adult ===")
  adult.start()
}
