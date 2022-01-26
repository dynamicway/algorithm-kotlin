package solvedac.silver

import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val costs = Array(readLine().toInt()) { readLine().split(" ").map { it.toInt() }.toIntArray() }
    println(rgbStreet(costs))
}

// https://www.acmicpc.net/problem/1149
fun rgbStreet(costs: Array<IntArray>): Int {
    val red = IntArray(costs.size)
    val green = IntArray(costs.size)
    val blue = IntArray(costs.size)

    red[0] = costs[0][0]
    green[0] = costs[0][1]
    blue[0] = costs[0][2]

    for (i in 1 until costs.size) {
        red[i] = min(green[i - 1], blue[i - 1]) + costs[i][0]
        green[i] = min(red[i - 1], blue[i - 1]) + costs[i][1]
        blue[i] = min(red[i - 1], green[i - 1]) + costs[i][2]
    }

    return minOf(red.last(), green.last(), blue.last())
}