package programmers.level2

fun openChatting(records: Array<String>): Array<String> {
    val lastChange = HashMap<String, String>()

    records.forEach { record ->
        if(!record.startsWith("L")) {
            val splitRecord = record.split(" ")
            lastChange[splitRecord[1]] = splitRecord[2]
        }
    }

    val stringBuilder = StringBuilder()
    val result = ArrayList<String>(records.size)

    records.filter { !it.startsWith("C") }
        .forEach {
            val record = it.split(" ")
            stringBuilder.append(lastChange[record[1]]).append(if (it.startsWith("E")) "님이 들어왔습니다." else "님이 나갔습니다.")
            result.add(stringBuilder.toString())
            stringBuilder.clear()
        }

    return result.toTypedArray()
}