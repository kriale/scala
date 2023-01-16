package kriale.lessons.scala
package hw2

object Main {
  def main(args: Array[String]): Unit = {
    this.task1()
    this.task2()
  }

  def task1(): Unit = {
    println("\nTASK 1: Basket & Balls")

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

    println("3) Find max ball weight: " + mainBasket.maxBallsWeight())

    println("4) Count balls of white color: " + mainBasket.countBallsOfColor("White"))
  }

  def task2(): Unit = {
    println("\nTASK 2: CustomArray")

    println("1) Create empty array: ")
    val array0 = new CustomArray(3)
    println(array0)

    println("2) Set values: ")
    println(array0.setElement(0, 1).setElement(1, 2).setElement(2, 3))

    println("3) Get the first element: " + array0.getElement(0))

    println("4) Generate 3 unsorted arrays: ")
    val standardArray = Array[Int](2, 3, 1)
    val array1 = new CustomArray(standardArray)
    val array2 = new CustomArray(standardArray)
    val array3 = new CustomArray(standardArray)

    println("5) Sort array 1 with bubbleSort: ")
    println(array1.bubbleSort())

    println("6) Sort array 1 with selectionSort: ")
    println(array1.selectionSort())

    println("7) Sort array 1 with quickSort: ")
    println(array1.quickSort())
  }
}
