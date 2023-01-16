package kriale.lessons.scala
package hw2

import scala.annotation.tailrec

class CustomArray(val index: Int) {
  private val _array: Array[Int] = new Array(index)

  def this(array: Array[Int]) = {
    this(array.length)
    array.copyToArray(_array)
  }

  def getElement(index: Int): Int = {
    _array(index)
  }

  def setElement(index: Int, value: Int): CustomArray = {
    _array(index) = value
    this
  }

  def standardQuickSort(): Unit = {
    scala.util.Sorting.quickSort(_array)
  }

  @tailrec
  private def bubbleSort(array: Array[Int]): Array[Int] = {
    var didSwap = false

    for (i <- 0 until array.length - 1)
      if (array(i + 1) < array(i)) {
        val temp = array(i)
        array(i) = array(i + 1)
        array(i + 1) = temp
        didSwap = true
      }

    // Repeat until we don't have anymore swaps
    if (didSwap)
      bubbleSort(array)
    else
      array
  }

  def bubbleSort(): CustomArray = {
    bubbleSort(_array)
    this
  }

  def selectionSort(): CustomArray = {
    for (i <- _array.indices) {
      var minPos = i

      for (j <- i + 1 until _array.length)
        if (_array(j) < _array(minPos))
          minPos = j

      if (minPos != i) {
        val temp = _array(i)
        _array(i) = _array(minPos)
        _array(minPos) = _array(i)
      }
    }

    this
  }

  private def quickSort(array: Array[Int]): Array[Int] = {
    if (array.length <= 1)
      return array

    val arrBuff = array.toBuffer
    val pivot = selectPivot(array)
    arrBuff -= pivot
    val (less, greater) = arrBuff.toArray.partition(_ <= pivot)
    Array.concat(quickSort(less), Array(pivot), quickSort(greater))
  }

  private def selectPivot(array: Array[Int]): Int = {
    val first = array.head
    val middle = array(array.length / 2)
    val last = array.last

    math.max(math.max(first, middle), last) match {
      case `first` => math.max(middle, last)
      case `middle` => math.max(first, last)
      case `last` => math.max(first, middle)
    }
  }

  def quickSort(): CustomArray = {
    quickSort(_array)
    this
  }

  override def toString: String = _array.mkString("CustomArray(", ", ", ")")
}