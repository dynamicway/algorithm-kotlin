package solvedac.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bfsAndDfs = BfsAndDfs()

    val array = readLine().split(" ").map { it.toInt() }.toIntArray()

    val info = Triple(array[0], array[1], array[2])
    val nodes = mutableListOf<Pair<Int, Int>>()

    (0 until info.second).forEach {
        val toIntArray = readLine().split(" ").map { it.toInt() }.toIntArray()
        nodes.add(Pair(toIntArray[0], toIntArray[1]))
    }

    bfsAndDfs.solution(info, nodes)
    close()
}

class BfsAndDfs {

    fun solution(info: Triple<Int, Int, Int>, nodes: List<Pair<Int, Int>>): Pair<List<Int>, List<Int>> =
        with(System.out.bufferedWriter()) {
            val queue: Queue<Int> = LinkedList()
            val bfs = mutableListOf(info.third)

            queue.add(info.third)

            val sortedNodes = nodes.sortedWith { o1, o2 ->
                if (o1.first == o2.first) {
                    o1.second - o2.second
                } else o1.first - o2.first
            }

            val set = mutableSetOf<Int>()
            nodes.forEach {
                set.add(it.first)
                set.add(it.second)
            }

            while (bfs.size != set.size) {
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

            dfs.forEach { write("$it ") }
            write("\n")
            bfs.forEach { write("$it ") }

            flush()

            return Pair(dfs, bfs)
        }

}