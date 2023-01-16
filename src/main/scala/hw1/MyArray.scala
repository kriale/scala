package kriale.lessons.scala
package hw1

object MyArray {
  def main(args: Array[String]): Unit = {
    var list1 = Array("Linux", "Windows", "MacOS")

    // Sorting
    list1 = list1.sortWith((a, b) => a < b)
    println("Sorted array: " + list1.mkString("Array(", ", ", ")"))

    // Filtering
    val list2 = list1.filter(os => os.toLowerCase.endsWith("s"))
    println("Filtered array: " + list2.mkString("Array(", ", ", ")"))

    // Stream
    val stream = LazyList()
    println("Filtered array: " + stream.toList.mkString("Stream(", ", ", ")"))
  }
}
