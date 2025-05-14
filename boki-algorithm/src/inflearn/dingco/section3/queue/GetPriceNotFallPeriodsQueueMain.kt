package inflearn.dingco.section3.queue

class GetPriceNotFallPeriodsQueueMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(1, 2, 3, 2, 3)).contentToString()}")
            println("정답 = [6, 2, 1, 3, 2, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(3, 9, 9, 3, 5, 7, 2)).contentToString()}")
            println("정답 = [6, 1, 4, 3, 1, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(1, 5, 3, 6, 7, 6, 5)).contentToString()}")
        }

        private fun getPriceNotFallPeriods(prices: IntArray): IntArray {
            val result = mutableListOf<Int>()
            val queue = ArrayDeque(prices.toList())
            // queue.addLast()
            // queue.removeFirst()
            // queue.first()

            while (queue.isNotEmpty()) {
                var priceNotFallPeriod = 0
                val currentPrice = queue.removeFirst()
                for (nextPrice in queue) {
                    if (currentPrice <= nextPrice) {
                        priceNotFallPeriod += 1
                    }
                    else {
                        priceNotFallPeriod += 1
                        break
                    }
                }
                result.add(priceNotFallPeriod)
            }

            return result.toIntArray()
        }
    }
}