package solvedac.silver

fun sugarDelivery(n: Int): Int {
    if (setOf(1, 2, 4, 7).contains(n))
        return -1
    if (n % 5 == 0)
        return n / 5
    if ((n - 6) % 5 == 0)
        return ((n - 6) / 5) + 2
    if ((n - 12) % 5 == 0)
        return ((n - 12) / 5) + 4
    if ((n - 3) % 5 == 0)
        return ((n - 3) / 5) + 1
    if ((n - 9) % 5 == 0)
        return ((n - 9) / 5) + 3
    throw RuntimeException("unbelievable your idea")
}

fun main() {
    val bufferedReader = System.`in`.bufferedReader()
    val bufferedWriter = System.out.bufferedWriter()
    bufferedWriter.write(sugarDelivery(bufferedReader.readLine().toInt()).toString())
    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()
}
