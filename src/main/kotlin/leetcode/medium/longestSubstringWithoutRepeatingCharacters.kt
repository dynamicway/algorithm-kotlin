package leetcode.medium

fun lengthOfLongestSubstring(s: String): Int {
    val presents = hashSetOf<Char>()
    var result = 0
    s.indices.forEach {
        var length = 0
        presents.clear()
        for (i in it until s.length) {
            if (presents.contains(s[i])) {
                length = presents.size
                break
            }
            presents.add(s[i])
            if (i == s.length - 1)
                length = presents.size
        }
        result = maxOf(result, length)
    }
    return result
}