package programmers.level1

class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        val list = IntArray(n) { 0 }

        lost.forEach { list[it - 1]-- }
        reserve.forEach { list[it - 1]++ }

        if (list.first() == -1) {
            if (list[1] == 1) {
                list[1]--
                answer++
            }
        }

        if (list.last() == -1) {
            if (list[list.size - 1] == 1) {
                list[list.size - 1]--
                answer++
            }
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

        return answer
    }
}