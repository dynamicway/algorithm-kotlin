package solvedac.silver

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class FloorDecorationTest {
    private val floorDecoration = FloorDecoration()

    @Test
    fun test_1() {
        val givenFloor = listOf(
            listOf('-', '-', '-', '-'),
            listOf('-', '-', '-', '-'),
            listOf('-', '-', '-', '-'),
            listOf('-', '-', '-', '-')
        )

        val actualCount = floorDecoration.solution(givenFloor)

        Assertions.assertThat(actualCount).isEqualTo(4)
    }
}