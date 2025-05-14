package hacker_rank.sort

class CountingSort {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            countingSort(arrayOf(1, 1, 3, 2, 1))
        }

        private fun countingSort(arr: Array<Int>): Array<Int> {
            val countArr = Array(100) { 0 }
            for (x in arr) {
                countArr[x] += 1
            }
            // println(countArr.joinToString(" "))
            return countArr
        }
    }
}