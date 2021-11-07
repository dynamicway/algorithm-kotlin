package programmers.level1

// https://programmers.co.kr/learn/courses/30/lessons/76501
class PlusDarkAndBright {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0
        absolutes.forEachIndexed {index, i ->
            when(signs[index]){
                true -> sum += i
                false -> sum -= i
            }
        }
        return sum
    }
}