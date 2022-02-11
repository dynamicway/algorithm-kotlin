package solvedac.silver

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    println(countOfFactorialZero(readLine().toInt()))
}

// https://www.acmicpc.net/problem/1676
fun countOfFactorialZero(number: Int): Int {
    var factorial = BigInteger.ONE
    for (i in 1 .. number) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    var result = 0
    val factorialString = factorial.toString()
    for (i in factorialString.length - 1 downTo 0) {
        if (factorialString[i] != '0') break
        result++
    }
    return result
}