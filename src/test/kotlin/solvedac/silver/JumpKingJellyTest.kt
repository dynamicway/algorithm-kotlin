package solvedac.silver

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JumpKingJellyTest {

    private val jumpKingJelly = JumpKingJelly()

    @Test
    fun test_1() {
        val givenSquare = listOf(
            listOf(1, 1, 10),
            listOf(1, 5, 1),
            listOf(2, 2, -1)
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("HaruHaru")
    }

    @Test
    fun test_2() {
        val givenSquare = listOf(
            listOf(2, 2, 1),
            listOf(2, 2, 2),
            listOf(1, 2, -1)
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("Hing")
    }

    @Test
    fun test_3() {
        val givenSquare = listOf(
            listOf(10, 10, 10),
            listOf(1, 1, 1),
            listOf(1, 1, -1)
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("Hing")
    }

    @Test
    fun test_4() {
        val givenSquare = listOf(
            listOf(1, 1, 1),
            listOf(1, 1, 1),
            listOf(1, 1, -1)
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("HaruHaru")
    }

    @Test
    fun test_5() {
        val givenSquare = listOf(
            listOf(1, 1, 1),
            listOf(1, 1, 0),
            listOf(0, 0, -1)
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("Hing")
    }

    @Test
    fun test_6() {
        val givenSquare = listOf(
            listOf(0, 0, 0),
            listOf(0, 0, 0),
            listOf(0, 0, -1),
        )

        val actualResult = jumpKingJelly.solution(givenSquare)

        assertThat(actualResult).isEqualTo("Hing")
    }

}