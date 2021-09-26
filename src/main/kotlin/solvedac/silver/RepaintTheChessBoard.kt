package solvedac.silver

class RepaintTheChessBoard {

}


object ChessBoard {

    private fun initWhiteLine(): List<String> {
        return listOf(
            "W", "B", "W", "B", "W", "B", "W", "B"
        )
    }

    private fun initBlackLine(): List<String> {
        return listOf(
            "B", "W", "B", "W", "B", "W", "B", "W"
        )
    }

    val white = listOf(
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine(),
        initBlackLine()
    )

    val black = listOf(
        initBlackLine(),
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine(),
        initBlackLine(),
        initWhiteLine()
    )

}