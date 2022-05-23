package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ClimbingStairsTest: FreeSpec({

    "container" - {

        "test" {
            climbStairs(45) shouldBe 1836311903
        }

    }

})