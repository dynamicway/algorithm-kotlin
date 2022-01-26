package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class WordMathTest : FreeSpec({

    "container" - {

        "test01" {
            val words = arrayOf(
                "AAA",
                "AAA"
            )

            wordMath(words) shouldBe 1998
        }

        "test02" {
            val words = arrayOf(
                "GCF",
                "ACDEB"
            )

            wordMath(words) shouldBe 99437
        }

        "test03" {
            val words = arrayOf(
                "A",
                "B",
                "C",
                "D",
                "E",
                "F",
                "G",
                "H",
                "I",
                "J"
            )

            wordMath(words) shouldBe 45
        }

        "test04" {
            val words = arrayOf(
                "AB",
                "BA"
            )

            wordMath(words) shouldBe 187
        }

    }

})
