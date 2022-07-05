package programmers.level3

fun longestPalindrome(s: String): Int {
    val length = s.length
    if (length == 1) return 1

    val memory = Array(length) { BooleanArray(length) }

    memory.forEachIndexed { index, booleans ->
        booleans[index] = true
        if (index > 0 && s[index - 1] == s[index]) {
            memory[index - 1][index] = true
        }
    }
    var result = 1

    for (window in 3 .. length) {
        for (i in 0 .. length - window) {
            if (memory[i + 1][i + window - 2] && s[i] == s[i + window - 1]) {
                memory[i][i + window - 1] = true
                result = window
            }
        }
    }

    return result
}
