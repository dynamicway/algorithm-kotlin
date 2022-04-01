package programmers.level3

fun immigration(n: Int, times: IntArray): Long {

    var result = 0L
    val officers = times.sorted()
    var left = 0L
    var right = times.last().toLong() * n

    while (left <= right) {
        val mid = (left + right) / 2
        var sum = 0L
        officers.forEach {
            sum += mid / it
        }
        if (sum >= n) {
            right = mid - 1
            result = mid
        }
        else
            left = mid + 1
    }

    return result
}