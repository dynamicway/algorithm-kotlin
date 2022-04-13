package leetcode.easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, i ->
        indexMap[target - i]?.let {
            if (it != index)
                return intArrayOf(index, it)
        }
        indexMap[i] = index
    }

    return intArrayOf()
}