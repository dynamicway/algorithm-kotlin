package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ExpressedAsNTest : FreeSpec({

    "container" - {

        "test01" {
            expressedAsN(5, 12) shouldBe 4
        }

        "test02" {
            expressedAsN(2, 11) shouldBe 3
        }

        "test03" {
            expressedAsN(9, 9) shouldBe 1
        }

        "test04" {
            expressedAsN(2, 22) shouldBe 2
        }

    }

})
