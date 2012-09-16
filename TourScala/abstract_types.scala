abstract class Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

/**
 * Traits or classes with abstract type members are
 * often used in combination with anonymous class instantiations.
 */

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

object AbstractTypeTest1 extends Application {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer = 
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
    }
  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element) 
}


/**
 * It's often possible to turn abstract type members
 * into type parameters of classes and vice versa.
 */

/**
abstract class Buffer[+T] {
  val element: T
}

abstract class SeqBuffer[U, +T <: Seq[U]] extends Buffer[T] {
  def length = element.length
}

object AbstractTypeTest2 extends Application {
  def newIntSeqBuf(e1: Int, e2: Int): SeqBuffer[Int, Seq[Int]] = 
    new SeqBuffer[Int, List[Int]]{
      val element = List(e1, e2)
    }
  val buf = newIntSeqBuf(7,8)
  println("length = " + buf.length)
  println("content = " + buf.element) 
}
*/
