package programmers.level2

import java.util.*

class TheGreatestNumber {
    fun solution(numbers: IntArray): String {
        val answer = LinkedList(numbers.map { it.toString() }).sortedWith { s1, s2 -> (s2 + s1).compareTo(s1 + s2) }.joinToString(separator = "")

        if (answer[0] == '0') return "0"
        return answer
    }
}