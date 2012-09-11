// Duplicate the arguments array.
val myArgs = new Array[String](args.length);

// Copy method 1:
for (i <- 0 util args.length) {
  myArgs.update(i, args(i))
}

// Copy method 2:
for (i <- 0 until args.length) {
  myArgs(i) = args(i)
}

// Copy method 3:
(0 until args.length).foreach(i => myArgs(i) = args(i))

// Copy method 4:
(0 until args.length) foreach (i => myArgs(i) = args(i))

// o.m(a) == o m a
val a = 3
val b = 4
val n = a.+(b)
println(n)

// Create new array of chars:
val alphabet = Array("a", "b"， "c")
val alphabetChars: Array[String] = Array[String]("a", "b", "c")

// Create a list:
val numbers = List(42,1701,13)
numbers foreach println

// Create a new list:
val moreNumbers = 1981 :: numbers

numbers
moreNumbers foreach println

def myMap[A,B] (f: A => B) (list: List[A])： List[B] = 
  if (list.isEmpty) {
    Nil
  } else {
    f(list.head) :: myMap (f) (list.tail)
  }
(myMap ((n:Int) => n + 1) (moreNumbers)) foreach println

moreNumbers map (_ + 1) foreach println

class Ship(val x: Int, val y: Int) extends Iterable[(String, Int)]{
  def elements = new Iterator[(String, Int)]{
    private var nextVar = 'x
    def next: (String, Int) = nextVar match{
      case 'x => { nextVar = 'y; ("x", x) }
      case 'y => { nextVar = 'z； ("y", y) }
    }
    def hasNext: Boolean = nextVar != 'z
  }
}

val Galactica = new Ship(42,1701)
for ((coord, value) <- Galactica) {
  println(coord + ": " + value)
}
