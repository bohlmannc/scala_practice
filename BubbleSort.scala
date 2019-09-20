import scala.annotation.tailrec

object BubbleSort {
  def bubbleSort(arr: Vector[Int]): Vector[Int] = {

    @tailrec
    def go(arr: Vector[Int], i: Int, swaps: Boolean): (Vector[Int], Boolean) = {
      if (i == arr.length) arr -> swaps
      else {
        if (arr(i - 1) > arr(i)) {
          go(arr.updated(i, arr(i - 1)).updated(i - 1, arr(i)), i + 1, true)
        } else
          go(arr, i + 1, swaps)
      }
    }

    val (res, swaps) = go(arr, 1, false)
    if (!swaps) res
    else bs(res)
  }
  def main(args: Array[String]): Unit = {
    val vec = Vector(3, 1, 4, 93, 19)
    println(bubbleSort(vec))
  }
}
