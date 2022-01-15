package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import java.util.*

class CountOfConnectionComponentTest : FreeSpec({

    "container" - {
        "test1" {
            val adjacencyList = arrayOf(
                LinkedList(listOf(1, 2, 5)),
                LinkedList(listOf(2, 5)),
                LinkedList(listOf(3, 4)),
                LinkedList(listOf(4, 6)),
                LinkedList(listOf(5, 2, 1)),
                LinkedList(listOf(6, 4))
            )

            CountOfConnectionComponent(adjacencyList).getCountOfConnectedComponents() shouldBe 2
        }

        "test2" {
            val adjacencyList = arrayOf(
                LinkedList(listOf(1, 2, 5)),
                LinkedList(listOf(2, 3, 4, 5, 1)),
                LinkedList(listOf(3, 2, 4)),
                LinkedList(listOf(4, 2, 3, 5, 6)),
                LinkedList(listOf(5, 1, 2, 4)),
                LinkedList(listOf(6, 4))
            )

            CountOfConnectionComponent(adjacencyList).getCountOfConnectedComponents() shouldBe 1

        }

        "test3" {
            val adjacencyList = arrayOf(
                LinkedList(listOf(1, 2, 5)),
                LinkedList(listOf(2, 1, 3)),
                LinkedList(listOf(3, 2, 4)),
                LinkedList(listOf(4, 3, 5)),
                LinkedList(listOf(5, 1, 4))
            )

            CountOfConnectionComponent(adjacencyList).getCountOfConnectedComponents() shouldBe 1
        }

        "test4" {
            val adjacencyList = arrayOf(
                LinkedList(listOf(1, 2, 3, 4, 5)),
                LinkedList(listOf(2, 1)),
                LinkedList(listOf(3, 1)),
                LinkedList(listOf(4, 1)),
                LinkedList(listOf(5, 1))
            )

            CountOfConnectionComponent(adjacencyList).getCountOfConnectedComponents() shouldBe 1
        }

    }

})
