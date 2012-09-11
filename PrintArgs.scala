/*
 * There are many ways to print the elements of an array in Scala. 
*/

// A traditional while loop:
var i = 0;
while (i < args.length){
  println(args(i));
  i += 1;
}

// A traditional for loop:
for (i <- 0 until args.length) {
  println(args(i))   
}


// A iterator-based for loop:
for (arg <- args) {
  println(arg)
}

// A functional approach:
args.foreach((arg: String) => println(arg))

// With the argument type inferred:
args.foreach(arg => println(arg))

// With a parameter less anonymous function:
args.foreach(println(_))

// With a Curried function:
args.foreach(println _)

// With a function as argument:
args.foreach(println)

// With infix method call invocation:
args foreach println


