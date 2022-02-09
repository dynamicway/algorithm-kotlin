package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class LostParenthesisTest : FreeSpec({

    "container" - {

        "test01" {
            lostParenthesis(mutableListOf(55, -50, 40)) shouldBe -35
        }

        "test02" {
            lostParenthesis(mutableListOf(10, 20, 30, 40)) shouldBe 100
        }

        "test03" {
            lostParenthesis(mutableListOf(9, -9)) shouldBe 0
        }

    }

})
