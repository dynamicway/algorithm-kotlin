package leetcode.medium

import java.util.*

fun maxProbability(
    n: Int,
    edges: Array<IntArray>,
    succProb: DoubleArray,
    start: Int,
    end: Int
): Double {
    class Node(
        val id: Int,
        val probability: Double
    ): Comparable<Node> {

        override fun compareTo(other: Node) = other.probability.compareTo(this.probability)
    }

    val adjacencyNodes = hashMapOf<Int, MutableList<Node>>()
    edges.forEachIndexed { index, edge ->
        adjacencyNodes.computeIfAbsent(edge[0]) { mutableListOf() }
            .add(Node(edge[1], succProb[index]))
        adjacencyNodes.computeIfAbsent(edge[1]) { mutableListOf() }
            .add(Node(edge[0], succProb[index]))
    }
    val visited = Array(n) { false }
    val probabilities = Array(n) { 0.0 }
    val priorityQueue = PriorityQueue<Node>()
    priorityQueue.add(Node(start, 1.0))
    probabilities[start] = 1.0

    while (priorityQueue.isNotEmpty()) {
        val currentNode = priorityQueue.poll()
        if (visited[currentNode.id]) continue
        visited[currentNode.id] = true
        adjacencyNodes[currentNode.id]?.forEach { node ->
            val probabilityThroughCurrentNode = probabilities[currentNode.id] * node.probability
            if (!visited[node.id] && probabilities[node.id] < probabilityThroughCurrentNode) {
                probabilities[node.id] = probabilityThroughCurrentNode
                priorityQueue.add(Node(node.id, probabilityThroughCurrentNode))
            }
        }
    }

    return probabilities[end]
}
