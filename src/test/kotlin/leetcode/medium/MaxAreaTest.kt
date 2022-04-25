package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class MaxAreaTest : FreeSpec({

    "container" - {

        "test01" {

            maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)) shouldBe 49

        }


    }

})