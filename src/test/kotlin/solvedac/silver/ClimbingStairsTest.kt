package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ClimbingStairsTest : FreeSpec({

    "container" - {
        "test01" {
            val dp = intArrayOf(
                10,
                20,
                15,
                25,
                10,
                20
            )

            climbingStairs(dp) shouldBe 75
        }
    }

})
