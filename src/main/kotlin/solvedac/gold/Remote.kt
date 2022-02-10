package solvedac.gold

import kotlin.math.absoluteValue

fun main() = with(System.`in`.bufferedReader()) {
    val channel = readLine().toInt()
    val brokenButtons = BooleanArray(10)
    if (readLine() != "0") {
        readLine().split(" ").map { it.toInt() }.forEach {
            brokenButtons[it] = true
        }
        println(getRemotePushCount(channel, brokenButtons))
    } else
        println(getRemotePushCount(channel, brokenButtons))
}

// https://www.acmicpc.net/problem/1107
fun getRemotePushCount(channel: Int, brokenButtons: BooleanArray): Int {
    var result = (channel - 100).absoluteValue

    for (i in 0 until 1000000) {
        val number = i.toString()
        var isBreak = false
        for (element in number) {
            if (brokenButtons[element.digitToInt()]) {
                isBreak = true
                break
            }
        }
        if (!isBreak)
            result = minOf(result, number.length + (channel - i).absoluteValue)
    }

    return result
}
