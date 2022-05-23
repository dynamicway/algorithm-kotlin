package leetcode.medium

fun climbStairs(n: Int): Int {
    when (n) {
        1 -> return 1
        2 -> return 2
    }

    val list = ArrayList<Int>(n)
    list.add(1)
    list.add(2)

    val lastIndex = n - 1

    (2 .. lastIndex).forEach {
        list.add(list[it - 2] + list[it - 1])
    }

    return list.last()
}
