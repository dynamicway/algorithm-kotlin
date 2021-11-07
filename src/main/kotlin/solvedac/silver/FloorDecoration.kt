package solvedac.silver

import kotlin.math.floor

// https://www.acmicpc.net/problem/1388
class FloorDecoration(
    private val visited: MutableSet<Pair<Int, Int>> = mutableSetOf(),
    private var width: Int = 0,
    private var height: Int = 0,
    private var count: Int = 0
) {

    fun solution(floor: List<List<Char>>): Int {
        width = floor[0].size
        height = floor.size

        while (visited.size != width * height) {
            for (i in 0 until height) {
                for (j in 0 until width) {
                    val currentLocation = Pair(i, j)
                    if (!visited.contains(currentLocation)) {
                        visited.add(currentLocation)
                        search(currentLocation, floor)
                    }
                }
            }
        }

        return count
    }

    private fun search(location: Pair<Int, Int>, floor: List<List<Char>>) {
        val firstLocation = floor[location.first][location.second]
        if (firstLocation == '-') {
            (location.second + 1 until width).forEach {
                if (floor[location.first][it] == '|') {
                    count++
                    return
                }
                visited.add(Pair(location.first, it))
            }
        }
        if (firstLocation == '|') {
            (location.first + 1 until height).forEach {
                if (floor[it][location.second] == '-') {
                    count++
                    return
                }
                visited.add(Pair(it, location.second))
            }
        }
        count++
    }

}