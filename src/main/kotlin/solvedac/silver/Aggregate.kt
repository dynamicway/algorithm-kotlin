package solvedac.silver

fun main() {
    val bufferedReader = System.`in`.bufferedReader()
    val bufferedWriter = System.out.bufferedWriter()

    var set = 0L
    val numberOfCommand = bufferedReader.readLine().toInt()
    repeat(numberOfCommand) {
        val command = bufferedReader.readLine().split(" ")
        when (command[0]) {
            "all" -> set = all()
            "empty" -> set = empty()
            "add" -> set = set.add(command[1].toInt())
            "remove" -> set = set.remove(command[1].toInt())
            "toggle" -> set = set.toggle(command[1].toInt())
            "check" -> {
                if (set != set.add(command[1].toInt()))
                    bufferedWriter.write("0\n")
                else
                    bufferedWriter.write("1\n")
            }
        }
    }
    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()
}

private infix fun Long.add(i: Int) = this or (1L shl i - 1)
private infix fun Long.remove(i: Int) = this and (1L shl i - 1).inv()
private infix fun Long.toggle(i: Int) = this xor (1L shl i - 1)
private fun all() = 0L.inv()
private fun empty() = 0L
