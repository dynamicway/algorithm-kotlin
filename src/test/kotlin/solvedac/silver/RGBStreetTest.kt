package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class RGBStreetTest : FreeSpec({

    "container" - {

        "test01" {
            val costs = arrayOf(
                intArrayOf(26, 40, 83),
                intArrayOf(49, 60, 57),
                intArrayOf(13, 89, 99)
            )

            rgbStreet(costs) shouldBe 96
        }

        "test02" {
            val costs = arrayOf(
                intArrayOf(1, 100, 100),
                intArrayOf(100, 1, 100),
                intArrayOf(100, 100, 1)
            )

            rgbStreet(costs) shouldBe 3
        }

        "test03" {
            val costs = arrayOf(
                intArrayOf(1, 100, 100),
                intArrayOf(100, 100, 100),
                intArrayOf(1, 100, 100)
            )

            rgbStreet(costs) shouldBe 102
        }

        "test04" {
            val costs = arrayOf(
                intArrayOf(30, 19, 5),
                intArrayOf(64, 77, 64),
                intArrayOf(15, 19, 97),
                intArrayOf(4, 71, 57),
                intArrayOf(90, 86, 84),
                intArrayOf(93, 32, 91)
            )

            rgbStreet(costs) shouldBe 208
        }

        "test05" {
            val costs = arrayOf(
                intArrayOf(71, 39, 44),
                intArrayOf(32, 83, 55),
                intArrayOf(51, 37, 63),
                intArrayOf(89, 29, 100),
                intArrayOf(83, 58, 11),
                intArrayOf(65, 13, 15),
                intArrayOf(47, 25, 29),
                intArrayOf(60, 66, 19)
            )

            rgbStreet(costs) shouldBe 253
        }

    }

})
