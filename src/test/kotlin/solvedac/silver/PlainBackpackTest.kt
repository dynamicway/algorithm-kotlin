package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class PlainBackpackTest : FreeSpec({

    "container" - {

        "test01" {
            val items = arrayOf(
                Item(6, 13),
                Item(4, 8),
                Item(3, 6),
                Item(5, 12)
            )

            plainBackpack(items, 7) shouldBe 14
        }

        "test02" {
            val items = arrayOf(
                Item(3, 90),
                Item(103, 89),
                Item(2, 87),
                Item(99, 86),
                Item(98, 85)
            )

            plainBackpack(items, 104) shouldBe 263
        }

    }

})
