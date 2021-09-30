package programmers.level2

import java.util.*

class TargetNumber {
    fun solution(numbers: IntArray, target: Int): Int {
        var queue: Queue<Int> = LinkedList()
        queue.add(0)
        numbers.forEach { n ->
            val temp: Queue<Int> = LinkedList()
            queue.forEach { q ->
                temp.add(q + n)
                temp.add(q - n)
            }
            queue = temp
        }
        return queue
            .filter { it == target }
            .size
    }

}