package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class RankOfBoxingTest: FreeSpec({
    "container" - {
        "test01" {
            rankOfBoxing(
                5, arrayOf(
                    intArrayOf(4, 3),
                    intArrayOf(4, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 2),
                    intArrayOf(2, 5)
                )
            ) shouldBe 2
        }
    }
})
