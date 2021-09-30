package programmers.level2

import org.assertj.core.api.SoftAssertions.assertSoftly
import org.junit.jupiter.api.Test

internal class TargetNumberTest {

    private val targetNumber = TargetNumber()

    @Test
    fun targetNumber() {
        // given
        val numbers = intArrayOf(1, 1, 1, 1, 1)

        // when
        val result = targetNumber.solution(numbers, 3)

        // then
        assertSoftly { s ->
            s.assertThat(result).isEqualTo(5)
        }
    }
}