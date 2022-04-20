package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class ValidParenthesesTest: FreeSpec({

    "conatiner" - {

        "test01" {

            validParentheses("{[([])]}") shouldBe true

        }

    }

})