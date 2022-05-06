package leetcode.medium

fun twoSum(numbers: IntArray, target: Int): IntArray {
    numbers.forEachIndexed { index, i ->
        val result = numbers.binarySearch(target - i, index + 1)
        if (result > -1) {
            return intArrayOf(index + 1, result + 1)
        }
    }
    return intArrayOf()
}