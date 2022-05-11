package leetcode.medium

fun maxAreaOfIsland(grid: Array<IntArray>): Int {

    val queue = ArrayDeque<Pair<Int, Int>>()

    val lastY = grid.lastIndex
    val lastX = grid[0].lastIndex

    var maxArea = 0

    for (y in 0..lastY) {
        for (x in 0..lastX) {
            if (grid[y][x] == 1) {
                var area = 1
                queue.add(Pair(y, x))
                grid[y][x] = 0
                while (queue.isNotEmpty()) {
                    val coordinate = queue.removeFirst()
                    val currentY = coordinate.first
                    val currentX = coordinate.second
                    if (currentY - 1 >= 0) {
                        if (grid[currentY - 1][currentX] == 1) {
                            area++
                            queue.add(Pair(currentY - 1, currentX))
                            grid[currentY - 1][currentX] = 0
                        }
                    }
                    if (currentY + 1 <= lastY) {
                        if (grid[currentY + 1][currentX] == 1) {
                            area++
                            queue.add(Pair(currentY + 1, currentX))
                            grid[currentY + 1][currentX] = 0
                        }
                    }
                    if (currentX - 1 >= 0) {
                        if (grid[currentY][currentX - 1] == 1) {
                            area++
                            queue.add(Pair(currentY, currentX - 1))
                            grid[currentY][currentX - 1] = 0
                        }
                    }
                    if (currentX + 1 <= lastX) {
                        if (grid[currentY][currentX + 1] == 1) {
                            area++
                            queue.add(Pair(currentY, currentX + 1))
                            grid[currentY][currentX + 1] = 0
                        }
                    }
                }
                maxArea = area.coerceAtLeast(maxArea)
            }
        }
    }

    return maxArea
}