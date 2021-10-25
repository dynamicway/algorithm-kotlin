package programmers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class PrinterTest {

    private val printer = Printer()


    @ParameterizedTest
    @MethodSource("test_src")
    fun test(givenSrc: Triple<IntArray, Int, Int>) {
        // when
        val result = printer.solution(givenSrc.first, givenSrc.second)

        // then
        assertThat(result).isEqualTo(givenSrc.third)

    }

    companion object {
        @JvmStatic
        fun test_src(): List<Triple<IntArray, Int, Int>> {
            return listOf(
                Triple(
                    intArrayOf(2, 1, 3, 2),
                    2,
                    1
                ),
                Triple(
                    intArrayOf(1, 1, 9, 1, 1, 1),
                    0,
                    5
                ),
                Triple(
                    intArrayOf(1, 1, 1, 1, 1),
                    2,
                    3
                )
            )
        }
    }

}