package kriale.lessons.scala
package hw3

class House(val id: String, val flatNumber: String, val area: Double, val floorNumber: Int, val roomsNumber: Int, val street: String, val buildingType: String, val lifetime: Int) {


  override def toString = s"House(id=$id, flatNumber=$flatNumber, area=$area, floorNumber=$floorNumber, roomsNumber=$roomsNumber, street=$street, buildingType=$buildingType, lifetime=$lifetime)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[House]

  override def equals(other: Any): Boolean = other match {
    case that: House =>
      (that canEqual this) &&
        id == that.id
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(id)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
