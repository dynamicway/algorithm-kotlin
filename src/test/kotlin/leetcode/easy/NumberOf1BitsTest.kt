package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class NumberOf1BitsTest : FreeSpec({

    "container" - {

        "test1" {
            hammingWeight(3) shouldBe 2
        }

        "test2" {
            hammingWeight(4) shouldBe 1
        }

        "test3" {
            hammingWeight(4294967293) shouldBe 31
        }

    }

})