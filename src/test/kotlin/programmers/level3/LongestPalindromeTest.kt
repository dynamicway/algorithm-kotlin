package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class LongestPalindromeTest: FreeSpec({

    "container" - {

        "test01" {
            longestPalindrome("aaaaaaaaaa") shouldBe 10
        }

        "test02" {
            longestPalindrome("a") shouldBe 1
        }

        "test03" {
            longestPalindrome("abcdefghgtabc") shouldBe 3
        }

    }

})
