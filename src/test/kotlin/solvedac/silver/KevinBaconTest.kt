package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class KevinBaconTest : FreeSpec({

    "container" - {

        "test01" {
            val friends = arrayOf(
                intArrayOf(0, 5001, 1, 1, 5001),
                intArrayOf(5001, 0, 1, 5001, 5001),
                intArrayOf(1, 1, 0, 1, 5001),
                intArrayOf(1, 5001, 1, 0, 1),
                intArrayOf(5001, 5001, 5001, 1, 0)
            )

            kevinBacon(friends) shouldBe 3
        }

    }

})
