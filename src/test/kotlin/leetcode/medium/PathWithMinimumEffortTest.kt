package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class PathWithMinimumEffortTest: FreeSpec({
    "container" - {
        "test01" {
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 2),
                    intArrayOf(3, 8, 2),
                    intArrayOf(5, 3, 5)
                )
            ) shouldBe 2
        }

        "test02" {
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(3, 8, 4),
                    intArrayOf(5, 3, 5)
                )
            ) shouldBe 1
        }

        "test03" {
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 1, 1, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 1, 1, 2, 1)
                )
            ) shouldBe 0
        }

        "test04" {
            minimumEffortPath(
                arrayOf(
                    intArrayOf(3)
                )
            ) shouldBe 0
        }

        "test05" {
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1,10,6,7,9,10,4,9)
                )
            ) shouldBe 9
        }
    }
})
