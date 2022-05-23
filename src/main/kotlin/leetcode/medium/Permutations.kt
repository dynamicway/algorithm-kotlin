package leetcode.medium

import java.util.LinkedList

fun permute(nums: IntArray): List<List<Int>> {

    val stack = LinkedList<Pair<List<Int>, LinkedList<Int>>>()

    nums.forEach { num ->
        stack.add(Pair(listOf(num), LinkedList(nums.filter { it != num })))
    }

    val result = mutableListOf<List<Int>>()

    while (stack.isNotEmpty()) {
        val pop = stack.pop()
        if (pop.second.isEmpty()) {
            result.add(pop.first)
            continue
        }
        pop.second.forEachIndexed { index, it ->
            val first = mutableListOf<Int>()
            first.addAll(pop.first)
            first.add(it)
            val second = LinkedList(pop.second)
            second.removeAt(index)
            stack.add(Pair(first, second))
        }
    }

    return result
}