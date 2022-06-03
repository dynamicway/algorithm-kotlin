package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class DiskControllerTest : FreeSpec({

    "container" - {

        "test1" {
            diskController(
                arrayOf(
                    intArrayOf(0, 3),
                    intArrayOf(1, 9),
                    intArrayOf(2, 6)
                )
            ) shouldBe 9
        }

        "test2" {
            diskController(
                arrayOf(intArrayOf(0, 9), intArrayOf(0, 4), intArrayOf(0, 5), intArrayOf(0, 7), intArrayOf(0, 3))
            ) shouldBe 13
        }

        "test3" {
            diskController(
                arrayOf(
                    intArrayOf(0, 3),
                    intArrayOf(1, 9),
                    intArrayOf(500, 6)
                )
            ) shouldBe 6
        }

    }

})