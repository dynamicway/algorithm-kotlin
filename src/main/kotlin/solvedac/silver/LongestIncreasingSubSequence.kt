package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val sequence = readLine().split(" ").map { it.toInt() }.toIntArray()
    println(longestIncreasingSubSequence(sequence))
}

// https://www.acmicpc.net/problem/11053
fun longestIncreasingSubSequence(sequence: IntArray): Int {
    val dp = IntArray(sequence.size) { 1 }
    dp[sequence.size - 1] = 1
    var max = 1
    for (i in sequence.size - 2 downTo 0) {
        for (j in i until sequence.size) {
            if (sequence[i] < sequence[j])
                dp[i] = maxOf(dp[i], dp[j] + 1)
        }
        max = maxOf(dp[i], max)
    }
    return max
}
