package leetcode.medium

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (true) {
        val result = numbers[left] + numbers[right]
        if (result == target)
            return intArrayOf(++left, ++right)
        if (result < target)
            left++
        else
            right--
    }
}