package solvedac.silver

import java.util.*

// https://www.acmicpc.net/problem/2606
fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val networks = mutableSetOf<Pair<Int, Int>>()
    repeat(readLine().toInt()) {
        val network = readLine().split(" ").map { it.toInt() }
        networks.add(Pair(network.first(), network.last()))
    }
    println(Virus(networks).getCountOfInfectedNodes())
}

class Virus(
    private val networks: MutableSet<Pair<Int, Int>>,
) {
    private val searchQueue: LinkedList<Int> = LinkedList()
    fun getCountOfInfectedNodes(): Int {
        var result = 0
        searchQueue.add(1)
        while (searchQueue.isNotEmpty()) {
            val node = searchQueue.pop()
            val infectedNetworks = networks
                .filter { it.first == node || it.second == node }
                .toMutableSet()

            networks.removeAll(infectedNetworks.toSet())
            infectedNetworks.removeIf { (searchQueue.contains(it.first) || searchQueue.contains(it.second)) }

            searchQueue.addAll(
                infectedNetworks
                    .map { getInfectedNode(it, node) }
            )
            result += infectedNetworks.size
        }
        return result
    }

    private fun getInfectedNode(infectedNetwork: Pair<Int, Int>, node: Int): Int {
        return if (infectedNetwork.first == node) infectedNetwork.second
        else infectedNetwork.first
    }
}