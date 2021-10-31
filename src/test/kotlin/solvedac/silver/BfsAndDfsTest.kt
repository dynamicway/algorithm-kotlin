package solvedac.silver

import org.assertj.core.api.SoftAssertions.assertSoftly
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

    @Test
    fun test_2() {
        // given
        val info = Triple(5, 5, 3)
        val nodes = listOf(
            Pair(5, 4),
            Pair(5, 2),
            Pair(1, 2),
            Pair(3, 4),
            Pair(3, 1)
        )

        // when
        val result = bfsAndDfs.solution(info, nodes)

        // then
        assertSoftly { s ->
            s.assertThat(result.first).isEqualTo(listOf(3, 1, 2, 5, 4))
            s.assertThat(result.second).isEqualTo(listOf(3, 1, 4, 2, 5))
        }

    }

    @Test
    fun test_3() {
        // given
        val info = Triple(1000, 1, 1000)
        val nodes = listOf(
            Pair(999, 1000)
        )

        // when
        val result = bfsAndDfs.solution(info, nodes)

        // then
        assertSoftly { s ->
            s.assertThat(result.first).isEqualTo(listOf(1000, 999))
            s.assertThat(result.second).isEqualTo(listOf(1000, 999))
        }

    }

}
