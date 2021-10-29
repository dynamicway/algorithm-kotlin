package programmers.level2

import kotlin.math.pow

class FindPrimeNumbers {
    fun solution(numbers: String): Int {
        return extractCombinationIndexByTarget(numbers).filter { isPrimeNumber(it.toInt()) }.size
    }

    private fun isPrimeNumber(value: Int): Boolean {
        when(value) {
            1 -> return false
            2 -> return true
        }

        for (i in 2 .. value / 2) {
            if (value % i == 0) return false
        }
        return true
    }

    private fun extractCombinationIndexByTarget(input: String): Set<String> {
        val result = mutableSetOf<String>()
        val inputSize = input.length
        var currentSize = 1

        for (i in 0 .. inputSize) {

        }

        return result
    }

}