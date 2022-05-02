package leetcode.medium

fun rotate(nums: IntArray, k: Int) {
    if (nums.size == 1) return
    val rotate = k % nums.size
    val range1 = nums.copyOfRange(0, nums.lastIndex - rotate + 1)
    val range2 = nums.copyOfRange(nums.lastIndex - rotate + 1, nums.lastIndex + 1)
    range1.forEachIndexed { index, i ->
        nums[index + rotate] = i
    }
    range2.forEachIndexed { index, i ->
        nums[index] = i
    }
}