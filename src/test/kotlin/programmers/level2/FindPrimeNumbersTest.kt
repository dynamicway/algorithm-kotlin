package programmers.level2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import kotlin.math.sqrt

internal class FindPrimeNumbersTest: FreeSpec({

    "container" - {

        "test01" {
            findPrimeNumber("17") shouldBe 3
        }

        "test02" {
            findPrimeNumber("011") shouldBe 2
        }

        "test03" {
            findPrimeNumber("0000") shouldBe 0
        }

        "test04" {
            findPrimeNumber("00000001") shouldBe 0
        }

        "test05" {
            findPrimeNumber("000002") shouldBe 1
        }

        "test06" {
            findPrimeNumber("22222") shouldBe 1
        }

        "test07" {
            findPrimeNumber("1231") shouldBe 18
        }

        "test08" {
            println(sqrt(10.toFloat()).toInt())
        }

    }

})