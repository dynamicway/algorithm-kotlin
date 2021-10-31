package programmers.level1

class DotProduct {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        for (i in a.indices) {
            answer += a[i] * b[i]
        }
        return answer
    }
}