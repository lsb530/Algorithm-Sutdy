package hacker_rank.implementation

class CountApplesAndOranges {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            countApplesAndOranges(7, 10, 4, 12, arrayOf(2, 3, -4), arrayOf(3, -2, -4))
            countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
        }

        private fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
            val pickUpRange = IntRange(s, t)
            for (i in 0 until apples.size) apples[i] += a
            for (i in 0 until oranges.size) oranges[i] += b
            var pickApples = 0
            var pickOranges = 0
            apples.forEach { if (it in pickUpRange) pickApples += 1 }
            oranges.forEach { if (it in pickUpRange) pickOranges += 1 }
            println(pickApples)
            println(pickOranges)
        }

    }
}