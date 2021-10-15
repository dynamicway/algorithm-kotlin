package programmers.level2

import java.util.*

class FunctionDevelopment {

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue = LinkedList<Pair>()
        val size = progresses.size
        val answer: LinkedList<Int> = LinkedList()
        val erase = Pair(0, 0)
        (0 until size).forEach { queue.add(Pair(progresses[it], speeds[it])) }
        while (queue.isNotEmpty()) {
            queue.forEach {
                it.first += it.second
            }
            var count = 0
            for (i in 0 until queue.size) {
                if (queue[i].first > 99) {
                    queue[i] = erase
                    count++
                } else break
            }
            if (count != 0) {
                answer.add(count)
                count = 0
            }
            queue.removeAll { it == erase }
        }

        return answer.toIntArray()
    }

    private class Pair(
        var first: Int,
        var second: Int
    )

}