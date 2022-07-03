object FloydWarshall {

    class Node(
        val id: Int,
        val distance: Int
    )

    fun run(graph: Map<Node, List<Node>>): Array<IntArray> {
        val distances = Array(graph.size) { IntArray(graph.size) { Int.MAX_VALUE } }
        graph.forEach { (currentNode, adjacencyNodes) ->
            distances[currentNode.id][currentNode.id] = 0
            adjacencyNodes.forEach { adjacencyNode ->
                distances[currentNode.id][adjacencyNode.id] = adjacencyNode.distance
            }
        }

        for (k in distances.indices) {
            for (a in distances.indices) {
                if (k == a) continue
                for (b in distances[a].indices) {
                    if (k == b || a == b) continue
                    if (distances[a][k] == Int.MAX_VALUE || distances[k][b] == Int.MAX_VALUE) continue
                    distances[a][b] = minOf(distances[a][b], distances[a][k] + distances[k][b])
                }
            }
        }

        return distances
    }

}
