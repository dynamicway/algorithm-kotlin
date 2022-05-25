package leetcode.medium

fun minimumTotal(triangle: List<List<Int>>): Int {
    val dp = mutableListOf<MutableList<Int>>()

    repeat(triangle.size) { dp.add(mutableListOf()) }

    dp[0].add(triangle[0][0])

    for (row: Int in 1..triangle.lastIndex) {
        triangle[row].forEachIndexed { col, cell ->
            if (col != 0 && col != dp[row - 1].size)
                dp[row].add(minOf(dp[row - 1][col - 1], dp[row - 1][col]) + cell)
            else if (col != dp[row - 1].size)
                dp[row].add(dp[row - 1][col] + cell)
            else
                dp[row].add(dp[row - 1][col - 1] + cell)
        }
    }

    return dp.last().sorted().first()
}