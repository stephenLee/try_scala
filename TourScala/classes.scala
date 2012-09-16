/*
 * classes in Scala are parameterized with constructor arguments.
 * values defined with the val construct are different from variables defined
 * with the var construct. val value: constant
 */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  // override pre-defined toString method
  override def toString(): String = "{" + x + ", " + y + "}";
}


object Classes {
  def main(args: Array[String]){
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}
