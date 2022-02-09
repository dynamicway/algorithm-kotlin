package solvedac.silver

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toInt() }.toList()
    println(z(input[0], input[1], input[2]))
}

// https://www.acmicpc.net/problem/1074
internal fun z(n: Int, r: Int, c: Int): Int {
    var result = 0
    var currentSize = n
    var row = r + 1
    var colum = c + 1
    while (currentSize != 0) {
        val length = 2.pow(--currentSize)
        val area = length.pow(2)
        if (length in colum until row) {
            row -= length
            result += 2 *area
        } else if (length in row until colum) {
            colum -= length
            result += area
        } else if (row > length) {
            row -= length
            colum -= length
            result += 3 * area
        }
    }
    return result
}

private fun Int.pow(n: Int) = this.toDouble().pow(n).toInt()
