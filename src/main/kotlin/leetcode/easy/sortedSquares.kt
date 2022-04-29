package leetcode.easy

import kotlin.math.abs

fun sortedSquares(nums: IntArray): IntArray {

    var left = 0
    var right = nums.lastIndex

    val result = IntArray(nums.size)
    var currentIndex = right

    while (currentIndex >= 0) {
        if (abs(nums[left]) > abs(nums[right])) {
            result[currentIndex] = nums[left] * nums[left]
            left++
        } else {
            result[currentIndex] = nums[right] * nums[right]
            right--
        }
        currentIndex--
    }

    return result
}