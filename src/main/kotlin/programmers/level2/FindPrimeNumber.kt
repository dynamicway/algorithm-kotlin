package programmers.level2

import kotlin.math.sqrt

fun findPrimeNumber(number: String): Int {
    val numbers = number.toCharArray().map { it - '0' }

    val nodes = ArrayList<Node>()
    numbers.toHashSet().forEach {
        val node = Node("$it")
        node.createChildren(numbers)
        nodes.add(node)
    }

    val primeNumbers = HashSet<Int>()

    nodes.forEach {
        if (it.number.isPrimeNumber())
            primeNumbers.add(it.number.toInt())
        it.getPrimeNumbers(primeNumbers)
    }

    return primeNumbers.size
}

private class Node(
    val number: String,
    private val children: HashSet<Node> = HashSet()
) {

    fun createChildren(src: List<Int>) {
        val toMutableList = src.toMutableList()

        number.forEach {
            toMutableList.remove(it - '0')
        }

        if (toMutableList.isEmpty())
            return

        toMutableList.forEach {
            children.add(Node("$number$it"))
        }

        children.forEach {
            it.createChildren(src)
        }
    }

    fun getPrimeNumbers(primeNumbers: MutableSet<Int>) {
        if (children.isEmpty())
            return
        children.forEach { child ->
            if (child.number.isPrimeNumber())
                primeNumbers.add(child.number.toInt())
        }
        children.forEach {
            it.getPrimeNumbers(primeNumbers)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Node

        if (number != other.number) return false
        if (children != other.children) return false

        return true
    }

    override fun hashCode(): Int {
        var result = number.hashCode()
        result = 31 * result + children.hashCode()
        return result
    }


}

private fun String.isPrimeNumber(): Boolean {
    val int = this.toInt()

    when (int) {
        0 -> return false
        1 -> return false
    }

    (2..sqrt(int.toFloat()).toInt()).forEach {
        if (int % it == 0) return false
    }

    return true
}
