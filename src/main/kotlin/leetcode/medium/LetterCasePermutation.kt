package leetcode.medium

fun letterCasePermutation(s: String): List<String> {

    fun Char.isEnglishLetter() = this in 'a'..'z' || this in 'A'..'Z'

    val list = mutableListOf<MutableList<Char>>()
    list.add(mutableListOf())

    s.forEach { char ->
        val size = list.size
        if (char.isEnglishLetter()) {
            repeat(size) {
                val mutableListOf = mutableListOf<Char>()
                mutableListOf.addAll(list[it])
                mutableListOf.add(char.lowercaseChar())
                list.add(mutableListOf)
                list[it].add(char.uppercaseChar())
            }
        } else repeat(size) {
            list[it].add(char)
        }
    }


    return list.map { String(it.toCharArray()) }
}