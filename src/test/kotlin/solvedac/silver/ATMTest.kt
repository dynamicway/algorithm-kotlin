package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ATMTest : FreeSpec({

    "container" - {

        "test01" {
            val costs = arrayListOf(1, 2, 3, 3, 4)
            atm(costs) shouldBe 32
        }

    }

})
