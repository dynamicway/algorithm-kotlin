package solvedac.silver

import java.util.*

class BfsAndDfs {

    fun solution(info: Triple<Int, Int, Int>, nodes: List<Pair<Int, Int>>): Pair<List<Int>, List<Int>> {
        val queue: Queue<Int> = LinkedList()
        val bfs = mutableListOf(info.third)

        queue.add(info.third)

        val sortedNodes = nodes.sortedWith { o1, o2 ->
            if (o1.first == o2.first) {
                o1.second - o2.second
            }
            else o1.first - o2.first
        }

        while (bfs.size != info.first) {
            val node = queue.poll()
            sortedNodes.forEach {
                if (it.first == node) {
                    if (!bfs.contains(it.second)) {
                        queue.add(it.second)
                        bfs.add(it.second)
                    }
                }
                if (it.second == node) {
                    if (!bfs.contains(it.first)) {
                        queue.add(it.first)
                        bfs.add(it.first)
                    }
                }
            }
        }

        val dfs = mutableListOf(info.third)
        val stack: Stack<Int> = Stack()
        stack.add(info.third)

        while (stack.isNotEmpty()) {

            for (i in sortedNodes.indices) {
                val node = stack.peek()
                var isAllVisited = true

                val adjacentNodes = sortedNodes.filter { it.first == node || it.second == node }

                for (j in adjacentNodes.indices) {
                    if (!dfs.contains(adjacentNodes[j].first)) {
                        isAllVisited = false
                        stack.add(adjacentNodes[j].first)
                        dfs.add(adjacentNodes[j].first)
                        break
                    }
                    if (!dfs.contains(adjacentNodes[j].second)) {
                        isAllVisited = false
                        stack.add(adjacentNodes[j].second)
                        dfs.add(adjacentNodes[j].second)
                        break
                    }
                }

                if (!isAllVisited) break
                else {
                    stack.pop()
                    break
                }
            }
        }

        return Pair(dfs, bfs)
    }

}