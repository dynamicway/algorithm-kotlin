package solvedac.silver

import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val stairSize = readLine().toInt()
    val stairs = IntArray(stairSize + 1)
    for (i in 1 until stairs.size) {
        stairs[i] = readLine().toInt()
    }
    println(climbingStairs(stairs))
}

//https://www.acmicpc.net/problem/2579
fun climbingStairs(stairs: IntArray): Int {
    if (stairs.size == 2)
        return stairs.last()
    val dp = IntArray(stairs.size)
    dp[1] = stairs[1]
    dp[2] = stairs[1] + stairs[2]
    for (i in 3 until stairs.size) {
        dp[i] = max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i])
    }
    return dp.last()
}