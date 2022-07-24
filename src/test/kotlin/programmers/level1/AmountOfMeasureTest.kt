package programmers.level1

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class AmountOfMeasureTest: FreeSpec({

    "container" - {

        "test01" {
            amountOfMeasure(13, 17) shouldBe 43
        }

        "test02" {
            amountOfMeasure(1, 1) shouldBe -1
        }

        "test03" {
            amountOfMeasure(2, 2) shouldBe 2
        }

        "test04" {
            amountOfMeasure(3, 3) shouldBe 3
        }

        "test05" {
            amountOfMeasure(4, 4) shouldBe -4
        }

    }

})
