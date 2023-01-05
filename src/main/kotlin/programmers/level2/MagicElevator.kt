package programmers.level2

fun magicElevator(storey: Int): Int {
    var current = storey
    var result = 0
    while (current > 0) {
        val memory = current % 10
        if (memory > 5) {
            result += 10 - memory
            current += 10
        }
        else if (memory < 5)
            result += memory
        else {
            if ((current / 10) % 10 > 4)
                current += 10
            result += memory
        }
        current /= 10
    }
    return result
}
