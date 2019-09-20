object Kadane {
  def maxSubArray(array: Array[Int]): Array[Int] = {
    var local_max = 0
    var global_max = -100
    var start = 0
    var end = 0
    var j = 0

    for (i <- array.indices) {
      local_max = Math.max(array(i), array(i) + local_max)
      if (local_max > global_max) {
        global_max = local_max
        start = j
        end = i
      }
      if (local_max < 0) {
        local_max = 0
        j = i + 1
      }
    }
    array.slice(start, end)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(1, -1, 2, 4)
    println(maxSubArray(arr))
  }

}
