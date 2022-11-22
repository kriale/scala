package kriale.lessons.scala
package hw2

class Ball(val color: String, val width: Double) {
  override def toString: String = "{color: "+color+", width: "+width+"}"
}