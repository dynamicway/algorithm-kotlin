package leetcode.medium

import java.util.LinkedList
import java.util.Queue

fun orangesRotting(grid: Array<IntArray>): Int {

    val queue: Queue<Pair<Int, Int>> = LinkedList()

    val notVisited = hashSetOf<Pair<Int, Int>>()

    val rowLast = grid.lastIndex
    val colLast = grid[0].lastIndex

    grid.forEachIndexed { row, cols ->
        cols.forEachIndexed { col, cell ->
            when (cell) {
                1 -> notVisited.add(Pair(row, col))
                2 -> queue.add(Pair(row, col))
            }
        }
    }

    var result = 0

    val nearDirection = listOf<Pair<Int, Int>>(
        Pair(-1, 0),
        Pair(1, 0),
        Pair(0, -1),
        Pair(0, 1)
    )

    val nextDepthCache = mutableListOf<Pair<Int, Int>>()
    while (queue.isNotEmpty()) {
        val rottenOrange = queue.poll()
        nearDirection.forEach {
            val row = rottenOrange.first + it.first
            val col = rottenOrange.second + it.second
            if (row in 0 .. rowLast && col in 0 .. colLast && grid[row][col] == 1) {
                val freshOrange = Pair(row, col)
                if (notVisited.remove(freshOrange)) {
                    nextDepthCache.add(freshOrange)
                }
            }
        }
        if (queue.isEmpty() && nextDepthCache.isNotEmpty()) {
            queue.addAll(nextDepthCache)
            nextDepthCache.clear()
            result++
        }
    }
    if (notVisited.size != 0)
        return -1

    return result
}