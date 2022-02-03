package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class Add123Test : FreeSpec({

    "container" - {

        "test01" {
            val testCases = listOf(4, 7, 10)

            add123(testCases) shouldBe listOf(7, 44, 274)
        }

    }

})
