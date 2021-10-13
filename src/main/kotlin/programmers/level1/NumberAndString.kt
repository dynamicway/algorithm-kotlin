package programmers.level1

import java.util.*
import kotlin.math.pow

class NumberAndString {
    fun solution(s: String): Int {
        val array = LinkedList(s.toCharArray().toMutableList())

        for (i in 0 until array.size) {
            if (i == array.size) break
            if (array[i].isLetter()) {
                val number = Matchers.selectByFirstLast(array[i], array[i + 1])
                array[i] = number.number
                (1 until number.length).forEach {x ->
                    array.removeAt(i + 1)
                }
            }
        }
        var result = 0
        array.forEachIndexed { i, it ->
            result += (it - '0') * 10.0.pow((array.size - i - 1).toDouble()).toInt()
        }
        return result
    }

    private enum class Matchers(val number: Char, val length: Int) {
        ZERO('0', 4),
        ONE('1', 3),
        TWO('2', 3),
        THREE('3', 5),
        FOUR('4', 4),
        FIVE('5', 4),
        SIX('6', 3),
        SEVEN('7', 5),
        EIGHT('8', 5),
        NINE('9', 4);

        companion object {

            fun selectByFirstLast(first: Char, second: Char): Matchers {
                return when (first) {
                    'z' -> ZERO
                    'o' -> ONE
                    't' -> when (second) {
                        'w' -> TWO
                        'h' -> THREE
                        else -> throw IllegalStateException()
                    }
                    'f' -> when (second) {
                        'o' -> FOUR
                        'i' -> FIVE
                        else -> throw IllegalStateException()
                    }
                    's' -> when (second) {
                        'i' -> SIX
                        'e' -> SEVEN
                        else -> throw IllegalStateException()
                    }
                    'e' -> EIGHT
                    'n' -> NINE
                    else -> throw IllegalStateException()
                }
            }
        }
    }
}