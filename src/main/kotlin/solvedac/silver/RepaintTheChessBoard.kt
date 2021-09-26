package solvedac.silver

fun main() {
    val size = readLine()!!.split(" ")
    val repaint = RepaintTheChessBoard(
        height = size[0].toInt(),
        width = size[1].toInt()
    )

    val board = List(repaint.height) {
        readLine()!!
    }

    repaint.run(board)
}

class RepaintTheChessBoard(
    private var min: Int = Int.MAX_VALUE,
    val width: Int,
    val height: Int
) {

    private lateinit var board: List<List<Char>>
    private val size = 8

    fun run(data: List<String>) {
        board = toNestedList(data)
        loop()
        print(min)
    }

    private fun toNestedList(line: List<String>): List<List<Char>> {
        val list = mutableListOf<List<Char>>()
        line.forEach { list.add(it.toList()) }
        return list
    }

    private fun selectBoard(x: Int, y: Int): List<List<Char>> {
        val list = mutableListOf<List<Char>>()
        (0..7).forEach { list.add(board[y + it].subList(x, x + size)) }
        return list
    }

    private fun loop() {
        (0..width - 8).forEach { x ->
            (0..height - 8).forEach { y ->
                val count = checkBoard(selectBoard(x, y))
                if (min > count)
                    min = count
            }
        }
    }

    private fun checkBoard(board: List<List<Char>>): Int {
        return countWhite(board).coerceAtMost(countBlack(board))
    }

    private fun countWhite(board: List<List<Char>>): Int {
        var count = 0
        board.forEachIndexed { i, list ->
            list.forEachIndexed { j, color ->
                if (color != ChessBoard.white[i][j]) count++
            }
        }
        return count
    }

    private fun countBlack(board: List<List<Char>>): Int {
        var count = 0
        board.forEachIndexed { i, list ->
            list.forEachIndexed { j, color ->
                if (color != ChessBoard.black[i][j]) count++
            }
        }
        return count
    }

}


object ChessBoard {

    private fun initWhiteLine(): List<Char> {
        return listOf(
            'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'
        )
    }

    private fun initBlackLine(): List<Char> {
        return listOf(
            'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'
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