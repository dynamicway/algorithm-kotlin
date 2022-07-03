package solvedac.gold

fun main() = with(System.`in`.bufferedReader()) {
    val numberOfCities = readLine().toInt()
    val numberOfBuses = readLine().toInt()
    val fees = Array(numberOfCities) { IntArray(numberOfCities) { Int.MAX_VALUE } }

    repeat(numberOfBuses) {
        val bus = readLine().split(" ")
                .map { it.toInt() }
        fees[bus[0] - 1][bus[1] - 1] = minOf(fees[bus[0] - 1][bus[1] - 1], bus[2])
    }

    floydWarshall(fees).forEach {
        it.forEach { print("${if (it == Int.MAX_VALUE) 0 else it} ") }
        println()
    }
}

private fun floydWarshall(graph: Array<IntArray>): Array<IntArray> {
    val numberOfCities = graph.indices
    for (route in numberOfCities) {
        for (from in numberOfCities) {
            if (route == from) continue
            for (to in numberOfCities) {
                if (route == to || from == to) continue
                if (graph[from][route] == Int.MAX_VALUE || graph[route][to] == Int.MAX_VALUE) continue
                graph[from][to] = minOf(graph[from][to], graph[from][route] + graph[route][to])
            }
        }
    }

    return graph
}
