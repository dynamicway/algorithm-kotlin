package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KthNumberTest {

    private val kthNumber: KthNumber = KthNumber()

    @Test
    fun solution() {
        // given
        val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
        val command = arrayOf(
            intArrayOf(2, 5, 3),
            intArrayOf(4, 4, 1),
            intArrayOf(1, 7, 3)
        )

        // when
        val result = kthNumber.solution(array, command)

        // then
        assertThat(result).isEqualTo(intArrayOf(5, 6, 3))

    }
}
