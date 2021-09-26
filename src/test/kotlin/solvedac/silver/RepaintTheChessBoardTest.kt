package solvedac.silver

import org.assertj.core.api.SoftAssertions.assertSoftly
import org.junit.jupiter.api.Test

internal class RepaintTheChessBoardTest {

    @Test
    fun makeChessBoard() {
        // given
        val whiteBoard = ChessBoard.white
        val blackBoard = ChessBoard.black

        val boardSize = 8

        val white = "W"
        val black = "B"

        // then
        assertSoftly { s ->
            s.assertThat(whiteBoard.size).isEqualTo(boardSize)
            whiteBoard.forEach { s.assertThat(it.size).isEqualTo(boardSize) }
            s.assertThat(whiteBoard[0][0]).isEqualTo(white)
            s.assertThat(whiteBoard[0][1]).isEqualTo(black)
            s.assertThat(blackBoard.size).isEqualTo(boardSize)
            blackBoard.forEach { s.assertThat(it.size).isEqualTo(boardSize) }
            s.assertThat(blackBoard[0][0]).isEqualTo(black)
            s.assertThat(blackBoard[0][1]).isEqualTo(white)
        }

    }
}