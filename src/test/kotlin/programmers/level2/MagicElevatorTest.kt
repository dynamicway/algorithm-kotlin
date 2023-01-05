package programmers.level2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class MagicElevatorTest {

    @ParameterizedTest
    @CsvSource(
        value = [
            "0, 0",
            "1, 1",
            "2, 2",
            "3, 3",
            "4, 4",
            "5, 5",
            "6, 5",
            "7, 4",
            "8, 3",
            "9, 2",
        ]
    )
    fun zero_to_nine(storey: Int, result: Int) {
        assertThat(magicElevator(storey)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource(
        value = [
            "10, 1",
            "11, 2",
            "12, 3",
            "13, 4",
            "14, 5",
            "15, 6",
            "16, 6",
            "17, 5",
            "18, 4",
            "19, 3",
        ]
    )
    fun ten_to_nineteen(storey: Int, result: Int) {
        assertThat(magicElevator(storey)).isEqualTo(result)
    }

}
