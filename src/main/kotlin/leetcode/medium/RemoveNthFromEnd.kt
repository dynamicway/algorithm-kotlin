package leetcode.medium

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var headNode = head
    var currentNode = head
    var preNode = currentNode
    while (currentNode != null) {
        var node = currentNode
        repeat(n) { node = node!!.next }
        if (node == null) {
            if (currentNode == headNode) {
                headNode = headNode.next
                break
            }
            preNode?.next = currentNode.next
            break
        }
        preNode = currentNode
        currentNode = currentNode.next
    }
    return headNode
}