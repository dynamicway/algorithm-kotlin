package solvedac.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val results = mutableListOf<Int>()
    while (true) {
        val mapInfo = readLine().split(" ").map { it.toInt() }
        if (mapInfo.first() == 0 && mapInfo.last() == 0) break
        val map = Array(mapInfo.last()) { IntArray(0) }
        for (i in map.indices) {
            map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
        }
        results.add(numberOfIslands(map))
    }
    results.forEach { println(it) }
}

//https://www.acmicpc.net/problem/4963
fun numberOfIslands(map: Array<IntArray>): Int {
    val search = LinkedList<Pair<Int, Int>>()
    var result = 0
    for (i in map.indices) {
        for (j in map[i].indices) {
            if (map[i][j] == 1) {
                search.add(Pair(i, j))
                while (search.isNotEmpty()) {
                    val location = search.removeLast()
                    val row = location.first
                    val colum = location.second
                    map[row][colum] = 0
                    if (row != 0 && colum != 0 && map[row - 1][colum - 1] == 1) search.add(Pair(row - 1, colum - 1))
                    if (row != 0 && map[row - 1][colum] == 1) search.add(Pair(row - 1, colum))
                    if (row != 0 && colum < map[row].size - 1 && map[row - 1][colum + 1] == 1) search.add(Pair(row - 1, colum + 1))
                    if (colum != 0 && map[row][colum - 1] == 1) search.add(Pair(row, colum - 1))
                    if (colum < map[row].size - 1 && map[row][colum + 1] == 1) search.add(Pair(row, colum + 1))
                    if (row < map.size - 1 && colum != 0 && map[row + 1][colum - 1] == 1) search.add(Pair(row + 1, colum - 1))
                    if (row < map.size - 1&& map[row + 1][colum] == 1) search.add(Pair(row + 1, colum))
                    if (row < map.size - 1&& colum < map[row].size - 1 && map[row + 1][colum + 1] == 1) search.add(Pair(row + 1, colum + 1))
                }
                result++
            }
        }
    }
    return result
}