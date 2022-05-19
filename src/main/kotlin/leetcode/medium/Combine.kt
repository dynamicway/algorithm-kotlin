package leetcode.medium

fun combine(n: Int, k: Int): List<List<Int>> {

    val result = mutableListOf<List<Int>>()

    fun dfs(list: MutableList<Int>, start: Int, remaining: Int) {
        if (remaining == 0) {
            result.add(list.toList())
            return
        }

        (start..n).forEach {
            if (list.size + n - it + 1 < k)
                return

            list.add(it)
            dfs(list, it + 1, remaining - 1)
            list.removeAt(list.lastIndex)
        }
    }

    dfs(mutableListOf(), 1, k)

    return result
}