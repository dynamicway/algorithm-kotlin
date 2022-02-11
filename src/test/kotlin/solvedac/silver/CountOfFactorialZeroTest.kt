package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CountOfFactorialZeroTest : FreeSpec({

    "container" - {

        "test01" {
            countOfFactorialZero(10) shouldBe 2
        }

        "test02" {
            countOfFactorialZero(3) shouldBe 0
        }

        "test03" {
            countOfFactorialZero(500) shouldBe 124
        }

        "test06" {
            countOfFactorialZero(1) shouldBe 0
        }

        "test07" {
            countOfFactorialZero(0) shouldBe 0
        }


    }

})
