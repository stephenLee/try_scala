// While loops are syntactic sugar in Scala:
def myWhile(cond: => Boolean) (body: => Unit): Unit = 
  if (cond) {
    body;
    myWhile(cond) (body)
  } else {
    ()
  }

var i = 0;
myWhile (i < 4) { i += 1; println(i) }

// A benchmark construct:
def benchmark (body: => Unit): Long = {
  val start = java.util.Calendar.getInstance().getTimeInMillis()
  body
  val end = java.util.Calendar.getInstance().getTimeInMillis()
  end - start
}

val myTime = benchmark {
  var i = 0;
  myWhile(i < 1000000){
    i += 1;
  }
}

println("myWhile took: " + myTime)

val time = benchmark {
  var i = 0;
  while (i < 1000000){
    i += 1;
  }
}
println("while took: " + time)

// A short-circuiting or:
def myOr(left: Boolean, right: => Boolean): Boolean =
  if (left) {
    true
  } else {
    right
  }

println(myOr(true, throw new Exception("Boom!")))
