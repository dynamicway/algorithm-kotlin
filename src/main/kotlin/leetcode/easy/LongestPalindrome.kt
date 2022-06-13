package leetcode.easy

fun longestPalindrome(s: String): Int {
    val hashMapOf = hashMapOf<Char, Int>()

    s.forEach {
        if (hashMapOf.containsKey(it))
            hashMapOf[it] = hashMapOf[it]!! + 1
        else
            hashMapOf[it] = 1
    }

    var result = 0

    var flag = false

    hashMapOf.values.forEach {
        result += when (it.and(1) == 1) {
            true -> {
                flag = true
                it - 1
            }
            false -> it
        }
    }

    return result + if (flag) 1 else 0
}