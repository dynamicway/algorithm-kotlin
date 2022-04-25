package leetcode.medium

import java.lang.Integer.min
import kotlin.math.max

fun maxArea(height: IntArray): Int {
    var answer = 0
    var left = 0
    var right = height.size - 1

    while (right - left > 0) {
        val calcHeight = min(height[left], height[right])
        val calcWidth = right - left
        answer = max(answer, calcHeight * calcWidth)

        if (height[left] > height[right]) {
            right -= 1
        } else {
            left += 1
        }
    }
    return answer
}