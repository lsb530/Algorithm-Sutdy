package inflearn.dingco.section4.question

import java.util.Comparator
import java.util.PriorityQueue

class GetMinimumCountOfOverseasSupplyMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                "정답 = 2 / 현재 풀이 값 = ${
                    getMinimumCountOfOverseasSupply(
                        4,
                        intArrayOf(4, 10, 15),
                        intArrayOf(20, 5, 10),
                        30
                    )
                }"
            )
            println(
                "정답 = 4 / 현재 풀이 값 = ${
                    getMinimumCountOfOverseasSupply(
                        4,
                        intArrayOf(4, 10, 15, 20),
                        intArrayOf(20, 5, 10, 5),
                        40
                    )
                }"
            )
            println(
                "정답 = 1 / 현재 풀이 값 = ${
                    getMinimumCountOfOverseasSupply(
                        2,
                        intArrayOf(1, 10),
                        intArrayOf(10, 100),
                        11
                    )
                }"
            )
        }

        private fun getMinimumCountOfOverseasSupply(
            stock: Int,
            dates: IntArray,
            supplies: IntArray,
            k: Int
        ): Int {
            var answer = 0
            var totalStock = stock
            var lastAddedDateIndex = 0
            val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
            while (totalStock <= k) {
                while(lastAddedDateIndex < dates.size && dates[lastAddedDateIndex] <= totalStock) {
                    maxHeap.add(supplies[lastAddedDateIndex])
                    lastAddedDateIndex += 1
                }
                val supply = maxHeap.poll()
                // println(supply)
                totalStock += supply
                answer += 1
            }
            return answer
        }
    }
}