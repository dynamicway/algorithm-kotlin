package leetcode.easy

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    val target = image[sr][sc]

    if (target == newColor) return image

    val lastY = image.lastIndex
    val lastX = image[0].lastIndex

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(Pair(sr, sc))
    image[sr][sc] = newColor
    while (queue.isNotEmpty()) {
        val coordinate = queue.removeFirst()
        val y = coordinate.first
        val x = coordinate.second
        if (y - 1 >= 0) {
            if (image[y - 1][x] == target) {
                queue.add(Pair(y - 1, x))
                image[y - 1][x] = newColor
            }
        }
        if (y + 1 <= lastY) {
            if (image[y + 1][x] == target) {
                queue.add(Pair(y + 1, x))
                image[y + 1][x] = newColor
            }
        }
        if (x - 1 >= 0) {
            if (image[y][x - 1] == target) {
                queue.add(Pair(y, x - 1))
                image[y][x - 1] = newColor
            }
        }
        if (x + 1 <= lastX) {
            if (image[y][x + 1] == target) {
                queue.add(Pair(y, x + 1))
                image[y][x + 1] = newColor
            }
        }
    }

    return image
}