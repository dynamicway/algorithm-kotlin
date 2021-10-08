package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LotteryPredictionsTest {

    private val lotteryPredictions = LotteryPredictions()

    @Test
    fun solution() {
        // given
        val lotto = intArrayOf(44, 1, 0, 0, 31, 25)
        val win = intArrayOf(31, 10, 45, 1, 6, 19)

        // when
        val result = lotteryPredictions.solution(lotto, win)

        // then
        assertThat(result).isEqualTo(intArrayOf(3, 5))

    }
}
