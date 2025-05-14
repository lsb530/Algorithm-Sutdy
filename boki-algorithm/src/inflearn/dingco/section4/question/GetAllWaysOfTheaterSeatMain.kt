package inflearn.dingco.section4.question

class GetAllWaysOfTheaterSeatMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = 12 / 현재 풀이 값 = ${getAllWaysOfTheaterSeat(9, intArrayOf(4, 7))}")
            println("정답 = 4 / 현재 풀이 값 = ${getAllWaysOfTheaterSeat(9, intArrayOf(2, 4, 7))}")
            println("정답 = 26 / 현재 풀이 값 = ${getAllWaysOfTheaterSeat(11, intArrayOf(2, 5))}")
            println("정답 = 6 / 현재 풀이 값 = ${getAllWaysOfTheaterSeat(10, intArrayOf(2, 6, 9))}")
        }

        private fun getAllWaysOfTheaterSeat(totalCount: Int, fixedSeatArray: IntArray): Int {
            val memo = mutableMapOf<Int, Int>()
            memo[1] = 1
            memo[2] = 2

            var allWays = 1
            var currentIndex = 0

            for (fixedSeat in fixedSeatArray) {
                val fixedSeatIndex = fixedSeat - 1
                val countOfWays = fiboDynamicProgramming(
                    n = fixedSeatIndex - currentIndex,
                    fiboMemo = memo
                )
                allWays *= countOfWays
                currentIndex = fixedSeatIndex + 1
            }

            allWays *= fiboDynamicProgramming(
                n = totalCount - currentIndex,
                fiboMemo = memo
            )

            return allWays
        }

        private fun fiboDynamicProgramming(n: Int, fiboMemo: MutableMap<Int, Int>): Int {
            if (n in fiboMemo) {
                return fiboMemo[n]!!
            }

            val nthFibo = fiboDynamicProgramming(n - 1, fiboMemo) + fiboDynamicProgramming(n - 2, fiboMemo)
            fiboMemo[n] = nthFibo

            return nthFibo
        }
    }
}