package programmers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class FunctionDevelopmentTest {

    private val functionDevelopment = FunctionDevelopment()

    @ParameterizedTest
    @MethodSource("solution_src")
    fun solution(src: Triple<IntArray, IntArray, IntArray>) {
        // when
        val solution = functionDevelopment.solution(src.first, src.second)

        // then
        assertThat(solution).isEqualTo(src.third)
    }

    companion object {
        @JvmStatic
        fun solution_src(): List<Triple<IntArray, IntArray, IntArray>> {
            return listOf(
                Triple(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5), intArrayOf(2, 1)),
                Triple(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 3, 2))
            )
        }
    }
}
