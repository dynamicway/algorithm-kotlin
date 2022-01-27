package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    val size = readLine().toInt()
    val values = IntArray(size) { readLine().toInt() }
    fibonacciFunction(values).forEach {
        println("${it!!.first} ${it.second}")
    }
}

// https://www.acmicpc.net/problem/1003
fun fibonacciFunction(values: IntArray): Array<Pair<Int, Int>?> {
    val max = values.maxOrNull()!!
    val dp = Array<Pair<Int, Int>?>(max + 1) { null }
    dp[0] = Pair(1, 0)
    if (max > 0)
        dp[1] = Pair(0, 1)
    for (i in 2 .. max) {
        dp[i] = Pair(dp[i - 2]!!.first + dp[i - 1]!!.first, dp[i - 2]!!.second + dp[i - 1]!!.second)
    }

    val result = Array(values.size) { i ->
        dp[values[i]]
    }

    return result
}