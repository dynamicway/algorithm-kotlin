package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class GetPrefixSumTest : FreeSpec({

    "container" - {

        "test01" {
            val map = listOf(
                listOf(1, 2, 3, 4),
                listOf(2, 3, 4, 5),
                listOf(3, 4, 5, 6),
                listOf(4, 5, 6, 7)
            )

            val answer = listOf(
                listOf(2, 2, 3, 4),
                listOf(3, 4, 3, 4),
                listOf(1, 1, 4, 4)
            )

            getPrefixSum(map, answer) shouldBe listOf(27, 6, 64)
        }

    }

})
