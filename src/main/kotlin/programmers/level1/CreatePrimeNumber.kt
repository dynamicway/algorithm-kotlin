package programmers.level1

fun createPrimeNumber(nums: IntArray): Int {
    val size = nums.size

    fun Int.isPrime(): Boolean {
        var i = 2
        while (i * i <= this) {
            if (this % i == 0) return false
            i++
        }
        return true
    }

    var result = 0

    for (i in 0 until size) {
        for (j in i + 1 until size) {
            for (k in j + 1 until size) {
                if ((nums[i] + nums[j] + nums[k]).isPrime())
                    result++
            }
        }
    }

    return result
}

fun combination(
    nums: IntArray,
    target: Int,
    temp: ArrayDeque<Int>,
    answer: MutableList<IntArray>
): MutableList<IntArray> {
    if (temp.size == target) {
        val intArray = IntArray(target)
        temp.forEachIndexed { index, i ->
            intArray[index] = nums[i]
        }
        answer.add(intArray)
        return answer
    }
    val lastIndex = if (temp.size == 0) 0 else temp.last() + 1

    for (i in lastIndex until nums.size) {
        temp.addLast(i)
        combination(nums, target, temp, answer)
        temp.removeLast()
    }

    return answer
}
