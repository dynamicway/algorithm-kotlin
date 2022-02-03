package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    val testcases = arrayListOf<Int>()
    repeat(readLine().toInt()) {
        testcases.add(readLine().toInt())
    }
    add123(testcases).forEach {
        println(it)
    }
}

// https://www.acmicpc.net/problem/9095
fun add123(testCases: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    val dp = IntArray(12)
    dp[0] = -1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    testCases.forEach { test ->
        if (dp[test] == 0) {
            for (i in dp.indexOfFirst { it == 0 } .. test) {
                dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
            }
        }
        result.add(dp[test])
    }

    return result
}
