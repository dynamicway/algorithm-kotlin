package leetcode.easy

fun reverseBits(n:Int):Int {
    var result = 0
    var n = n
    repeat(32) {
        result = result.shl(1)
        result += n.and(1)
        n = n.shr(1)
    }
    return result
}