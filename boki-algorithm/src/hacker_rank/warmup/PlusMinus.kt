package hacker_rank.warmup

class PlusMinus {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            plusMinus(arrayOf(1, 1, 0, -1, -1))
        }

        private fun plusMinus(arr: Array<Int>): Unit {
            var positiveCount = 0
            var negativeCount = 0
            var zeroCount = 0

            for (i in 0..<arr.size) {
                if (arr[i] > 0) positiveCount += 1
                else if (arr[i] == 0) zeroCount += 1
                else negativeCount += 1
            }

            println(String.format("%.6f", positiveCount / arr.size.toDouble()))
            println(String.format("%.6f", negativeCount / arr.size.toDouble()))
            println(String.format("%.6f", zeroCount / arr.size.toDouble()))
        }

    }
}