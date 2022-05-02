package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class RotateArrayTest : FreeSpec({

    "container" - {

        "test01" {
            val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
            rotate(nums, 3)
            nums shouldBe intArrayOf(5, 6, 7, 1, 2, 3, 4)
        }

        "test02" {
            val nums = intArrayOf(1)
            rotate(nums, 1)
            nums shouldBe intArrayOf(1)
        }

        "test03" {
            val nums = intArrayOf(1, 2)
            rotate(nums, 2)
            nums shouldBe intArrayOf(1, 2)
        }

    }

})