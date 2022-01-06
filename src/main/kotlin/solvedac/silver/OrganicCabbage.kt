package solvedac.silver

import java.util.*

// https://www.acmicpc.net/problem/1012
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
                cabbageLocations.forEach {
                    if (((it.first + 1 == cabbageLocation.first || it.first - 1 == cabbageLocation.first) && it.second == cabbageLocation.second) || ((it.second + 1 == cabbageLocation.second || it.second - 1 == cabbageLocation.second) && it.first == cabbageLocation.first))
                        search.add(it)
                }
                cabbageLocations.remove(cabbageLocation)
            }
            numberOfEarthWarm++
        }
        return numberOfEarthWarm
    }

}
