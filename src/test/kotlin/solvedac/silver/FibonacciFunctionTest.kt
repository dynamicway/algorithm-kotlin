package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FibonacciFunctionTest : FreeSpec({

    "container" - {

        "test01" {
            val values = intArrayOf(0, 1, 3)

            fibonacciFunction(values) shouldBe arrayOf(
                Pair(1, 0),
                Pair(0, 1),
                Pair(1, 2)
            )
        }

        "test02" {
            val values = intArrayOf(6, 22)

            fibonacciFunction(values) shouldBe arrayOf(
                Pair(5, 8),
                Pair(10946, 17711)
            )
        }

        "test03" {
            val values = intArrayOf(0)

            fibonacciFunction(values) shouldBe arrayOf(
                Pair(1, 0)
            )
        }

        "test04" {
            val values = intArrayOf(1)

            fibonacciFunction(values) shouldBe arrayOf(
                Pair(0, 1)
            )
        }

        "test05" {
            val values = intArrayOf(3)

            fibonacciFunction(values) shouldBe arrayOf(
                Pair(1, 2)
            )
        }

    }


})
