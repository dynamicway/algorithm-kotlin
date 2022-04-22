package leetcode.easy

fun searchInsertPosition(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    val result: Int

    if (nums.first() > target) return 0
    if (nums.last() < target) return nums.size
    if (nums.isEmpty()) return 0

    while (true) {
        if (left > right) {
            result = left
            break
        }

        val mid = (left + right) / 2

        if (target == nums[mid]) {
            result = mid
            break
        }
        else if (target < nums[mid])
            right = mid - 1
        else
            left = mid + 1

    }

    return result
}