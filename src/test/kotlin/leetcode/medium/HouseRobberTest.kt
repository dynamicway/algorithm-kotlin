package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class HouseRobberTest : FreeSpec({

    "container" - {

        "test" {
            rob(intArrayOf(1, 5000)) shouldBe 5000
        }

        "test" {
            rob(intArrayOf(1)) shouldBe 1
        }

        "test" {
            rob(intArrayOf(1, 2, 3)) shouldBe 4
        }

    }

})