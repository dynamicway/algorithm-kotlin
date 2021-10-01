package programmers.level1

import org.assertj.core.api.SoftAssertions.assertSoftly
import org.junit.jupiter.api.Test

internal class GymSuitTest {

    private val solution = GymSuit()

    @Test
    fun test_1() {
        // given
        val n = 5
        val lost = intArrayOf(2, 4)
        val reserved = intArrayOf(1, 3, 5)

        // when
        val result = solution.solution(n, lost, reserved)

        // then
        assertSoftly { s ->
            s.assertThat(result).isEqualTo(5)
        }

    }
}