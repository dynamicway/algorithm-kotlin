package programmers.level2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.lang.Integer.max

internal class TheGreatestNumberTest {

    private val theGreatestNumber = TheGreatestNumber()

    @ParameterizedTest
    @MethodSource("test_src")
    fun test(src: Pair<IntArray, String>) {
        // when
        val result = theGreatestNumber.solution(src.first)

        // then
        Assertions.assertThat(result).isEqualTo(src.second)

    }

    companion object {
        @JvmStatic
        fun test_src(): List<Pair<IntArray, String>> = listOf(
            Pair(
                intArrayOf(6, 10, 2),
                "6210"
            ),
            Pair(
                intArrayOf(3, 30, 34, 5, 9),
                "9534330"
            )
        )
    }
}