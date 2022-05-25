package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class PowerOfTwoTest : FreeSpec({

    "container" - {

        "test0" {
            isPowerOfTwo(0) shouldBe false
        }

        "test1" {
            isPowerOfTwo(4) shouldBe true
        }

        "test2" {
            isPowerOfTwo(3) shouldBe false
        }

        "test3" {
            isPowerOfTwo(1024) shouldBe true
        }

        "test4" {
            isPowerOfTwo(1023) shouldBe false
        }

        "test5" {
            isPowerOfTwo(536870912) shouldBe true
        }

    }

})