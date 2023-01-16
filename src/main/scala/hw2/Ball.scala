package kriale.lessons.scala
package hw2

class Ball(val color: String, val weight: Double) {
  override def toString: String = "{color: "+color+", weight: "+weight+"}"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Ball]

  override def equals(other: Any): Boolean = other match {
    case that: Ball =>
      (that canEqual this) &&
        color == that.color &&
        weight == that.weight
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(color, weight)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}