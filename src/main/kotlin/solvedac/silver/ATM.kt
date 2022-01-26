package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val costs = readLine().split(" ").map { it.toInt() }.toList().sorted()
    println(atm(costs))
}

// https://www.acmicpc.net/problem/11399
fun atm(costs: List<Int>): Int {
    var result = 0
    costs.indices.forEach {
        result += (costs.size - it) * costs[it]
    }
    return result
}