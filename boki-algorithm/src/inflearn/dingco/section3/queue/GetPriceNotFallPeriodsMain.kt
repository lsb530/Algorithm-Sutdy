package inflearn.dingco.section3.queue

class GetPriceNotFallPeriodsMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(1, 2, 3, 2, 3)).contentToString()}")
            println("정답 = [6, 2, 1, 3, 2, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(3, 9, 9, 3, 5, 7, 2)).contentToString()}")
            println("정답 = [6, 1, 4, 3, 1, 1, 0] / 현재 풀이 값 = ${getPriceNotFallPeriods(prices = intArrayOf(1, 5, 3, 6, 7, 6, 5)).contentToString()}")
        }

        private fun getPriceNotFallPeriods(prices: IntArray): IntArray {
            val result = Array(prices.size) { 0 }
            for (i in 0..<prices.size - 1) {
                var cnt = 0
                for (j in i + 1..<prices.size) {
                    if (prices[i] <= prices[j]) {
                        cnt += 1
                    }
                    else {
                        cnt += 1
                        break
                    }
                }
                result[i] = cnt
            }
            return result.toIntArray()
        }
    }
}