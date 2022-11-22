package kriale.lessons.scala
package hw2

import scala.collection.mutable.ListBuffer

class Basket() {
  val balls: ListBuffer[Ball] = ListBuffer()

  def addBall(ball: Ball): Unit = balls += ball
  def printBallsList(): Unit = balls.foreach(ball => println(ball))
  def totalBallsWeight(): Double = balls.map(ball => ball.width).sum
  def countBallsOfColor(color: String): Int = balls.count(ball => ball.color.equalsIgnoreCase(color))
}
