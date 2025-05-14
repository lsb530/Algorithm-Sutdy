package hacker_rank.implementation

class DdivisibleSumPairs {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                divisibleSumPairs(6, 5, arrayOf(1, 2, 3, 4, 5, 6))
            )
        }

        private fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
            var answer = 0
            for (i in 0..<n) {
                for (j in 0..<n) {
                    if (i < j && ((ar[i] + ar[j]) % k) == 0) {
                        answer += 1
                    }
                }
            }
            return answer
        }
    }
}