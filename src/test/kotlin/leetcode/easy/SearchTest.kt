package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class SearchTest : FreeSpec({

    "container" - {

        "test01" {
            search(
                intArrayOf(-1,0,3,5,9,12),
                9) shouldBe 4

        }

    }

})