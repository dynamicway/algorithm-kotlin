package programmers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class CamouflageTest {
    private val camouflage = Camouflage()

    @DisplayName("의상의 종류가 2개일 경우")
    @ParameterizedTest
    @MethodSource("solution_2_kinds_src")
    fun solution_2_kinds(clothesPair: Pair<Array<Array<String>>, Int>) {
        // when
        val numberOfCombination = camouflage.solution(clothesPair.first)

        // then
        assertThat(numberOfCombination).isEqualTo(clothesPair.second)

    }

    companion object {
        @JvmStatic
        fun solution_2_kinds_src(): List<Pair<Array<Array<String>>, Int>> {
            return listOf(
                Pair(
                    arrayOf(
                        arrayOf("yellowhat", "headgear"),
                        arrayOf("bluesunglasses", "eyewear"),
                        arrayOf("green_turban", "headgear")
                    ),
                    5
                ),
                Pair(
                    arrayOf(
                        arrayOf("crowmask", "face"),
                        arrayOf("bluesunglasses", "face"),
                        arrayOf("smoky_makeup", "face")
                    ),
                    3
                )
            )
        }
    }
}