package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    val info = readLine().split(" ").map { it.toInt() }
    val map = ArrayList<List<Int>>(info[0])
    repeat(info[0]) {
        map.add(readLine().split(" ").map { it.toInt() })
    }
    val answers = ArrayList<List<Int>>(info[1])
    repeat(info[1]) {
        answers.add(readLine().split(" ").map { i -> i.toInt() })
    }
    getPrefixSum(map, answers).forEach {
        println(it)
    }
}


// https://www.acmicpc.net/problem/11660
fun getPrefixSum(map: List<List<Int>>, answers: List<List<Int>>): IntArray {
    val dp = List(map.size + 1) { IntArray(map[0].size + 1) }
    for (row in 1 until map.size + 1) {
        for (col in 1 until map[row - 1].size + 1) {
            dp[row][col] = dp[row - 1][col] + dp[row][col - 1] - dp[row - 1][col - 1] + map[row - 1][col - 1]
        }
    }

    val result = IntArray(answers.size)

    answers.forEachIndexed { i, answer ->
        val row1 = answer[0]
        val col1 = answer[1]
        val row2 = answer[2]
        val col2 = answer[3]
        result[i] = dp[row2][col2] - dp[row1 - 1][col2] - dp[row2][col1 - 1] + dp[row1 - 1][col1 - 1]
    }

    return result
}
