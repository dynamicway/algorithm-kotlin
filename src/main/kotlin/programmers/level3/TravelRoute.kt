package programmers.level3

import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.HashMap

private const val ICN = "ICN"
fun travelRoute(tickets: Array<Array<String>>): Array<String> {

    val adjacencyList = tickets.groupBy { it[0] }
        .map { it.key to ArrayDeque(it.value.map { it[1] }.sorted()) }
        .toMap() as HashMap

    val result = mutableListOf<String>()

    val stack = Stack<String>()
    stack.push(ICN)

    while (stack.isNotEmpty()) {
        val peek = stack.peek()

        if (!adjacencyList.containsKey(peek) || adjacencyList[peek]!!.isEmpty()) {
            result.add(stack.pop())
        } else {
            stack.push(adjacencyList[peek]!!.removeFirst())
        }
    }

    return result.reversed().toTypedArray()
}