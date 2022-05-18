package leetcode.easy

import java.util.*

fun reverseList(head: ListNode?): ListNode? {
    var currentNode = head
    val stack = LinkedList<ListNode>()

    while (currentNode != null) {
        stack.addLast(currentNode)
        currentNode = currentNode.next
    }

    currentNode = stack.lastOrNull()

    while (stack.isNotEmpty()) {
        val node = stack.removeLast()
        node.next = stack.lastOrNull()
    }

    return currentNode
}