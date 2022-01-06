package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import java.util.*

class OrganicCabbageTest : FreeSpec({

    "container" - {

        "test_1" {
            val givenCabbageLocations = LinkedList(
                listOf(
                    Pair(0, 2),
                    Pair(1, 2),
                    Pair(2, 2),
                    Pair(3, 2),
                    Pair(4, 2),
                    Pair(4, 0)
                )
            )

            val organicCabbage = OrganicCabbage(
                givenCabbageLocations
            )

            organicCabbage.getNumberOfEarthWarm() shouldBe 2
        }

        "test_2" {
            val givenCabbageLocations = LinkedList(
                listOf(
                    Pair(0, 0),
                    Pair(1, 0),
                    Pair(1, 1),
                    Pair(4, 2),
                    Pair(4, 3),
                    Pair(4, 5),
                    Pair(2, 4),
                    Pair(3, 4),
                    Pair(7, 4),
                    Pair(8, 4),
                    Pair(9, 4),
                    Pair(7, 5),
                    Pair(8, 5),
                    Pair(9, 5),
                    Pair(7, 6),
                    Pair(8, 6),
                    Pair(9, 6)
                )
            )

            val organicCabbage = OrganicCabbage(
                givenCabbageLocations
            )

            organicCabbage.getNumberOfEarthWarm() shouldBe 5
        }

        "test_3" {
            val givenCabbageLocations = LinkedList(
                listOf(
                    Pair(5, 5),
                )
            )

            val organicCabbage = OrganicCabbage(
                givenCabbageLocations
            )

            organicCabbage.getNumberOfEarthWarm() shouldBe 1
        }

    }
})
