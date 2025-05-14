package hacker_rank.sort

class IntroTutorial {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(introTutorial(4, arrayOf(1, 4, 5, 7, 9, 12)))
        }

        private fun introTutorial(V: Int, arr: Array<Int>): Int {
            return arr.binarySearch(V)
        }
    }
}