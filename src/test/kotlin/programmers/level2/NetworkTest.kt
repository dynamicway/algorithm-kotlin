package programmers.level2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

class NetworkTest : FreeSpec() {

    private lateinit var network: Network

    override suspend fun beforeEach(testCase: TestCase) {
        network = Network()
    }

    init {
        "container" - {

            "test_1" {
                val n = 3
                val computers = arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 0, 1)
                )

                network.solution(n, computers) shouldBe 2
            }

            "test_2" {
                val n = 3
                val computers = arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 1),
                    intArrayOf(0, 1, 1)
                )

                network.solution(n, computers) shouldBe 1
            }

            "test_3" {
                val n = 5
                val computers = arrayOf(
                    intArrayOf(1, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 0),
                    intArrayOf(0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 1, 0),
                    intArrayOf(0, 0, 0, 0, 1)
                )

                network.solution(n, computers) shouldBe 5
            }

            "test_4" {
                val n = 5
                val computers = arrayOf(
                    intArrayOf(1, 1, 1, 0, 1),
                    intArrayOf(1, 1, 0, 1, 0),
                    intArrayOf(1, 0, 1, 0, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(1, 0, 0, 0, 1)
                )

                network.solution(n, computers) shouldBe 1
            }

        }
    }

}
