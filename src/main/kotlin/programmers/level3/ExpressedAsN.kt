package programmers.level3

fun expressedAsN(n: Int, number: Int): Int {
    if (n == number) return 1
    val memory = Array<MutableSet<Int>>(9) { mutableSetOf() }
    (1 until memory.size).forEach {
        var stringN = n.toString()
        repeat(it - 1) { stringN += n.toString() }
        memory[it].add(stringN.toInt())
    }

    for (depth in 1 until memory.size) {
        if (memory[depth].contains(number)) return depth
        for (i in 1 until depth) {
            val set1 = memory[i]
            val set2 = memory[depth - i]
            set1.forEach { s1 ->
                set2.forEach { s2 ->
                    if (s1 + s2 == number) return depth
                    memory[depth].add(s1 + s2)
                    if (s1 - s2 == number) return depth
                    if (s1 - s2 > 0)
                        memory[depth].add(s1 - s2)
                    if (s1 * s2 == number) return depth
                    memory[depth].add(s1 * s2)
                    if (s1 / s2 == number) return depth
                    if (s1 / s2 > 0)
                        memory[depth].add(s1 / s2)
                }
            }
        }
    }

    return -1
}