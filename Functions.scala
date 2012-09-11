#!/bin/bash
scala $0 $@
exit
!#

/*
 * There are many ways to create and use function-like values in Scala.
 */

// Implicit function:
def id(x: Int): Int = x

println(id(3))

// Anonymous function:
val anonId = (x: Int) => x

println(anonId(3))

// object with apply method:
object Id {
  def apply(x: Int) = x
}

println(Id.apply(3))
println(Id(3))
// class with apply method:
class Identity {
  def apply(x : Int) = x
}

val myId = new Identity
println(myId.apply(3))
println(myId(3))

// anonymous class with apply method:
val myOtherId = new {
  def apply(x: Int) = x
}
println(myOtherId.apply(3))
println(myOtherId(3))

// Multi-argument functions:
def h(x: Int, y: Int): Int = x + y

// A Curried multi-argument function:
def hC(x: Int) (y: Int): Int = x + y
hC(3)(4)
hC(3) _
hC(_:Int)(4)
val plus3 = hC(_: Int)(3)
val plus_3 = hC(3) _
println(plus3(10))

// A procedure
def proc(a: Int) {  // Implicitly: Unit
  println("I'm a procedure.") 
}

proc(10)

// An argument-less function:
def argless: Unit = println("argless got called!")
argless

// Lazy fields are argless functions that cache  their result:
class LazyClass {
  lazy val x = { println("Evaluating x") ; 3}
}
val lc = new LazyClass
println(lc.x)
println(lc.x)
println(lc.x)


