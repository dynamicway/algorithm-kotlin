package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class TwoSumTest : FreeSpec({

    "container" - {

        "test01" {

            twoSum(
                nums = intArrayOf(3, 2, 4),
                target = 6
            ) shouldBe intArrayOf(2, 1)

        }

    }

})