package programmers.level3

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class TravelRouteTest : FreeSpec({

    "container" - {

        "test01" {
            travelRoute(
                arrayOf(
                    arrayOf("ICN", "JFK"),
                    arrayOf("HND", "IAD"),
                    arrayOf("JFK", "HND"),
                )
            ) shouldBe arrayOf("ICN", "JFK", "HND", "IAD")
        }

        "test2" {
            travelRoute(
                arrayOf(
                    arrayOf("JFK", "ICN"),
                    arrayOf("ICN", "ATL"),
                    arrayOf("ICN", "JFK"),
                )
            ) shouldBe arrayOf("ICN", "JFK", "ICN", "ATL")
        }

        "test3" {
            travelRoute(
                arrayOf(
                    arrayOf("ICN", "NCI"),
                    arrayOf("ICN", "NCI"),
                    arrayOf("NCI", "ICN"),
                    arrayOf("NCI", "NYC"),
                )
            ) shouldBe arrayOf("ICN", "NCI", "ICN", "NCI", "NYC")
        }

        "test04" {
            travelRoute(
                arrayOf(
                    arrayOf("ICN", "AOO"),
                    arrayOf("AOO", "BOO"),
                    arrayOf("BOO", "COO"),
                    arrayOf("COO", "DOO"),
                    arrayOf("DOO", "EOO"),
                    arrayOf("EOO", "DOO"),
                    arrayOf("DOO", "COO"),
                    arrayOf("COO", "BOO"),
                    arrayOf("BOO", "AOO")
                )
            ) shouldBe arrayOf("ICN", "AOO", "BOO", "COO", "DOO", "EOO", "DOO", "COO", "BOO", "AOO")
        }


        "test05" {
            travelRoute(
                arrayOf(
                    arrayOf("ICN", "AAA"),
                    arrayOf("AAA", "BBB"),
                    arrayOf("BBB", "AAA"),
                    arrayOf("AAA", "ICN"),
                    arrayOf("ICN", "AAA")
                )
            ) shouldBe arrayOf("ICN", "AAA", "BBB", "AAA", "ICN", "AAA")
        }

    }

})
