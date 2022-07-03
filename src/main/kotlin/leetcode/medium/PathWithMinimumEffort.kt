package leetcode.medium

import java.util.*
import kotlin.math.abs

fun minimumEffortPath(heights: Array<IntArray>): Int {
    val width = heights.size
    val height = heights[0].size
    val visited = Array(width) { Array(height) { false } }
    val efforts = Array(width) { Array(height) { Int.MAX_VALUE } }

    efforts[0][0] = 0

    class Node(
        val row: Int,
        val column: Int,
        var effort: Int
    ): Comparable<Node> {

        override fun compareTo(other: Node) = this.effort - other.effort

        fun getNearNodesLocation(): List<Pair<Int, Int>> {
            val nodes = mutableListOf<Pair<Int, Int>>()

            nodes.add(Pair(row, column - 1))
            nodes.add(Pair(row, column + 1))
            nodes.add(Pair(row - 1, column))
            nodes.add(Pair(row + 1, column))

            nodes.removeIf { it.first < 0 || it.first == width || it.second < 0 || it.second == height }
            return nodes
        }

    }

    val priorityQueue = PriorityQueue<Node>()
    priorityQueue.add(Node(0, 0, 0))

    while (priorityQueue.isNotEmpty()) {
        val currentNode = priorityQueue.poll()
        currentNode.getNearNodesLocation()
                .forEach { node ->
                    if (!visited[node.first][node.second]) {
                        val effort = abs(heights[currentNode.row][currentNode.column] - heights[node.first][node.second])
                        if (efforts[node.first][node.second] > effort) {
                            efforts[node.first][node.second] = effort.coerceAtLeast(currentNode.effort)
                            priorityQueue.add(Node(node.first, node.second, effort.coerceAtLeast(currentNode.effort)))
                        }
                    }
                }
        visited[currentNode.row][currentNode.column] = true
    }

    return efforts[efforts.size - 1][efforts.first().size - 1]
}
