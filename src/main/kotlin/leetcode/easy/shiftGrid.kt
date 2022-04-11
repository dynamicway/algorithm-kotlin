package leetcode.easy

import java.util.*

fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
    val k = k % (grid.size * grid[0].size)
    val verticalMove = k / grid[0].size
    val gridLinkedList = LinkedList<IntArray>()
    grid.forEach { gridLinkedList.add(it) }
    repeat(verticalMove) {
        gridLinkedList.addFirst(gridLinkedList.removeLast())
    }
    val linkedList = LinkedList(gridLinkedList.flatMap { it.toList() })
    repeat(k % grid[0].size) {
        linkedList.addFirst(linkedList.removeLast())
    }
    val result = mutableListOf<MutableList<Int>>()
    linkedList.forEachIndexed { index, i ->
        if (index % grid[0].size == 0)
            result.add(mutableListOf())
        result.last().add(i)
    }
    return result
}