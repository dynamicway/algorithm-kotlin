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
}