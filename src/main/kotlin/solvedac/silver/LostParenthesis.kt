package solvedac.silver

// https://www.acmicpc.net/problem/1541
fun main() = with(System.`in`.bufferedReader()) {
    val src = readLine()
    var start = 0
    val numbers = mutableListOf<Int>()
    for (index in 1 until src.length) {
        if (src[index] == '+' || src[index] == '-') {
            numbers.add(src.slice(start until index).toInt())
            start = index
        } else if (index == src.length - 1) {
            if (start == 0) {
                numbers.add(src.toInt())
            } else if (src[start] == '+')
                numbers.add(src.slice(start + 1..index).toInt())
            else if (src[start] == '-')
                numbers.add(-src.slice(start + 1..index).toInt())
        }
    }
    if (src.length == 1)
        numbers.add(src.toInt())
    println(lostParenthesis(numbers))
}

fun lostParenthesis(numbers: MutableList<Int>): Int {
    for (i in 1 until numbers.size) {
        if (numbers[i - 1] < 0 && numbers[i] > 0) {
            numbers[i] = -numbers[i]
        }
    }
    return numbers.sum()
}
