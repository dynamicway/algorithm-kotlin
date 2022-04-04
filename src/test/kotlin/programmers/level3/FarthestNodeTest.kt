package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class FarthestNodeTest : FreeSpec({

    "container" - {

        "test01" {
            farthestNode(6, arrayOf(
                intArrayOf(3, 6),
                intArrayOf(4, 3),
                intArrayOf(3, 2),
                intArrayOf(1, 3),
                intArrayOf(1, 2),
                intArrayOf(2, 4),
                intArrayOf(5, 2)
            )) shouldBe 3
        }

        "test02" {
            farthestNode(6, arrayOf(
                intArrayOf(3, 6),
                intArrayOf(4, 3),
                intArrayOf(3, 2),
                intArrayOf(2, 4),
                intArrayOf(5, 2)
            )) shouldBe 0
        }

        "test03" {
            farthestNode(8, arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 3)
            )) shouldBe 2
        }

        "test04" {
            farthestNode(8, arrayOf(
                intArrayOf(1, 2),
                intArrayOf(1, 3),
                intArrayOf(3, 4),
                intArrayOf(4, 5),
                intArrayOf(5, 6),
                intArrayOf(6, 7)
            )) shouldBe 1
        }

    }

})
