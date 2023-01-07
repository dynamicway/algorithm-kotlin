package solvedac.silver

fun sieveOfEratosthenes(n: Int, k: Int): Int {
    val visited = mutableSetOf<Int>()
    var current = 2
    var multiple = 1
    var count = 0
    var result = n
    while (count != k) {
        if (current * multiple > n) {
            multiple = 1
            if (!(++current).isPrime()) continue
        }
        if (!visited.contains(current * multiple)) {
            count++
            result = current * multiple
            visited.add(current * multiple)
        }
        multiple++
    }
    return result
}

private fun Int.isPrime(): Boolean {
    var i = 2
    while (i*i <= this) {
        if (this % i++ == 0) return false
    }
    return true
}

fun main() {
    val bufferedReader = System.`in`.bufferedReader()
    val bufferedWriter = System.out.bufferedWriter()
    val ints = bufferedReader.readLine().split(" ").toList().map { it.toInt() }
    bufferedWriter.write(sieveOfEratosthenes(ints[0], ints[1]).toString())
    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()
}
