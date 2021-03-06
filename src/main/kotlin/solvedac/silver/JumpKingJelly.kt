package solvedac.silver

import java.util.*

// https://www.acmicpc.net/problem/16173
fun main() = with(System.`in`.bufferedReader()) {
    val jumpKingJelly = JumpKingJelly()

    val squareSize = readLine().toInt()
    val square = mutableListOf<List<Int>>()

    (0 until squareSize).forEach {
        square.add(readLine().split(" ").map { it.toInt() })
    }

    println(jumpKingJelly.solution(square))

}

class JumpKingJelly(
    private val visited: MutableList<Pair<Int, Int>> = mutableListOf(),
    private var check: Boolean = false
) {

    fun solution(square: List<List<Int>>): String {
        val stack = Stack<Pair<Int, Int>>()
        stack.add(Pair(0, 0))
        visited.add(Pair(0, 0))

        dfs(square, stack, square.size)

        return when (check) {
            true -> "HaruHaru"
            false -> "Hing"
        }
    }

    private fun dfs(square: List<List<Int>>, stack: Stack<Pair<Int, Int>>, n: Int) {
        val currentLocation = stack.pop()
        val jumpSize = square[currentLocation.first][currentLocation.second]
        if (square[currentLocation.first][currentLocation.second] == -1)
            check = true
        if (currentLocation.first + jumpSize < n) {
            val nextLocation = Pair(currentLocation.first + jumpSize, currentLocation.second)
            if (!visited.contains(nextLocation)) {
                visited.add(nextLocation)
                stack.add(nextLocation)
                dfs(square, stack, n)
            }
        }
        if (currentLocation.second + jumpSize < n) {
            val nextLocation = Pair(currentLocation.first, currentLocation.second + jumpSize)
            if (!visited.contains(nextLocation)) {
                visited.add(nextLocation)
                stack.add(nextLocation)
                dfs(square, stack, n)
            }
        }
    }

}