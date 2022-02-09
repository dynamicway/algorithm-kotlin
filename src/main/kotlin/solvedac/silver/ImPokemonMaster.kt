package solvedac.silver

fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toInt() }.toList()
    val pokeBook = ArrayList<String>()
    repeat(input[0]) {
        pokeBook.add(readLine())
    }
    val answers = ArrayList<String>()
    repeat(input[1]) {
        answers.add(readLine())
    }
    imPokemonMaster(pokeBook, answers).forEach { println(it) }
}

// https://www.acmicpc.net/problem/1620
fun imPokemonMaster(pokeBook: List<String>, answers: List<String>): List<Any> {
    val pokeBookHashMap = HashMap<String, Int>()
    pokeBook.forEachIndexed { index, s ->
        pokeBookHashMap[s] = index + 1
    }
    val result = mutableListOf<Any>()
    answers.forEach { answer ->
        when (answer.isInt()) {
            false -> result.add(pokeBookHashMap[answer]!!)
            true -> result.add(pokeBook[answer.toInt() - 1])
        }
    }
    return result
}

private fun String.isInt() = this.contains("\\d".toRegex())
