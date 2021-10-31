package solvedac.silver

import java.util.*

class BfsAndDfs {

    fun solution(info: Triple<Int, Int, Int>, nodes: List<Pair<Int, Int>>): Pair<List<Int>, List<Int>> {
        val queue: Queue<Int> = LinkedList()

        val bfs = mutableListOf(info.third)
        queue.add(info.third)

        val allNodes = mutableSetOf<Int>()

        nodes.forEach {
            allNodes.add(it.first)
            allNodes.add(it.second)
        }


        while (bfs.size != allNodes.size) {
            val node = queue.poll()
            nodes.forEach {
                if (it.first == node) {
                    if (!bfs.contains(it.second)) {
                        queue.add(it.second)
                        bfs.add(it.second)
                    }
                }
            }
        }

        return Pair(bfs, bfs)
    }

}