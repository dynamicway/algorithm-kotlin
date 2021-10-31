package programmers.level1

class AddMissingNumbers {
    fun solution(numbers: IntArray): Int {
        var answer = 0
        (0 .. 9).forEach {
            if (!numbers.contains(it))
                answer += it
        }
        return answer
    }
}