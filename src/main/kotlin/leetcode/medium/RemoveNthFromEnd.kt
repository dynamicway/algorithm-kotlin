package leetcode.medium

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val result = ListNode(-1).apply { next = head }
    var fastPoint: ListNode? = result
    var slowPoint: ListNode? = result
    repeat(n) {
        fastPoint = fastPoint?.next
    }
    while (fastPoint?.next != null) {
        fastPoint = fastPoint?.next
        slowPoint = slowPoint?.next
    }

    slowPoint?.next = slowPoint?.next?.next
    return result.next
}