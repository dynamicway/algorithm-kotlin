package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class LongestIncreasingSubSequenceTest : FreeSpec({

    "container" - {

        "test01" {
            val sequence = intArrayOf(
                10,
                20,
                10,
                30,
                20,
                50
            )

            longestIncreasingSubSequence(sequence) shouldBe 4
        }

        "test02" {
            val sequence = intArrayOf(
                4,
                5,
                6,
                3,
                8,
                7,
                9
            )

            longestIncreasingSubSequence(sequence) shouldBe 5
        }

        "test03" {
            val sequence = intArrayOf(
                1,
                1,
                1,
                1,
                1,
                1
            )

            longestIncreasingSubSequence(sequence) shouldBe 1

        }

        "test04" {
            val sequence = intArrayOf(
                1,
                2,
                3,
                4,
                5,
                6
            )

            longestIncreasingSubSequence(sequence) shouldBe 6
        }

        "test05" {
            val sequence = intArrayOf(
                1
            )

            longestIncreasingSubSequence(sequence) shouldBe 1
        }

        "test06" {
            val sequence = intArrayOf(
                5,
                4,
                3,
                2,
                1
            )

            longestIncreasingSubSequence(sequence) shouldBe 1
        }

        "test07" {
            val sequence = intArrayOf(
                3,
                5,
                7,
                9,
                2,
                1,
                4,
                8
            )

            longestIncreasingSubSequence(sequence) shouldBe 4
        }

        "test08" {
            val sequence = intArrayOf(
                10,
                20,
                30,
                15,
                25,
                50
            )

            longestIncreasingSubSequence(sequence) shouldBe 4
        }

        "test09" {
            val sequence = intArrayOf(
                30, 10, 20, 50, 60, 70
            )

            longestIncreasingSubSequence(sequence) shouldBe 5
        }

        "test10" {
            val sequence = intArrayOf(1, 6, 2, 4, 5, 3, 7)

            longestIncreasingSubSequence(sequence) shouldBe 5
        }

        "test11" {
            val sequence = intArrayOf(10, 21, 1, 10, 20, 30, 40, 50, 60)

            longestIncreasingSubSequence(sequence) shouldBe 7
        }

        "test12" {
            val sequence = intArrayOf(1, 3, 5, 2, 3, 4)

            longestIncreasingSubSequence(sequence) shouldBe 4
        }

        "test13" {
            val sequence = intArrayOf(1, 4, 5, 2, 3, 4, 5)

            longestIncreasingSubSequence(sequence) shouldBe 5
        }

    }

})
