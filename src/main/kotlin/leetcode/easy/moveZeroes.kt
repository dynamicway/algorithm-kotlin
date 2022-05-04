package leetcode.easy

fun moveZeroes(nums: IntArray): Unit {
    val lastIndex = nums.lastIndex
    var nextIndex: Int

    nums.indices.forEach {
        if (nums[it] == 0 && it != lastIndex) {
            nextIndex = it + 1
            while (nextIndex < lastIndex && nums[nextIndex] == 0)
                nextIndex++
            nums[it] = nums[nextIndex]
            nums[nextIndex] = 0
        }
    }
}