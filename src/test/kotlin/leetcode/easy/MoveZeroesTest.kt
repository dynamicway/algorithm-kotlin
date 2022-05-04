package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class MoveZeroesTest : FreeSpec({

    "container" - {

        "test01" {
            val nums = intArrayOf(0, 1, 0, 3, 12)
            moveZeroes(nums)
            nums shouldBe intArrayOf(1, 3, 12, 0, 0)
        }

        "test02" {
            val nums = intArrayOf(0)
            moveZeroes(nums)
            nums shouldBe intArrayOf(0)
        }

        "test03" {
            val nums = intArrayOf(0, 0, 0)
            moveZeroes(nums)
            nums shouldBe intArrayOf(0, 0, 0)
        }

        "test04" {
            val nums = intArrayOf(0, 0, 0, 1)
            moveZeroes(nums)
            nums shouldBe intArrayOf(1, 0, 0, 0)
        }

    }

})