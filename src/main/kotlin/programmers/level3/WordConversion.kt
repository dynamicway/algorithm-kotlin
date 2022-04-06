package programmers.level3

fun wordConversion(begin: String, target: String, words: Array<String>): Int {
    val adjacencyList = hashMapOf<String, MutableList<String>>()

    adjacencyList[begin] = mutableListOf()

    words.forEach {
        adjacencyList[it] = mutableListOf()
        if (begin.canConvert(it))
            adjacencyList[begin]!!.add(it)
    }

    words.forEach { word ->
        adjacencyList[word]!!.addAll(words.filter { word.canConvert(it) })
    }

    val visited = hashMapOf<String, Boolean>()

    adjacencyList.keys.forEach { visited[it] = false }

    visited[begin] = true

    val depthMap = hashMapOf<Int, MutableList<String>>()
    var currentDepth = 1

    adjacencyList[begin]!!.forEach { visited[it] = true }

    depthMap[currentDepth] = adjacencyList[begin]!!

    while (depthMap[currentDepth]!!.isNotEmpty()) {
        val list = mutableListOf<String>()

        depthMap[currentDepth]!!.forEach { t ->
            if (t == target) return currentDepth
            val filter = adjacencyList[t]!!.filter { !visited[it]!! }
            filter.forEach { visited[it] = true }
            list.addAll(filter)
        }

        depthMap[++currentDepth] = list
    }

    return 0
}

private fun String.canConvert(target: String): Boolean {
    var hits = 0

    this.forEachIndexed { index, c ->
        if (target[index] == c) hits++
    }

    return hits == this.length - 1
}
