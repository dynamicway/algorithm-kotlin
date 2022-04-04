package programmers.level3

fun farthestNode(n: Int, edge: Array<IntArray>): Int {
val adjacencyList = hashMapOf<Int, MutableList<Int>>()
edge.forEach {
    adjacencyList.computeIfAbsent(it[0]) { mutableListOf() }.add(it[1])
    adjacencyList.computeIfAbsent(it[1]) { mutableListOf() }.add(it[0])
}
val nodes = hashMapOf<Int, MutableList<Int>>()
nodes[1] = adjacencyList[1] ?: return 0

val visited = BooleanArray(adjacencyList.size + 1)
visited[1] = true
adjacencyList[1]!!.forEach { visited[it] = true }

var depth = 1
while (true) {
    val nextDepth = depth + 1
    nodes[depth]!!.forEach {
        val notVisitedNodes = adjacencyList[it]!!.filter { node -> !visited[node] }
        notVisitedNodes.forEach { node -> visited[node] = true }
        nodes.computeIfAbsent(nextDepth) { mutableListOf() }.addAll(notVisitedNodes)
    }
    if (nodes[depth]!!.size == 0) break
    depth = nextDepth
}

return nodes[--depth]!!.size
}