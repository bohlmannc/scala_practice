/*
def quick_sort(array, start, end):

    if start < end:
        pivot = partition(array, start, end)

        quick_sort(array, start, pivot - 1)
        quick_sort(array, pivot + 1, end)

    return array


def partition(arr, j, k):
    pivot = arr[-1]

    for i in range(j, k):
        if arr[i] < pivot:
            arr[i], arr[j] = arr[j], arr[i]
            j += 1

    arr[j], arr[k] = arr[k], arr[j]
    return j



if __name__ == "__main__":
    a = [10, 7, 8, 9, 1, 5]
    s = 0
    e = len(a) - 1
    print(quick_sort(a, s, e))
 */
object quick_sort {

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
