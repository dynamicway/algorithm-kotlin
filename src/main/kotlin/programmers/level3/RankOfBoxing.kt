package programmers.level3

fun rankOfBoxing(
    n: Int,
    results: Array<IntArray>
): Int {
    val DONT_KNOW = "Dont Know"
    val WIN = "Win"
    val LOOSE = "Loose"
    val ranks = Array(n) { Array(n) { DONT_KNOW } }
    results.forEach {
        ranks[it[0] - 1][it[1] - 1] = WIN
        ranks[it[1] - 1][it[0] - 1] = LOOSE
    }
    repeat(n) {
        ranks[it][it] = "Me"
    }
    for (k in 0 until n) {
        for (a in 0 until n) {
            for (b in 0 until n) {
                if (ranks[a][k] != DONT_KNOW && ranks[k][b] != DONT_KNOW) {
                    if (ranks[a][k] == WIN && ranks[k][b] == WIN) {
                        ranks[a][b] = WIN
                        ranks[b][a] = LOOSE
                    }
                }
            }
        }
    }

    return ranks.count { !it.contains(DONT_KNOW) }
}
