package solvedac.silver

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val size = readLine().toInt()
    val words = Array(size) { "" }
    repeat(size) {
        words[it] = readLine()
    }
    println(wordMath(words))
}

// https://www.acmicpc.net/problem/1339
fun wordMath(words: Array<String>): Long {
    val wordCount = mutableListOf<Alphabet>()
    words.forEach { word ->
        word.forEachIndexed { index, alphabet ->
            val count = 10.0.pow(word.length - index - 1).toInt()
            val let = wordCount.firstOrNull { it.alphabet == alphabet.toString() }?.let {
                it.count += count
            }
            if (let == null)
                wordCount.add(Alphabet(alphabet.toString(), count))
        }
    }

    wordCount.sort()

    var max = 0L
    wordCount.forEachIndexed { index, alphabet ->
        max += (9 - index) * alphabet.count
    }

    return max
}

class Alphabet(
    val alphabet: String,
    var count: Int
): Comparable<Alphabet>{

    override fun compareTo(other: Alphabet): Int {
        return other.count - count
    }

}
