package solvedac.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val numberOfNodes = readLine().toInt()
    val adjacencyList = Array<LinkedList<Int>>(numberOfNodes) { LinkedList() }
    repeat(numberOfNodes - 1) {
        val edge = readLine().split(" ").map { it.toInt() }
        if (adjacencyList[edge.first() - 1].isEmpty()) adjacencyList[edge.first() - 1].add(edge.first() - 1)
        if (adjacencyList[edge.last() - 1].isEmpty()) adjacencyList[edge.last() - 1].add(edge.last() - 1)
        adjacencyList[edge.first() - 1].add(edge.last())
        adjacencyList[edge.last() - 1].add(edge.first())
    }
    findTheParentsOfTree(adjacencyList).forEach { println(it.second) }
}

// https://www.acmicpc.net/problem/11725
val findTheParentsOfTree: (Array<LinkedList<Int>>) -> TreeSet<Pair<Int, Int>> = {
    val parents = TreeSet<Pair<Int, Int>>() { o1, o2 ->
        o1.first - o2.first
    }
    val visited = BooleanArray(it.size)
    val search = ArrayDeque<Int>(it.size)
    search.add(1)
    while (search.isNotEmpty()) {
        val node = search.removeLast()
        visited[node - 1] = true
        for (i in 1 until it[node - 1].size) {
            when(visited[it[node - 1][i] - 1]) {
                false -> search.add(it[node - 1][i])
                true -> parents.add(Pair(node, it[node - 1][i]))
            }
        }
    }
    parents
}
