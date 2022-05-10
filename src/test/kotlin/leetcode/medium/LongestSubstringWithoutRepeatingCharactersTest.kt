package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class LongestSubstringWithoutRepeatingCharactersTest : FreeSpec({

    "container" - {

        "test01" {
            lengthOfLongestSubstring("abcabcbb") shouldBe 3
        }

        "test02" {
            lengthOfLongestSubstring(" ") shouldBe 1
        }

        "test03" {
            lengthOfLongestSubstring("") shouldBe 0
        }

        "test04" {
            lengthOfLongestSubstring("au") shouldBe 2
        }

        "test05" {
            lengthOfLongestSubstring("pwwkew") shouldBe 3
        }

        "test06" {
            lengthOfLongestSubstring("dvdf") shouldBe 3
        }

        "test07" {
            lengthOfLongestSubstring("anviaj") shouldBe 5
        }

        "test08" {
            lengthOfLongestSubstring("umvejcuuk") shouldBe 6
        }

        "test09" {
            lengthOfLongestSubstring("bpfbhmipx") shouldBe 7
        }

    }

})