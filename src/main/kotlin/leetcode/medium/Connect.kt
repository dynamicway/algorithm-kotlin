package leetcode.medium

import java.util.LinkedList

fun connect(root: ConnectNode?): ConnectNode? {
    val queue1 = LinkedList<ConnectNode>()
    val queue2 = LinkedList<ConnectNode>()
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

class ConnectNode(var `val`: Int) {
    var left: ConnectNode? = null
    var right: ConnectNode? = null
    var next: ConnectNode? = null
}
