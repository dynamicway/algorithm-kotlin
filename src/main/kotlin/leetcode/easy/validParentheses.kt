package leetcode.easy

import java.util.*

fun validParentheses(s: String): Boolean {
    val stack = Stack<Char>()
    val parentheses = hashMapOf(
        '{' to '}',
        '(' to ')',
        '[' to ']',
    )

    s.forEach {
        if (it.isOpen())
            stack.add(it)
        else if (stack.isNotEmpty() && parentheses[stack.peek()] == it)
            stack.pop()
        else return false
    }

    return stack.isEmpty()
}

private fun Char.isOpen(): Boolean {
    return when (this) {
        '(', '[', '{' -> true
        else -> false
    }
}