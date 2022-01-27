package solvedac.silver

// https://www.acmicpc.net/problem/12865
fun main() = with(System.`in`.bufferedReader()) {
    val info = readLine().split(" ").map { it.toInt() }
    val dp = Array(info[0]) {
        val itemInfo = readLine().split(" ").map { it.toInt() }
        Item(itemInfo[0], itemInfo[1])
    }

    println(plainBackpack(dp, info[1]))
}

fun plainBackpack(items: Array<Item>, ability: Int): Int {

    val dp = Array(items.size) { IntArray(ability + 1) }

    dp.forEachIndexed { itemIndex, worthValues ->
        worthValues.forEachIndexed { currentMaxWeight, worth ->
            if (items[itemIndex].weight > currentMaxWeight) {
                if (itemIndex == 0)
                    dp[itemIndex][currentMaxWeight] = 0
                else
                    dp[itemIndex][currentMaxWeight] = dp[itemIndex - 1][currentMaxWeight]
            } else {
                if (itemIndex == 0)
                    dp[itemIndex][currentMaxWeight] = items[itemIndex].worth
                else
                    dp[itemIndex][currentMaxWeight] = maxOf(
                        dp[itemIndex - 1][currentMaxWeight],
                        dp[itemIndex - 1][currentMaxWeight - items[itemIndex].weight] + items[itemIndex].worth
                    )
            }

        }
    }

    return dp.last().last()
}

class Item(
    val weight: Int,
    val worth: Int
)
