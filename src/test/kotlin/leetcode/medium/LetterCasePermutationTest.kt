package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.collections.shouldContainAll

internal class LetterCasePermutationTest : FreeSpec({

    "container" - {

        "test" {
            letterCasePermutation("a1b2") shouldContainAll listOf(
                "a1b2",
                "A1b2",
                "a1B2",
                "A1B2"
            )
        }

    }

})