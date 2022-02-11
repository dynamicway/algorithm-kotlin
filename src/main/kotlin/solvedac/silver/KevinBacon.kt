package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toInt() }
    val friends = Array(input[0]) { IntArray(input[0]) }
    friends.forEachIndexed { index, ints ->
        repeat(input[0]) { i ->
            ints[i] = 5001
            if (index == i)
                ints[i] = 0
        }

    }
    repeat(input[1]) {
        val relationShip = readLine().split(" ").map { it.toInt() }
        friends[relationShip[0] - 1][relationShip[1] - 1] = 1
        friends[relationShip[1] - 1][relationShip[0] - 1] = 1
    }
    println(kevinBacon(friends))
}

// https://www.acmicpc.net/problem/1389
fun kevinBacon(friends: Array<IntArray>): Int {
    val SIZE = friends.size
    for (k in 0 until SIZE) {
        for (i in 0 until SIZE) {
            if (i == k) continue
            for (j in 0 until SIZE) {
                if (j == k || i == j) continue
                friends[i][j] = minOf(friends[i][j], friends[i][k] + friends[k][j])
            }
        }
    }
    var min = 5001
    var kevenBacon = 101
    friends.forEachIndexed { index, it ->
        val sum = it.sum()
        if (min > sum) {
            min = sum
            val node = index + 1
            kevenBacon = node
        }

    }
    return kevenBacon
}
