package leetcode.medium

fun rob(nums: IntArray): Int {
    if (nums.size == 1)
        return nums.first()
    val dp = IntArray(nums.size)
    dp[0] = nums[0]
    dp[1] = maxOf(nums[0], nums[1])

    val lastIndex = nums.lastIndex
    (2 ..lastIndex).forEach {
        dp[it] = maxOf(dp[it - 1], dp[it - 2] + nums[it])
    }

    return dp.last()
}