package hacker_rank.warmup

class Staircase {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            staircase(4)
        }

        private fun staircase(n: Int): Unit {
            for (i in 0 until n) {
                for (j in 0 ..< n - i - 1) {
                    print(" ")
                }
                for (j in 0 .. i) {
                    print("#")
                }
                println()
            }
        }

    }
}