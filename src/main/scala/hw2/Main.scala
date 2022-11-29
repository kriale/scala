package kriale.lessons.scala
package hw2

object Main {
  def main(args: Array[String]): Unit = {
    this.task2()
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

  def task2(): Unit = {

    println("1) Create empty array: ")
    val array0 = new CustomArray(3)
    array0.printArray()

    println("2) Set values: ")
    array0.setElement(0, 1).setElement(1, 2).setElement(2, 3).printArray()

    println("3) Get the first element: " + array0.getElement(0))

    println("4) Generate 3 unsorted arrays: ")
    val standardArray = Array[Int](2, 3, 1)
    val array1 = new CustomArray(standardArray)
  }
}
