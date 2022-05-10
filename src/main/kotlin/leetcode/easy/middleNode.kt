package leetcode.easy

fun middleNode(head: ListNode?): ListNode? {
    if (head!!.next == null)
        return head
    var currentNode = head.next
    var mid = currentNode
    var count = 0
    while (currentNode != null) {
        if (count++ == 1 && currentNode.next != null) {
            count = 0
            mid = mid!!.next
        }
        currentNode = currentNode.next
    }
    return mid
}
