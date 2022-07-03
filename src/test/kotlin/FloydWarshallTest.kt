import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class FloydWarshallTest: FreeSpec({
    "container" - {
        "test01" {
            FloydWarshall.run(
                hashMapOf(
                    FloydWarshall.Node(0, 0) to listOf(
                        FloydWarshall.Node(1, 4),
                        FloydWarshall.Node(3, 6)
                    ),
                    FloydWarshall.Node(1, 0) to listOf(
                        FloydWarshall.Node(0, 3),
                        FloydWarshall.Node(2, 7)
                    ),
                    FloydWarshall.Node(2, 0) to listOf(
                        FloydWarshall.Node(0, 5),
                        FloydWarshall.Node(3, 4)
                    ),
                    FloydWarshall.Node(3, 0) to listOf(
                        FloydWarshall.Node(2, 2)
                    ),
                )
            ) shouldBe arrayOf(
                intArrayOf(0, 4, 8, 6),
                intArrayOf(3, 0, 7, 9),
                intArrayOf(5, 9, 0, 4),
                intArrayOf(7, 11, 2, 0)
            )
        }
    }
})
