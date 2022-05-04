package leetcode.easy

fun moveZeroes(nums: IntArray) {
    val lastIndex = nums.lastIndex
    var currentIndex = nums.indexOfFirst { it == 0 }
    var nextIndex: Int
    var next: Int = currentIndex

    if (currentIndex == - 1)
        return

    while (currentIndex != lastIndex) {
        if (nums[currentIndex] == 0) {
            nextIndex = currentIndex + 1
            while (nextIndex < lastIndex && nums[nextIndex] == 0)
                nextIndex++
            nums[next++] = nums[nextIndex]
            nums[nextIndex] = 0
            currentIndex = nextIndex
        } else
            currentIndex++
    }

}