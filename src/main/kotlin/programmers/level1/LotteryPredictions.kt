package programmers.level1

class LotteryPredictions {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var erased = 0
        var wrong = 0

        var answer = intArrayOf()
        return answer
    }

    private val rankByCorrect = { correct: Int ->
        when (correct > 1) {
            true -> 6 - correct
            false -> correct
        }
    }

}
