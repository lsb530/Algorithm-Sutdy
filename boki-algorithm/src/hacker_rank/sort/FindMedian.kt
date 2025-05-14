package hacker_rank.sort

class FindMedian {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(findMedian(arrayOf(5, 3, 1, 2, 4)))
            println(findMedian(arrayOf(0, 1, 2, 4, 6, 5, 3)))
        }

        private fun findMedian(arr: Array<Int>): Int {
            return arr.sorted()[arr.size / 2]
        }
    }
}