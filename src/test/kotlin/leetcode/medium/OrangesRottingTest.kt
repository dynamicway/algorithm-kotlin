package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class OrangesRottingTest : FreeSpec({

    "container" - {

        "test1" {
            orangesRotting(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 2, 0),
                    intArrayOf(0, 0, 0)
                )
            ) shouldBe 0
        }

        "test2" {
            orangesRotting(
                arrayOf(intArrayOf(0))
            ) shouldBe 0
        }

        "test3" {
            orangesRotting(
                arrayOf(intArrayOf(1))
            ) shouldBe -1
        }

    }

})