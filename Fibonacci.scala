import scala.annotation.tailrec

object Fibonacci {

  def fib(n: Int): Int = {
    @tailrec
    def go(i: Int, prev: Int, curr: Int): Int = {
      if (i < 2) curr
      else go(i - 1, curr, prev + curr)
    }
  go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(10))
  }
}
