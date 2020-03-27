object Test extends App {
  val f = () => 5
  def test(g: => Int): Unit = {
    val gFunc = () => g
    val isSameClosureClass = gFunc.getClass == f.getClass
    val isSame = gFunc eq f
    println("Is same closure class: "+isSameClosureClass+" is same closure: "+isSame)
  }

  test(f())
}
