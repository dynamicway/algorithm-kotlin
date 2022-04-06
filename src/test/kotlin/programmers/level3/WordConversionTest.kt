package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class WordConversionTest : FreeSpec({

    "container" - {

        "test01" {
            wordConversion(
                "hit",
                "cog",
                arrayOf("hot", "dot", "dog", "lot", "log", "cog")
            ) shouldBe 4
        }

        "test02" {
            wordConversion(
                "hit",
                "cog",
                arrayOf("hot", "dot", "dog", "lot", "log")
            ) shouldBe 0
        }

    }

})
