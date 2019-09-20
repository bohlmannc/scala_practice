object QuickSort {

  def quickSort(array: Vector[Int], start: Int, end: Int): Vector[Int] = {
    if (start < end) {
      val p = partition(array, start, end)
      quickSort(array, start, p - 1)
      quickSort(array, p + 1, end)
    }
    array

  }

  def partition(arr: Vector[Int], j: Int, k: Int): Int = {
    val pivot = arr(0)
    for (i <- j to k) {
      var curr = j
      if (arr(i) < pivot) {
        arr.updated(i, arr(j)).updated(j, arr(i))
        curr += 1
      }
      arr.updated(j, arr(k)).updated(k, arr(j))
    }
    j
  }

  def main(args: Array[String]): Unit = {
    val a = Vector(10, 7, 8, 9, 1, 5)
    val s = 0
    val e = a.length - 1
    println(quickSort(a, s, e))
  }

}
