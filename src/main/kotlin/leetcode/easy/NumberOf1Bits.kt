package leetcode.easy

fun hammingWeight(n: Long): Long {
    var count = 0L
    var n = n
    while (n > 0) {
        count += n.and(1)
        n = n.shr(1)
    }
    return count
}