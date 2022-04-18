package leetcode.medium

fun longestPalindrome(s: String): String {

    val length = s.length

    var result = s.first().toString()

    val memory = Array(length) { BooleanArray(length) }

    memory.forEachIndexed { index, booleans -> booleans[index] = true }

    for (size in 2..length) {
        for (i in 0..length - size) {
            if (size == 2) {
                if (s[i] == s[i + size - 1]) {
                    memory[i][i + size - 1] = true
                    if (result.length < size)
                        result = s.slice(i until i + size)
                }
                continue
            }
            if (memory[i + 1][i + size - 2] && s[i] == s[i + size - 1]) {
                memory[i][i + size - 1] = true
                if (result.length < size)
                    result = s.slice(i until i + size)
            }
        }
    }

    return result
}

private fun String.isPalindrome(memory: HashSet<String>): Boolean {
    if (this.length == 1) return true
    return (memory.contains(this.slice(1 until this.length - 1)) || this.length < 3) && this.first() == this.last()
}
