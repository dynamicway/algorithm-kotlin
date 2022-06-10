package programmers.level3

import java.util.PriorityQueue

fun doublePriorityQueue(operations: Array<String>): IntArray {
    val minHeap = PriorityQueue<Int>()
    val maxHeap = PriorityQueue<Int>(compareByDescending { it })
    operations.forEach {
        val value = it.substring(2).toInt()
        when (it.startsWith("I")) {
            true -> {
                minHeap.add(value)
                maxHeap.add(value)
            }
            false -> {
                if (value == 1)
                    minHeap.remove(maxHeap.poll())
                else
                    maxHeap.remove(minHeap.poll())
            }
        }
    }

    if (minHeap.isEmpty())
        return intArrayOf(0, 0)

    return intArrayOf(maxHeap.poll(), minHeap.poll())

}