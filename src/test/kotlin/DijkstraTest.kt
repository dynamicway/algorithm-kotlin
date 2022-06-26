import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class DijkstraTest: FreeSpec({

    "linearSearch" - {

        "test01" {

            val nodes = arrayOf(
                arrayOf(0, 2, null, 1, null, null),
                arrayOf(2, 0, 3, 2, null, null),
                arrayOf(null, 3, 0, null, null, 5),
                arrayOf(1, 2, null, 0, 1, null),
                arrayOf(null, null, null, 1, 0, 2),
                arrayOf(null, null, 5, null, 2, 0)
            )

            Dijkstra.linearSearch(nodes, Pair(0, 5)) shouldBe 4

        }

        "test02" {

            val nodes = arrayOf(
                arrayOf(0, 2, 5, 1, null, null),
                arrayOf(2, 0, 3, 2, null, null),
                arrayOf<Int?>(5, 3, 0, 3, 1, 5),
                arrayOf(1, 2, 3, 0, 1, null),
                arrayOf(null, null, 1, 1, 0, 2),
                arrayOf(null, null, 5, null, 2, 0)
            )

            Dijkstra.linearSearch(nodes, Pair(0, 5)) shouldBe 4

        }
    }

})
