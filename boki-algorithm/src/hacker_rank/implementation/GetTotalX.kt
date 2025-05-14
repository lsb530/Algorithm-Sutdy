package hacker_rank.implementation

class GetTotalX {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(getTotalX(arrayOf(2, 6), arrayOf(24, 36)))
        }

        private fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
            val maxA = a.maxOrNull() ?: 0
            val minB = b.minOrNull() ?: 0

            // println("maxA = ${maxA}")
            // println("minB = ${minB}")
            var count = 0
            for (num in maxA..minB) {
                // println("$num")
                // println(a.all { num % it == 0 })
                // println(b.all { it % num == 0 })
                if (a.all { num % it == 0 } && b.all { it % num == 0 }) {
                    count++
                }
            }
            println()
            return count
        }
    }
}