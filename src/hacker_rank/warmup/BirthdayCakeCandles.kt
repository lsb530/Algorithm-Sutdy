package hacker_rank.warmup

class BirthdayCakeCandles {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(birthdayCakeCandles(candles = arrayOf(4, 4, 1, 3)))
            println(birthdayCakeCandles2(candles = arrayOf(4, 4, 1, 3)))
            println(birthdayCakeCandles3(candles = arrayOf(4, 4, 1, 3)))
        }

        private fun birthdayCakeCandles(candles: Array<Int>): Int {
            val highestCandle = candles.max()
            var highestCount = 0
            candles.forEach {
                if (it == highestCandle) highestCount += 1
            }
            return highestCount
        }

        // 시간초과 발생 O
        private fun birthdayCakeCandles2(candles: Array<Int>): Int {
            val highestCandle = candles.max()
            return candles.count { it == highestCandle }
        }

        // 시간초과 발생 X
        fun birthdayCakeCandles3(candles: Array<Int>): Int {
            val highestCandle = candles.max()
            // return candles.filter { it == highestCandle }.count()
            return candles.count { it == highestCandle }
        }
    }
}