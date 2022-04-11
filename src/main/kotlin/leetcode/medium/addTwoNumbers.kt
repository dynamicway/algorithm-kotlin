package leetcode.medium

import java.math.BigInteger
import java.util.*

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val stack1 = Stack<Int>()
    stack1.add(l1!!.`val`)
    var currentL1 = l1
    while (true) {
        stack1.add(currentL1?.next?.`val` ?: break)
        currentL1 = currentL1.next
    }
    val stack2 = Stack<Int>()
    stack2.add(l2!!.`val`)
    var currentL2 = l2
    while (true) {
        stack2.add(currentL2?.next?.`val` ?: break)
        currentL2 = currentL2.next
    }

    val stringBuilder = StringBuilder()

    while (stack1.isNotEmpty()) {
        stringBuilder.append(stack1.pop())
    }
    val n1 = stringBuilder.toString().toBigInteger()
    stringBuilder.clear()

    while (stack2.isNotEmpty()) {
        stringBuilder.append(stack2.pop())
    }
    val n2: BigInteger = stringBuilder.toString().toBigInteger()
    stringBuilder.clear()

    val result = (n1 + n2).toString()

    val resultStack = Stack<Int>()
    result.forEach {
        resultStack.add(it - '0')
    }

    val nodeResult = ListNode(resultStack.pop())

    var currentNodeResult = nodeResult

    while (resultStack.isNotEmpty()) {
        val listNode = ListNode(resultStack.pop())
        currentNodeResult.next = listNode
        currentNodeResult = listNode
    }

    return nodeResult
}

private fun Int.pow(n: Int): BigInteger {
    var result = BigInteger.ONE
    repeat(n - 1) {
    }
    return result
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}