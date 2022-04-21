package leetcode.easy

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    var result: ListNode? = null
    var currentResultLast: ListNode? = null

    var currentNode1 = list1
    var currentNode2 = list2

    if (list1 == null && list2 != null) {
        result = list2
        currentResultLast = list2
        currentNode2 = list2.next
    } else if (list1 != null && list2 == null) {
        result = list1
        currentResultLast = list1
        currentNode1 = list1.next
    } else if (list1 != null && list2 != null) {
        if (list1.`val` > list2.`val`) {
            result = list2
            currentResultLast = list2
            currentNode2 = list2.next
        } else {
            result = list1
            currentResultLast = list1
            currentNode1 = list1.next
        }
    }

    while (currentNode1 != null || currentNode2 != null) {
        if (currentNode1 == null) {
            currentResultLast!!.next = currentNode2
            currentResultLast = currentNode2
            currentNode2 = currentNode2!!.next
        } else if (currentNode2 == null) {
            currentResultLast!!.next = currentNode1
            currentResultLast = currentNode1
            currentNode1 = currentNode1.next
        } else {
            if (currentNode1.`val` > currentNode2.`val`) {
                currentResultLast!!.next = currentNode2
                currentResultLast = currentNode2
                currentNode2 = currentNode2.next
            } else {
                currentResultLast!!.next = currentNode1
                currentResultLast = currentNode1
                currentNode1 = currentNode1.next
            }
        }
    }

    return result
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }


}