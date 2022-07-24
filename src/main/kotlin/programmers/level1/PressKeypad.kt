package programmers.level1

import kotlin.math.absoluteValue

fun pressKeypad(numbers: IntArray, hand: String): String {

    val leftHanded = hand == "left"
    val stringBuilder = StringBuilder()
    val mid = hashSetOf(2, 5, 8, 0)
    val left = hashSetOf(1, 4, 7)
    val right = hashSetOf(3, 6, 9)
    var currentLeftHand = Pair(3, 0)
    var currnetRightHand = Pair(3, 2)
    fun Pair<Int, Int>.distance(pair: Pair<Int, Int>): Int {
        return (this.first - pair.first).absoluteValue + (this.second - pair.second).absoluteValue
    }

    val buttons = hashMapOf(
        0 to Pair(3, 1),
        1 to Pair(0, 0),
        2 to Pair(0, 1),
        3 to Pair(0, 2),
        4 to Pair(1, 0),
        5 to Pair(1, 1),
        6 to Pair(1, 2),
        7 to Pair(2, 0),
        8 to Pair(2, 1),
        9 to Pair(2, 2)
    )

    numbers.forEach {
        val button = buttons[it]!!
        if (mid.contains(it)) {
            val distanceOfLeft = button.distance(currentLeftHand)
            val distanceOfRight = button.distance(currnetRightHand)
            if (distanceOfLeft == distanceOfRight) {
                if (leftHanded) {
                    currentLeftHand = button
                    stringBuilder.append("L")
                } else {
                    currnetRightHand = button
                    stringBuilder.append("R")
                }
            } else if (distanceOfLeft > distanceOfRight) {
                currnetRightHand = button
                stringBuilder.append("R")
            } else {
                currentLeftHand = button
                stringBuilder.append("L")
            }
        }
        else if (left.contains(it)) {
            currentLeftHand = button
            stringBuilder.append("L")
        } else {
            currnetRightHand = button
            stringBuilder.append("R")
        }
    }

    return stringBuilder.toString()

}
