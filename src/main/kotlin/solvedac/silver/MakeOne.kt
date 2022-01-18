package solvedac.silver

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    println(makeOne(readLine().toInt()))
}

// https://www.acmicpc.net/problem/1463
fun makeOne(value: Int): Int {
    val memory = IntArray(value + 1)
    (2 until memory.size).forEach {
        memory[it] = memory[it - 1] + 1
        if (it % 2 == 0) memory[it] = min(memory[it], memory[it / 2] + 1)
        if (it % 3 == 0) memory[it] = min(memory[it], memory[it / 3] + 1)
    }
    return memory.last()
}