package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class FloodFillTest : FreeSpec({

    "container" - {

        "test1" {
            floodFill(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 1, 1)
                ), 1, 1, 1
            ) shouldBe arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(1, 1, 1)
            )
        }

    }

})