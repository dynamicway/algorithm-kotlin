package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class CombineTest : FreeSpec({

    "container" - {

        "test1" {
            combine(4, 2) shouldBe listOf(
                listOf(1, 2),
                listOf(1, 3),
                listOf(1, 4),
                listOf(2, 3),
                listOf(2, 4),
                listOf(3, 4)
            )
        }

    }

})