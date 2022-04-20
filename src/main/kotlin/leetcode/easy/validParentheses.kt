package leetcode.easy

import java.util.Stack

fun validParentheses(s: String): Boolean {
    val stack = Stack<Char>()
    val parentheses = hashMapOf(
        '{' to '}',
        '(' to ')',
        '[' to ']',
    )

    s.forEach {
        if (stack.isEmpty() || parentheses[stack.peek()] != it)
            stack.add(it)
        else stack.pop()
    }

    return stack.isEmpty()
}