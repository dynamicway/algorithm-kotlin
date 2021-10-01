package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GymSuitTest {

    private val gymSuit = GymSuit()

    @Test
    fun test_1() {
        // given
        val n = 5
        val lost = intArrayOf(2, 4)
        val reserved = intArrayOf(1, 3, 5)

        // when
        val result = gymSuit.solution(n, lost, reserved)

        // then
        assertThat(result).isEqualTo(5)

    }

    @Test
    fun test_2() {
        // given
        val n = 5
        val lost = intArrayOf(2, 4)
        val reserved = intArrayOf(3)

        // when
        val result = gymSuit.solution(n, lost, reserved)

        // then
        assertThat(result).isEqualTo(4)

    }

    @Test
    fun test_3() {
        // given
        val n = 3
        val lost = intArrayOf(3)
        val reserved = intArrayOf(1)

        // when
        val result = gymSuit.solution(n, lost, reserved)

        // then
        assertThat(result).isEqualTo(2)

    }

    @Test
    fun test_4() {
        // given
        val n = 5
        val lost = intArrayOf(1, 2, 3, 4, 5)
        val reserved = intArrayOf(1, 2, 3, 4, 5)

        // when
        val result = gymSuit.solution(n, lost, reserved)

        // then
        assertThat(result).isEqualTo(5)

    }

}