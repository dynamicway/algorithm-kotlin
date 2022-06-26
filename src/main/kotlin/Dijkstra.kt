import java.util.*

object Dijkstra {

    fun linearSearch(
        nodes: Array<Array<Int?>>,
        route: Pair<Int, Int>
    ): Int? {
        val start = route.first
        val end = route.second
        val visited = Array(nodes.size) { false }
        val distances = Array<Int?>(nodes.size) { null }
        distances[start] = 0
        var currentNode = start

        while (true) {
            // 현재 노드를 방문처리한다.
            visited[currentNode] = true
            val notVisitedAdjacencyNodes = nodes[currentNode].mapIndexedNotNull { node, distance ->
                if (distance == null || visited[node]) null
                else node
            }
            // 모두 방문했거나 방문하지 않은 노드에서 다른 노드로 방문할 수 없는 경우 종료한다.
            if (notVisitedAdjacencyNodes.isEmpty()) break
            notVisitedAdjacencyNodes.forEach {
                if (distances[it] != null) {
                    distances[it] = minOf(distances[it]!!, distances[currentNode]!! + nodes[currentNode][it]!!)
                } else distances[it] = distances[currentNode]!! + nodes[currentNode][it]!!
            }
            if (visited.none { !it }) break
            val minDistance = distances.filterIndexed { node, distance -> !visited[node] && distance != null }
                .minBy { it!! }
            distances.forEachIndexed { node, distance ->
                if (!visited[node] && distance == minDistance)
                    currentNode = node
            }
        }

        return distances[end]
    }

    fun priorityQueue(
        nodes: HashMap<Int, List<Node>>,
        start: Int
    ): Array<Int> {
        val visited = Array(nodes.size) { false }
        val distances = Array(nodes.size) { Int.MAX_VALUE }
        val priorityQueue = PriorityQueue<Node>()

        distances[start] = 0
        priorityQueue.add(Node(start, 0))

        while (priorityQueue.isNotEmpty()) {
            val currentNode = priorityQueue.poll()
            if (visited[currentNode.id]) continue
            visited[currentNode.id] = true
            nodes[currentNode.id]!!.forEach { adjacencyNode ->
                val distanceToAdjacencyNodeThroughCurrentNode = distances[currentNode.id] + adjacencyNode.distance
                if (!visited[adjacencyNode.id] && distances[adjacencyNode.id] > distanceToAdjacencyNodeThroughCurrentNode) {
                    distances[adjacencyNode.id] = distanceToAdjacencyNodeThroughCurrentNode
                    priorityQueue.add(Node(adjacencyNode.id, distanceToAdjacencyNodeThroughCurrentNode))
                }
            }
        }

        return distances
    }

    class Node(
        val id: Int,
        val distance: Int
    ): Comparable<Node> {

        override fun compareTo(other: Node) = this.distance - other.distance
    }

}
