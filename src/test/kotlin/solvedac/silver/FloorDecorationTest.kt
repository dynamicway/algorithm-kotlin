package solvedac.silver

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
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

        assertThat(actualCount).isEqualTo(4)
    }

    /*
    * -||--||--
--||--||-
|--||--||
||--||--|
-||--||--
--||--||-
    * */

    @Test
    fun test_2() {
        val givenFloor = listOf(
            "-||--||--".toCharArray().toList(),
            "--||--||-".toCharArray().toList(),
            "|--||--||".toCharArray().toList(),
            "||--||--|".toCharArray().toList(),
            "-||--||--".toCharArray().toList(),
            "--||--||-".toCharArray().toList()
        )

        val actualCount = floorDecoration.solution(givenFloor)

        assertThat(actualCount).isEqualTo(31)
    }
}