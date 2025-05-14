package hacker_rank.warmup

class DiagonalDifference {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(diagonalDifference(
                arrayOf(
                    arrayOf(11, 2, 4),
                    arrayOf(4, 5, 6),
                    arrayOf(10, 8, -12),
                )
            )) // 15
            // 11 + 5 - 12 = 4
            // 4 + 5 + 10 = 19
            // |4 - 19| = 15
        }

        private fun diagonalDifference(arr: Array<Array<Int>>): Int {
            val N = arr.size
            val M = arr[0].size
            var left2RightDiagonalSum = 0
            var right2LeftDiagonalSum = 0
            for (i in 0 until N) {
                for (j in 0 until M) {
                    if (i == j) left2RightDiagonalSum += arr[i][j]
                    if (i + j == M - 1) right2LeftDiagonalSum += arr[i][j]
                }
            }
            return Math.abs(left2RightDiagonalSum - right2LeftDiagonalSum)
        }
    }
}