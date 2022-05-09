package leetcode.easy

fun reverseWords(s: String): String {
    val stringBuilder = StringBuilder()
    val split = s.split(" ").toMutableList()
    split.indices.forEach {
        split[it] = stringBuilder.append(split[it]).reversed().toString()
        stringBuilder.clear()
    }
    return split.joinToString(separator = " ")
}