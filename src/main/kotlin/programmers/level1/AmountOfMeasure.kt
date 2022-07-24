package programmers.level1

fun amountOfMeasure(left: Int, right: Int): Int {
    var result = 0

    fun Int.getNumberOfMeasure(): Int {
        var i = 1
        var result = 0
        while (i*i <= this) {
            if (i*i == this)
                result += 1
            else if (this % i == 0)
                result += 2
            i++
        }
        return result
    }

    for (i in left .. right) {
        if (i.getNumberOfMeasure() % 2 == 0)
            result += i
        else
            result -= i
    }

    return result
}
