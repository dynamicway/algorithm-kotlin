package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class NumberOfIslandsTest : FreeSpec({

    "container" - {

        "test1" {
            val map = arrayOf(
                intArrayOf(0)
            )

            numberOfIslands(map) shouldBe 0
        }

        "test2" {
            val map = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(0, 1)
            )

            numberOfIslands(map) shouldBe 1
        }

        "test3" {
            val map = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1)
            )

            numberOfIslands(map) shouldBe 1
        }

        "test4" {
            val map = arrayOf(
                intArrayOf(1, 0, 1, 0, 0),
                intArrayOf(1, 0, 0, 0, 0),
                intArrayOf(1, 0, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 0)
            )

            numberOfIslands(map) shouldBe 3
        }

        "test5" {
            val map = arrayOf(
                intArrayOf(1, 1, 1, 0, 1),
                intArrayOf(1, 0, 1, 0, 1),
                intArrayOf(1, 0, 1, 0, 1),
                intArrayOf(1, 0, 1, 1, 1)
            )

            numberOfIslands(map) shouldBe 1
        }

        "test6" {
            val map = arrayOf(
                intArrayOf(1, 0, 1, 0, 1),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(1, 0, 1, 0, 1),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(1, 0, 1, 0, 1)
            )

            numberOfIslands(map) shouldBe 9
        }

    }

})
