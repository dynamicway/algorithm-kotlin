package programmers.level2

import java.util.*

class Printer {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue = LinkedList(priorities.toList())

        var currentLocation = location
        var count = 0

        while (queue.isNotEmpty()) {
            val maxIndex = extractMaxIndex(queue)

            if (queue[maxIndex] == queue.first) {
                currentLocation -= 1
            } else {
                currentLocation = calculateCurrentIndex(currentLocation, maxIndex, queue.size)
                moveMaxToFirst(queue, maxIndex)
            }
            queue.removeFirst()
            count++
            if (currentLocation == -1) return count
        }

        return count
    }

    private val calculateCurrentIndex: (Int, Int, Int) -> (Int) = { currentIndex, moved, size ->
        val result = currentIndex - moved
        if (result >= 0) result - 1
        else size + result - 1
    }

    private val extractMaxIndex: (LinkedList<Int>) -> (Int) = { l ->
        var max = l.first
        var index = 0
        l.forEachIndexed { i, value ->
            if (value > max) {
                max = value
                index = i
            }
        }
        index
    }

    private val moveMaxToFirst: (LinkedList<Int>, (Int)) -> LinkedList<Int> = { list, maxIndex ->
        repeat(maxIndex) {
            moveFirstToLast(list)
        }
        list
    }

    private val moveFirstToLast: (LinkedList<Int>) -> LinkedList<Int> = {
        it.addLast(it.removeFirst())
        it
    }

}