package leetcode.easy

fun firstBadVersion(n: Int) : Int {
    var left = 1
    var right = n

    if (isBadVersion(1)) return 1

    while (left < right) {
        val mid = left + (right - left) / 2
        if (isBadVersion(mid))
            right = mid
        else
            left = mid + 1
    }

    return left
}

private fun isBadVersion(i: Int): Boolean {
    return false
}
