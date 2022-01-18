package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MakeOneKtTest : FreeSpec({

    "container" - {

        "test1" {
            makeOne(2) shouldBe 1
        }

        "test2" {
            makeOne(10) shouldBe 3
        }

        "test3" {
            makeOne(100) shouldBe 7
        }

    }

})
