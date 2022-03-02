package programmers.level2

fun stringCompression(s: String): Int {
    if (s.length == 1) return 1
    var result = Int.MAX_VALUE
    (1..s.length / 2).forEach {
        result = minOf(result, s.compressBy(it))
    }
    return result
}

private fun String.compressBy(number: Int): Int {
    var result = Int.MAX_VALUE
    val builder = StringBuilder()
    var index = 0
    var buffer = subSequence(0, index)
    var count = 1
    while (index + number <= length) {
        val sequence = subSequence(index, index +  number).toString()
        if (sequence == buffer) count++
        else {
            if (count == 1) builder.append(buffer)
            else builder.append(count).append(buffer)
            buffer = sequence
            count = 1
        }
        index += number
    }
    if (count == 1) builder.append(buffer)
    else builder.append(count).append(buffer)
    builder.append(subSequence(index, length))
    result = minOf(result, builder.length)
    return result
}
