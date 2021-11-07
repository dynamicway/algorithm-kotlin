package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlusDarkAndBrightTest {
    private val plusDarkAndBright = PlusDarkAndBright()

    @Test
    fun test_1() {
        val givenNumbers = intArrayOf(4, 7, 12)
        val givenBoolean = booleanArrayOf(true, false, true)

        val actualResult = plusDarkAndBright.solution(givenNumbers, givenBoolean)

        assertThat(actualResult).isEqualTo(9)
    }

    @Test
    fun test_2() {
        val givenNumbers = intArrayOf(1, 2, 3)
        val givenBoolean = booleanArrayOf(false, false, true)

        val actualResult = plusDarkAndBright.solution(givenNumbers, givenBoolean)

        assertThat(actualResult).isEqualTo(0)
    }
}
