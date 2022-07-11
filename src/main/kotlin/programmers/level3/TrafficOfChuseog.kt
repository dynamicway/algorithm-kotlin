package programmers.level3

fun trafficOfChuseog(lines: Array<String>): Int {
    val endIndex = 23
    val logs = mutableListOf<Pair<Int, Int>>()
    var result = 0

    for (line in lines) {
        val duration = (line.substring(endIndex + 1, line.length - 1)
                .toDouble() * 1000).toInt()
        val hour = line.substring(11, 13)
                .toInt()
        val minute = line.substring(14, 16)
                .toInt()
        val second = line.substring(17, 19)
                .toInt()
        val milliSecond = line.substring(20, 23)
                .toInt()
        val until = ((hour * 3600) + (minute * 60) + second) * 1000 + milliSecond
        val since = until - duration + 1

        logs.add(Pair(since, until))
    }

    fun compare(
        log: Int,
        compareLogSince: Int,
        compareLogUntil: Int
    ): Boolean {
        return (log <= compareLogSince && compareLogSince <= log + 999) || (log >= compareLogSince && log + 999 <= compareLogUntil) || (log <= compareLogUntil && compareLogUntil <= log + 999)
    }

    for (log in logs) {
        var maxOfSince = 0
        var maxOfUntil = 0
        for (compareLog in logs) {
            if (compare(log.first, compareLog.first, compareLog.second))
                maxOfSince++
            if (compare(log.second, compareLog.first, compareLog.second))
                maxOfUntil++
        }
        result = maxOf(result, maxOfSince, maxOfUntil)
    }

    return result
}
