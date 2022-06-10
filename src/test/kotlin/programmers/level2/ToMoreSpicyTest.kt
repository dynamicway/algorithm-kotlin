package programmers.level2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class ToMoreSpicyTest: FreeSpec({

    "container" - {

        "test1" {
            toMoreSpicy(intArrayOf(1, 2, 3, 9, 10, 12), 7) shouldBe 2
        }

        "test2" {
            toMoreSpicy(intArrayOf(0, 0), 100) shouldBe -1
        }

        "test3" {
            toMoreSpicy(intArrayOf(1, 2, 3), 100) shouldBe -1
        }

    }

})