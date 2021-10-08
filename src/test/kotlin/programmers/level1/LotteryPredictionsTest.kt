package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LotteryPredictionsTest {

    private val lotteryPredictions = LotteryPredictions()

    @Test
    fun test_1() {
        // given
        val lotto = intArrayOf(44, 1, 0, 0, 31, 25)
        val win = intArrayOf(31, 10, 45, 1, 6, 19)

        // when
        val result = lotteryPredictions.solution(lotto, win)

        // then
        assertThat(result).isEqualTo(intArrayOf(3, 5))

    }

    @Test
    fun test_2() {
        // given
        val lotto = intArrayOf(0, 0, 0, 0, 0, 0)
        val win = intArrayOf(38, 19, 20, 40, 15, 25)

        // when
        val result = lotteryPredictions.solution(lotto, win)

        // then
        assertThat(result).isEqualTo(intArrayOf(1, 6))

    }

    @Test
    fun test_3() {
        // given
        val lotto = intArrayOf(45, 4, 35, 20, 3, 9)
        val win = intArrayOf(20, 9, 3, 45, 4, 35)

        // when
        val result = lotteryPredictions.solution(lotto, win)

        // then
        assertThat(result).isEqualTo(intArrayOf(1, 1))

    }
}
