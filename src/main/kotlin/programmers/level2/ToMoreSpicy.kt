package programmers.level2

import java.util.*

fun toMoreSpicy(scoville: IntArray, k: Int): Int {
    val priorityQueue = PriorityQueue(scoville.toList())
    var result = 0
    while (true) {
        val first = priorityQueue.poll()
        if (first >= k)
            break
        if (priorityQueue.isEmpty())
            return -1
        val second = priorityQueue.poll()
        if (second == 0)
            return -1
        priorityQueue.add(first + second * 2)
        result++
    }
    return result
}