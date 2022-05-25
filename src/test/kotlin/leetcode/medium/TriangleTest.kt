package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class TriangleTest : FreeSpec({

    "container" - {

        "test" {

            minimumTotal(
                listOf(
                    listOf(1)
                )
            ) shouldBe 1

            minimumTotal(
                listOf(
                    listOf(1),
                    listOf(1, 2)
                )
            ) shouldBe 2

            minimumTotal(
                listOf(
                    listOf(2),
                    listOf(3, 4),
                    listOf(6, 5, 7),
                    listOf(4, 1, 8, 3)
                )
            ) shouldBe 11

        }

    }

})