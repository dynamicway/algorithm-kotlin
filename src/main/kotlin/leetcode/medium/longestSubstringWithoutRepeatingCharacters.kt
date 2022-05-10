package leetcode.medium

fun lengthOfLongestSubstring(s: String): Int {
    val dp = hashMapOf<Char, Int>()
    var result = 0
    var startIndex = 0

    s.forEachIndexed { index, c ->
        if (dp.containsKey(c)) {
            result = maxOf(result, dp.size)
            val lastIndex = dp[c]!!
            s.slice(startIndex until lastIndex).forEach {
                dp.remove(it)
            }
            startIndex = lastIndex + 1
            dp[c] = index
        } else
            dp[c] = index
    }

    result = maxOf(result, dp.size)

    return result
}