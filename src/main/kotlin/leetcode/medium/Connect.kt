package leetcode.medium

import java.util.LinkedList

fun connect(root: Node?): Node? {
    val queue1 = LinkedList<Node>()
    val queue2 = LinkedList<Node>()
    root?.let { rootNode ->
        queue1.addFirst(rootNode)
        while (queue1.isNotEmpty()) {
            val node = queue1.removeFirst()
            queue1.firstOrNull()?.let { node.next = it }
            node.left?.let { queue2.add(it) }
            node.right?.let { queue2.add(it) }
            if (queue1.isEmpty()) {
                queue2.forEach { queue1.add(it) }
                queue2.clear()
            }
        }
    }

    return root
}

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}