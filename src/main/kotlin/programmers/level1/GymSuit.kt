package programmers.level1

class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        val list = IntArray(n + 2) { 0 }

        lost.forEach { list[it]-- }
        reserve.forEach {
            if (list[it] == -1) answer++
            list[it]++
        }

        for (i: Int in 1..list.size - 2) {
            if (list[i] == -1) {
                if (list[i - 1] == 1) {
                    list[i - 1]--
                    answer++
                    continue
                }
                if (list[i + 1] == 1) {
                    list[i + 1]--
                    answer++
                }
            }
        }

        return n - (lost.size - answer)
    }
}