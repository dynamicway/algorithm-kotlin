package leetcode.medium

import java.util.PriorityQueue

fun networkDelayTime(
    times: Array<IntArray>,
    n: Int,
    k: Int
): Int {
    class Node(
        val id: Int,
        val distance: Int
    ): Comparable<Node> {

        override fun compareTo(other: Node) = this.distance - other.distance
    }

    val adjacencyNodes = hashMapOf<Int, MutableList<Node>>()
    times.forEach { time ->
        adjacencyNodes.computeIfAbsent(time[0] - 1) { mutableListOf() }.add(Node(time[1] - 1, time[2]))
    }
    val visited = Array(n) { false }
    val latencyTimes = Array(n) { Int.MAX_VALUE }
    val priorityQueue = PriorityQueue<Node>()
    latencyTimes[k - 1] = 0
    priorityQueue.add(Node(k - 1, 0))
    while (priorityQueue.isNotEmpty()) {
        val currentNode = priorityQueue.poll()
        if (visited[currentNode.id]) continue
        visited[currentNode.id] = true
        adjacencyNodes[currentNode.id]?.forEach { adjacencyNode ->
            val distanceThroughCurrentNode = latencyTimes[currentNode.id] + adjacencyNode.distance
            if (!visited[adjacencyNode.id] && latencyTimes[adjacencyNode.id] > distanceThroughCurrentNode) {
                latencyTimes[adjacencyNode.id] = distanceThroughCurrentNode
                priorityQueue.add(Node(adjacencyNode.id, distanceThroughCurrentNode))
            }
        }
    }
    val maxLatencyTime = latencyTimes.max()

    return if (maxLatencyTime == Int.MAX_VALUE) -1 else maxLatencyTime
}
