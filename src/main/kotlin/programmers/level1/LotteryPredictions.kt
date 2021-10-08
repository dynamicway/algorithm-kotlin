package programmers.level1

class LotteryPredictions(
    private val LOTTO_SIZE: Int = 6,
    private val LAST: Int = 6,
    private val ERASED: Int = 0
) {
    fun solution(lotto: IntArray, win: IntArray): IntArray {
        var erasedCount = 0
        var wrongCount = 0

        lotto.forEach { l ->
            when (l == ERASED) {
                true -> erasedCount++
                else -> if (checkWrong(l, win)) wrongCount++
            }
        }

        val max = rankByCorrect(LOTTO_SIZE - (wrongCount + erasedCount))
        val min = rankByCorrect(LOTTO_SIZE - wrongCount)

        return intArrayOf(min, max)
    }

    private val checkWrong = { value: Int, win: IntArray -> !win.contains(value) }

    private val rankByCorrect = { correct: Int ->
        when (correct > 1) {
            true -> LAST - (correct - 1)
            false -> LAST
        }
    }

}
