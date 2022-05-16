package leetcode.medium

import java.util.LinkedList

fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val queue = LinkedList<Pair<Int, Int>>()

    val lastRowIndex = mat.lastIndex
    val lastColIndex = mat[0].lastIndex


    repeat(lastRowIndex + 1) { row ->
        repeat(lastColIndex + 1) { col ->
            when (mat[row][col] == 0) {
                true -> queue.add(Pair(row, col))
                false -> mat[row][col] = Int.MAX_VALUE
            }
        }
    }

    fun isInnerRange(row: Int, col: Int): Boolean =
        row in 0..lastRowIndex && col in 0 .. lastColIndex

    val directions = listOf(
        Pair(-1, 0),
        Pair(1, 0),
        Pair(0, -1),
        Pair(0, 1)
    )

    fun Pair<Int, Int>.getNearCells() {
        val curCell = mat[first][second]
        directions.forEach { direction ->
            if (isInnerRange(first + direction.first, second + direction.second) && curCell + 1 < mat[first + direction.first][second + direction.second]) {
                mat[first + direction.first][second + direction.second] = curCell + 1
                queue.add(Pair(first + direction.first, second + direction.second))
            }
        }
    }

    while (queue.isNotEmpty()) {
        queue.pop().getNearCells()
    }

    return mat
}

