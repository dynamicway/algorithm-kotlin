package programmers.level2

import java.util.*

class Network {
    private val explored = mutableSetOf<Int>()
    private val search = Stack<Int>()

    fun solution(n: Int, computers: Array<IntArray>): Int {
        var result = 0
        while (true) {

            if (search.empty()) {
                val notExploredNode = (0 until n).firstOrNull { !explored.contains(it) } ?: break
                notExploredNode.let { node ->
                    searchLinkedNodes(n, computers, node)
                    explored.add(node)
                    result++
                }
            } else {
                val node = search.pop()
                searchLinkedNodes(n, computers, node)
                explored.add(node)
            }

        }

        return result
    }

    private fun searchLinkedNodes(n: Int, computers: Array<IntArray>, node: Int) {
        (0 until n).forEach { linkedNode ->
            if (computers[node][linkedNode] == 1) {
                if (!explored.contains(linkedNode))
                    search.add(linkedNode)
            }
            if (computers[linkedNode][node] == 1) {
                if (!explored.contains(linkedNode))
                    search.add(linkedNode)
            }
        }
    }
}
