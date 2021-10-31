package solvedac.silver

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.SoftAssertions
import org.assertj.core.api.SoftAssertions.*
import org.junit.jupiter.api.Test

internal class BfsAndDfsTest {

    private val bfsAndDfs = BfsAndDfs()

    @Test
    fun test_1() {
        // given
        val info = Triple(4, 5, 1)
        val nodes = listOf(
            Pair(1, 2),
            Pair(1, 3),
            Pair(1, 4),
            Pair(2, 4),
            Pair(3, 4)
        )

        // when
        val result = bfsAndDfs.solution(info, nodes)

        // then
        assertSoftly { s ->
            s.assertThat(result.first).isEqualTo(listOf(1, 2, 4, 3))
            s.assertThat(result.second).isEqualTo(listOf(1, 2, 3, 4))

        }

    }

}