package hacker_rank.warmup

class CompareTriplets {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(compareTriplets(
                a = arrayOf(5, 6, 7),
                b = arrayOf(3, 6, 10)
            ).contentToString())
        }

        private fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
            var winACount = 0
            var winBCount = 0
            for (i in a.indices) {
                if (a[i] > b[i])
                    winACount += 1
                else if (b[i] > a[i])
                    winBCount += 1
            }
            return arrayOf(winACount, winBCount)
        }
    }
}