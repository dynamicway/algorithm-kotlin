package solvedac.silver

import java.util.*
import kotlin.collections.HashSet

// https://www.acmicpc.net/problem/1764
fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toInt() }
    val hearCount = input[0]
    val sayCount = input[1]
    val hearSay = HashSet<String>()
    val hearHashSet = TreeSet<String>()
    repeat(hearCount) {
        hearSay.add(readLine())
    }
    repeat(sayCount) {
        val say = readLine()
        if (!hearSay.add(say)) {
            hearHashSet.add(say)
        }
    }
    println(hearHashSet.size)
    hearHashSet.forEach { println(it) }
}
