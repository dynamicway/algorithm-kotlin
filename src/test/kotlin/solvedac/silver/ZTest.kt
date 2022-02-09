package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ZTest : FreeSpec({

    "container" - {

        "test01" {
            z(2, 3, 1) shouldBe 11
        }

        "test02" {
            z(3, 7, 7) shouldBe 63
        }

        "test03" {
            z(1, 0, 0) shouldBe 0
        }

        "test04" {
            z(4, 7, 7) shouldBe 63
        }

        "test05" {
            z(10, 511, 511) shouldBe 262143
        }

        "test06" {
            z(10, 512, 512) shouldBe 786432
        }

    }

})
