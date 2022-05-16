package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class UpdateMatrixTest : FreeSpec({

    "container" - {

        "test1" {

            updateMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(1, 1, 1)
                )
            ) shouldBe arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(1, 2, 1),
            )
        }

    }

})