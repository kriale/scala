package kriale.lessons.scala
package hw2

object Main {
  def main(args: Array[String]): Unit = {
    this.task1()
  }

  def task1(): Unit = {
    val balls = List(
      new Ball("White", 150),
      new Ball("Black", 100),
      new Ball("White", 200)
    )
    val mainBasket = new Basket()

    println("1) Populate a Basket: ")
    balls.foreach(ball => mainBasket.addBall(ball))
    mainBasket.printBallsList()

    println("2) Calculate total weight: " + mainBasket.totalBallsWeight())

    println("3) Count balls of white color: " + mainBasket.countBallsOfColor("White"))
  }
}
