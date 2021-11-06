interface IFoo {
  fun foo()
}

class Bar : IFoo {
  override fun foo() {
    println("bar")
  }
}

class Hoge : IFoo {
  override fun foo() {
    println("hoge")
  }
}

fun main() {
  fun exec(foo: IFoo) {
    foo.foo()
  }

  exec(Bar())
}