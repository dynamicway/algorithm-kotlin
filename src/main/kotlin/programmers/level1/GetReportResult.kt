package programmers.level1

fun getReportResult(ids: Array<String>, report: Array<String>, k: Int): IntArray {
    val reportMap = hashMapOf<String, HashSet<String>>()
    ids.forEach { id -> reportMap[id] = hashSetOf() }
    val reportCount = hashMapOf<String, Int>()
    report.forEach { r ->
        val reportInfo = r.split(" ")
        val reportSet = reportMap[reportInfo.first()]!!
        if (reportSet.add(reportInfo.last())) {
            var count = reportCount.computeIfAbsent(reportInfo.last()) { 0 }
            reportCount[reportInfo.last()] = ++count
        }
    }
    val result = IntArray(ids.size) { 0 }
    ids.forEachIndexed { index, id ->
        val reportSet = reportMap.get(id)!!
        result[index] = reportSet.filter {
            reportCount[it]!! >= k
        }.size
    }
    return result
}