package solvedac.silver

//https://www.acmicpc.net/problem/7576
fun main() = with(System.`in`.bufferedReader()) {
    val arrayOf = mutableListOf<IntArray>()
    repeat(readLine().split(" ").map { it.toInt() }.last()) {
        arrayOf.add(readLine().split(" ").map { it.toInt() }.toIntArray())
    }
    println(TomatoBox(arrayOf.toTypedArray()).getFruitRipeningTime())
}

class TomatoBox(
    private val box: Array<IntArray>
) {
    fun getFruitRipeningTime(): Int {
        var fruitRipeningTime = 0
        val search1 = ArrayDeque<Pair<Int, Int>>()
        var search2 = ArrayDeque<Pair<Int, Int>>()
        box.forEachIndexed { y, rows ->
            rows.forEachIndexed { x, it ->
                if (it == 1)
                    search1.add(Pair(y, x))
            }
        }

        while (search1.isNotEmpty()) {
            val tomatoLocation = search1.removeFirst()
            if (tomatoLocation.first + 1 < box.size && box[tomatoLocation.first + 1][tomatoLocation.second] == 0) {
                box[tomatoLocation.first + 1][tomatoLocation.second] = 1
                search2.addLast(Pair(tomatoLocation.first + 1, tomatoLocation.second))
            }
            if (tomatoLocation.first > 0 && box[tomatoLocation.first - 1][tomatoLocation.second] == 0) {
                box[tomatoLocation.first - 1][tomatoLocation.second] = 1
                search2.addLast(Pair(tomatoLocation.first - 1, tomatoLocation.second))
            }
            if (tomatoLocation.second + 1 < box[tomatoLocation.first].size && box[tomatoLocation.first][tomatoLocation.second + 1] == 0) {
                box[tomatoLocation.first][tomatoLocation.second + 1] = 1
                search2.addLast(Pair(tomatoLocation.first, tomatoLocation.second + 1))
            }
            if (tomatoLocation.second > 0 && box[tomatoLocation.first][tomatoLocation.second - 1] == 0) {
                box[tomatoLocation.first][tomatoLocation.second - 1] = 1
                search2.addLast(Pair(tomatoLocation.first, tomatoLocation.second - 1))
            }
            if (search1.isEmpty() && search2.isNotEmpty()) {
                search1.addAll(search2)
                search2 = ArrayDeque()
                fruitRipeningTime++
            }
        }
        box.forEach { if (it.contains(0)) return -1 }

        return fruitRipeningTime
    }
}