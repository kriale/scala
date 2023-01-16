package kriale.lessons.scala
package hw3

import hw3.BuildingTypes.{Block, Panel, Wood}

object MainHw3 {
  def main(args: Array[String]): Unit = {
    this.task1()
  }

  def task1(): Unit = {
    // Создать массив объектов
    val houses = List(
      new House("100000000", "3", 4, -1, 1, "Skotni Dvor 15, 123789, N", Wood, 48),
      new House("100000001", "1118", 48, 13, 1, "Eros Manjgaladze St, 12, 100900, Batumi, Georgia", Block, 60),
      new House("100000002", "333", 125, 3, 3, "Minsk World St., 78, 227790, Minsk, Belarus", Block, 30),
      new House("100000003", "332", 60, 9, 1, "Minsk World St., 79, 227790, Minsk, Belarus", Panel, 40),
      new House("100000004", "331", 100, 1, 2, "Minsk World St., 80, 227790, Minsk, Belarus", Panel, 40),
    )
    println(houses.mkString("{\n", ",\n", "\n}"))

    // Вывести:
    println("a) список квартир, имеющих заданное число комнат: ")
    val requestedRoomsNumber: Int = 1
    println(houses.filter(h => h.roomsNumber == requestedRoomsNumber).mkString("{\n", ",\n", "\n}"))

    println("b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке: ")
    val requestedMinFloorNumber: Int = 2
    val requestedMaxFloorNumber: Int = 24
    println(houses.filter(h => h.roomsNumber == requestedRoomsNumber && (h.floorNumber >= requestedMinFloorNumber && h.floorNumber <= requestedMaxFloorNumber)).mkString("{\n", ",\n", "\n}"))

    println("c) список квартир, имеющих площадь, превосходящую заданную: ")
    val requestedMinArea: Double = 30
    println(houses.filter(h => h.area >= requestedMinArea).mkString("{\n", ",\n", "\n}"))

    println("d) любая квартира со сроком эксплуатации >= 40 лет: ")
    println(houses.find(_.lifetime >= 40))
  }
}
