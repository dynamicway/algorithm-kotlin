package leetcode.easy

fun reverseString(s: CharArray) {
    var left = 0
    var right = s.lastIndex
    while (left < right) {
        val dump = s[left]
        s[left] = s[right]
        s[right] = dump
        left++
        right--
    }
}