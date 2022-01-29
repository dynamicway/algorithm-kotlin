package solvedac.gold

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class TomatoBoxTest : FreeSpec({
    "container" - {

        "test1" {
            val tomatoBox = TomatoBox(
                arrayOf(
                    intArrayOf(0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 1)
                )
            )

            tomatoBox.getFruitRipeningTime() shouldBe 8
        }

        "test2" {
            val tomatoBox = TomatoBox(
                arrayOf(
                    intArrayOf(0, -1, 0, 0, 0, 0),
                    intArrayOf(-1, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 1)
                )
            )

            tomatoBox.getFruitRipeningTime() shouldBe -1
        }

        "test3" {
            val tomatoBox = TomatoBox(
                arrayOf(
                    intArrayOf(1, -1, 0, 0, 0, 0),
                    intArrayOf(0, -1, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, -1, 0),
                    intArrayOf(0, 0, 0, 0, -1, 1)
                )
            )

            tomatoBox.getFruitRipeningTime() shouldBe 6
        }

        "test4" {
            val tomatoBox = TomatoBox(
                arrayOf(
                    intArrayOf(-1, 1, 0, 0, 0),
                    intArrayOf(0, -1, -1, -1, 0),
                    intArrayOf(0, -1, -1, -1, 0),
                    intArrayOf(0, -1, -1, -1, 0),
                    intArrayOf(0, 0, 0, 0, 0)
                )
            )

            tomatoBox.getFruitRipeningTime() shouldBe 14
        }

        "test5" {
            val tomatoBox = TomatoBox(
                arrayOf(
                    intArrayOf(1, -1),
                    intArrayOf(-1, 1)
                )
            )

            tomatoBox.getFruitRipeningTime() shouldBe 0
        }

    }
})
