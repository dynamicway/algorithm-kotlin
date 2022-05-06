package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class TwoSumTest: FreeSpec({

    "container" - {

        "test01" {
            twoSum(intArrayOf(2, 3, 4), 6) shouldBe intArrayOf(1, 3)
        }

        "test02" {
            twoSum(intArrayOf(5, 25, 75), 100) shouldBe intArrayOf(2, 3)
        }

    }

})