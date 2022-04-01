package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ImmigrationTest : FreeSpec({

    "container" - {

        "test01" {
            immigration(6, intArrayOf(7, 10)) shouldBe 28
        }

    }


})
