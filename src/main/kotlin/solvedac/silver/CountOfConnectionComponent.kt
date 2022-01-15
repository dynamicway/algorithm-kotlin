package solvedac.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val graphInfo = readLine().split(" ").map { it.toInt() }
    val adjacencyList = Array<LinkedList<Int>>(graphInfo.first()){ LinkedList() }
    repeat(graphInfo.last()) {
        val edge = readLine().split(" ").map { it.toInt() }
        adjacencyList[edge.first() - 1].add(edge.last())
        adjacencyList[edge.last() - 1].add(edge.first())
    }
    println(CountOfConnectionComponent(adjacencyList).getCountOfConnectedComponents())
}


class CountOfConnectionComponent(
    private val adjacencyList: Array<LinkedList<Int>>
) {
    fun getCountOfConnectedComponents(): Int {
        var result = 0
        val visited = Array(adjacencyList.size + 1){ false }
        visited[0] = true
        visited[1] = true
        val search = ArrayDeque<Int>(adjacencyList.size)
        search.add(1)
        while (search.isNotEmpty()) {
            val node = search.pop()
            val adjacencyNodes = adjacencyList[node - 1]
            adjacencyNodes.filter { !visited[it] }
                .forEach {
                    visited[it] = true
                    search.add(it)
                }
            if (search.isEmpty()) {
                visited.indexOfFirst { !it }.let {
                    if (it != -1) {
                        visited[it] = true
                        search.add(it)
                    }
                }
                result++
            }
        }
        return result
    }

}