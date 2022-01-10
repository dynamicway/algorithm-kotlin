package solvedac.silver

import java.util.*

// https://www.acmicpc.net/problem/1012
fun main() = with(System.`in`.bufferedReader()) {
    val results = mutableListOf<Int>()
    val numberOfTestCases = readLine().toInt()
    repeat(numberOfTestCases) {
        val numberOfOrganicCabbage = readLine().split(" ").map { it.toInt() }.last()
        val cabbageLocations: MutableList<Pair<Int, Int>> = mutableListOf()
        repeat(numberOfOrganicCabbage) {
            val cabbageLocation = readLine().split(" ").map { it.toInt() }.toIntArray()
            cabbageLocations.add(Pair(cabbageLocation.first(), cabbageLocation.last()))
        }
        val organicCabbage = OrganicCabbage(LinkedList(cabbageLocations))
        results.add(organicCabbage.getNumberOfEarthWarm())
    }
    results.forEach { println(it) }
}

class OrganicCabbage(
    private val cabbageLocations: LinkedList<Pair<Int, Int>>,
) {
    private val search: LinkedList<Pair<Int, Int>> = LinkedList()

    fun getNumberOfEarthWarm(): Int {
        var numberOfEarthWarm = 0
        while (cabbageLocations.isNotEmpty()) {
            search.add(cabbageLocations.pop())
            while (search.isNotEmpty()) {
                val cabbageLocation = search.pop()
                val cabbageLocationsIterator = cabbageLocations.iterator()
                while (cabbageLocationsIterator.hasNext()) {
                    val it = cabbageLocationsIterator.next()
                    if (((it.first + 1 == cabbageLocation.first || it.first - 1 == cabbageLocation.first) && it.second == cabbageLocation.second) || ((it.second + 1 == cabbageLocation.second || it.second - 1 == cabbageLocation.second) && it.first == cabbageLocation.first)) {
                        cabbageLocationsIterator.remove()
                        search.add(it)
                    }
                }
            }
            numberOfEarthWarm++
        }
        return numberOfEarthWarm
    }

}
