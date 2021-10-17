package programmers.level1

import java.util.*

class KthNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val linkedList = LinkedList<Int>()
        commands.forEach {
            val sliceList = array.sliceArray((it[0] - 1 .. it[1] - 1)).sorted()
            linkedList.add(sliceList[it[2] - 1])
        }
        return linkedList.toIntArray()
    }
}
