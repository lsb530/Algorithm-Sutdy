package inflearn.dingco.section3.question

class GetMaxDiscountedPriceMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = 926000 / 현재 풀이 값 = ${getMaxDiscountedPrice(prices = intArrayOf(30000, 2000, 1500000), coupons = intArrayOf(20, 40))}")
            println("정답 = 485000 / 현재 풀이 값 = ${getMaxDiscountedPrice(prices = intArrayOf(50000, 1500000), coupons = intArrayOf(10, 70, 30, 20))}")
            println("정답 = 1550000 / 현재 풀이 값 = ${getMaxDiscountedPrice(prices = intArrayOf(50000, 1500000), coupons = intArrayOf())}")
            println("정답 = 1458000 / 현재 풀이 값 = ${getMaxDiscountedPrice(prices = intArrayOf(20000, 100000, 1500000), coupons = intArrayOf(10, 10, 10))}")
        }

        private fun getMaxDiscountedPrice(prices: IntArray, coupons: IntArray): Int {
            val reverseSortedPrices = prices.sortedArrayDescending()
            val reverseSortedCoupons = coupons.sortedArrayDescending()
            var pIdx = 0
            var cIdx = 0

            var discountedMaxPrice = 0
            while (pIdx < reverseSortedPrices.size && cIdx < reverseSortedCoupons.size) {
                val discountPrice = reverseSortedPrices[pIdx] * (100 - reverseSortedCoupons[cIdx]) / 100
                discountedMaxPrice += discountPrice
                pIdx++
                cIdx++
            }

            while(pIdx < reverseSortedPrices.size) {
                discountedMaxPrice += reverseSortedPrices[pIdx]
                pIdx++
            }
            return discountedMaxPrice
        }
    }
}