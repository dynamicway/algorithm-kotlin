package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class MaxProbabilityTest: FreeSpec({
    "container" - {

        "test01" {
            maxProbability(n = 3, edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)), succProb = doubleArrayOf(0.5, 0.5, 0.3), start = 0, end = 2) shouldBe 0.3
        }

        "test02" {
            maxProbability(n = 3, edges = arrayOf(intArrayOf(0,1)), succProb = doubleArrayOf(0.5), start = 0, end = 2) shouldBe 0.0
        }

        "test03" {
            maxProbability(500,
                    arrayOf(intArrayOf(193,229), intArrayOf(133,212), intArrayOf(224,465)),
                    doubleArrayOf(0.91,0.78,0.64),
                4,
                364) shouldBe 0.0
        }
    }
})
