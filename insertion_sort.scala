import scala.annotation.tailrec


object insertion_sort {
  def is(arr: Vector[Int]): Vector[Int] = {

    @tailrec
    def backwards(arr: Vector[Int], i: Int): Vector[Int] =
      if (i == 0) arr
      else if (arr(i - 1) > arr(i))
        backwards(arr.updated(i, arr(i - 1)).updated(i - 1, arr(i)), i - 1)
      else arr

    @tailrec
    def forwards(i: Int, arr: Vector[Int]): Vector[Int] =
      if (i == arr.length) arr
      else forwards(i + 1, backwards(arr, i))

    forwards(1, arr)
  }

  def main(x: Array[String]): Unit = {
    val vec = Vector(3, 1, 4, 93, 19)
    println(is(vec))

  }

}

/*def main(args: Array[int]): Unit = {

}*/