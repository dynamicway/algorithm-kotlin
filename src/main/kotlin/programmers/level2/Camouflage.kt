package programmers.level2

class Camouflage {
    fun solution(clothes: Array<Array<String>>): Int {
        return clothes.groupBy { it[1] }
            .values
            .map { it.size + 1 }
            .reduce { acc, i -> acc * i }
            .minus(1)
    }
}