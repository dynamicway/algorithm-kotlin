package leetcode.medium

import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {

    var result = -1

    var left = 0
    var right = height.lastIndex

    while (left <= right) {
        val h = min(height[left], height[right])
        val area = (right - left) * h
        result = max(result, area)
        if (h == height[left])
            left++
        else
            right--
    }

    return result
}