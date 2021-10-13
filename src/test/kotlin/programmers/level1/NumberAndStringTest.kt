package programmers.level1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class NumberAndStringTest {

    private val numberByString = NumberAndString()

    @ParameterizedTest(name = "{0}")
    @MethodSource("source")
    fun solution(pair: Pair<String, Int>) {
        // when
        val result = numberByString.solution(pair.first)

        // then
        assertThat(result).isEqualTo(pair.second)

    }

    companion object {
        @JvmStatic
        fun source(): List<Pair<String, Int>> {
            return listOf(
                Pair("one4seveneight", 1478),
                Pair("23four5six7", 234567),
                Pair("2three45sixseven", 234567),
                Pair("123", 123),
                Pair("sixsixsixsixsixsixsixsix", 66666666),
                Pair("onetwothreefourfivesixseveneightninezero", 1234567890)
            )
        }
    }

}