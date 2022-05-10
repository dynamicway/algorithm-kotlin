package leetcode.medium

fun checkInclusion(s1: String, s2: String): Boolean {
    val size = s1.length
    val numberOfChar = hashMapOf<Char, Int>()
    s1.forEach {
        numberOfChar.compute(it) { _: Char, amount: Int? ->
            amount?.let {
                amount + 1
            } ?: 1
        }
    }

    var start = 0
    var hitRate = 0
    val dp = hashMapOf<Char, Int>()
    s2.forEachIndexed { index, char ->
        if (!numberOfChar.containsKey(char)) {
            s2.slice(start .. index).forEach {
                dp.compute(it) { _: Char, amount: Int? ->
                    amount?.let {
                        hitRate--
                        amount - 1
                    }
                }
            }
            start = index + 1
        } else {
            dp.compute(char) { _: Char, amount: Int? ->
                amount?.let { _ ->
                    amount + 1
                } ?: 1
            }
            hitRate++
            if (dp[char]!! > numberOfChar[char]!!) {
                val indexOf = s2.indexOf(char, start)
                s2.slice(start .. indexOf).forEach {
                    dp.compute(it) { _: Char, amount: Int? ->
                        amount?.let {
                            hitRate--
                            amount - 1
                        }
                    }
                }
                start = indexOf + 1
            }

            if (hitRate == size)
                return true
        }
    }
    return false
}