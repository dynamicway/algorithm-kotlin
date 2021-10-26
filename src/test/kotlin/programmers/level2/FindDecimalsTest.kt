package programmers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class FindDecimalsTest {
    private val findDecimals = FindDecimals()

    @ParameterizedTest
    @MethodSource("test_src")
    fun test(pair: Pair<String, Int>) {
        // when
        val result = findDecimals.solution(pair.first)

        // then
        assertThat(result).isEqualTo(pair.second)

    }

    companion object {
        @JvmStatic
        fun test_src(): List<Pair<String, Int>> = listOf(
            Pair("17", 3),
            Pair("011", 2)
        )
    }
}