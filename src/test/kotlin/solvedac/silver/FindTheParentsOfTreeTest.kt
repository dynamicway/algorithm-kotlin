package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import java.util.*

class FindTheParentsOfTreeTest : FreeSpec({

    "container" - {

        "test01" {
            val tree = arrayOf(
                LinkedList(listOf(1, 4, 6)),
                LinkedList(listOf(2, 4)),
                LinkedList(listOf(3, 6, 5)),
                LinkedList(listOf(4, 1, 2, 7)),
                LinkedList(listOf(5, 3)),
                LinkedList(listOf(6, 1, 3)),
                LinkedList(listOf(7, 4))
            )

            findTheParentsOfTree(tree) shouldBe setOf(
                Pair(2, 4),
                Pair(3, 6),
                Pair(4, 1),
                Pair(5, 3),
                Pair(6, 1),
                Pair(7, 4),
            )
        }

        "test02" {
            val tree = arrayOf(
                LinkedList(listOf(1, 2, 3)),
                LinkedList(listOf(2, 1, 4)),
                LinkedList(listOf(3, 1, 6, 5)),
                LinkedList(listOf(4, 2, 7, 8)),
                LinkedList(listOf(5, 3, 9, 10)),
                LinkedList(listOf(6, 3, 11, 12)),
                LinkedList(listOf(7, 4)),
                LinkedList(listOf(8, 4)),
                LinkedList(listOf(9, 5)),
                LinkedList(listOf(10, 5)),
                LinkedList(listOf(11, 6)),
                LinkedList(listOf(12, 6))
            )

            findTheParentsOfTree(tree) shouldBe setOf(
                Pair(2, 1),
                Pair(3, 1),
                Pair(4, 2),
                Pair(5, 3),
                Pair(6, 3),
                Pair(7, 4),
                Pair(8, 4),
                Pair(9, 5),
                Pair(10, 5),
                Pair(11, 6),
                Pair(12, 6)
            )
        }

        "test03" {
            val tree = arrayOf(
                LinkedList(listOf(1, 2)),
                LinkedList(listOf(2, 1))
            )

            findTheParentsOfTree(tree) shouldBe setOf(
                Pair(2, 1)
            )
        }

        "test04" {
            val tree = arrayOf(
                LinkedList(listOf(1, 2, 3, 4, 5)),
                LinkedList(listOf(2, 1)),
                LinkedList(listOf(3, 1)),
                LinkedList(listOf(4, 1)),
                LinkedList(listOf(5, 1))
            )

            findTheParentsOfTree(tree) shouldBe setOf(
                Pair(2, 1),
                Pair(3, 1),
                Pair(4, 1),
                Pair(5, 1)
            )
        }

    }

})
