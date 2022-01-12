package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class VirusTest : FreeSpec({

    "container" - {

        "test1" {
            val virus = Virus(
                mutableSetOf(
                    Pair(1, 2),
                    Pair(2, 3),
                    Pair(1, 5),
                    Pair(5, 2),
                    Pair(5, 6),
                    Pair(4, 7)
                )
            )

            virus.getCountOfInfectedNodes() shouldBe 4
        }

        "test2" {
            val virus = Virus(
                mutableSetOf(
                    Pair(1, 2),
                    Pair(1, 3),
                    Pair(1, 4),
                    Pair(1, 5),
                    Pair(2, 3),
                    Pair(2, 4),
                    Pair(2, 5),
                    Pair(3, 4),
                    Pair(3, 5),
                    Pair(4, 5),
                )
            )

            virus.getCountOfInfectedNodes() shouldBe 4
        }

        "test3" {
            val virus = Virus(
                mutableSetOf(
                    Pair(1, 2),
                    Pair(2, 3),
                    Pair(3, 4),
                    Pair(4, 5),
                )
            )

            virus.getCountOfInfectedNodes() shouldBe 4
        }

        "test4" {
            val virus = Virus(
                mutableSetOf(
                    Pair(1, 4),
                    Pair(1, 5),
                    Pair(3, 4),
                    Pair(3, 5),
                )
            )

            virus.getCountOfInfectedNodes() shouldBe 3
        }

    }

})
