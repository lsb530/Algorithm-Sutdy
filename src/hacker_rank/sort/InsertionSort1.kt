package hacker_rank.sort

class InsertionSort1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            insertionSort1(5, arrayOf(1, 2, 4, 5, 3))
            insertionSort1(5, arrayOf(2, 4, 6, 8, 3))
        }

        /*
           [1 2 4 5 3]
            1 2 4 5 5
            1 2 4 4 5
            1 2 3 4 5
         */
        private fun insertionSort1(n: Int, arr: Array<Int>) {
            val lastVal = arr[n - 1]
            var i = n - 2
            while (i >= 0 && lastVal < arr[i]) {
                arr[i + 1] = arr[i]
                println(arr.joinToString(" "))
                i -= 1
            }
            arr[i + 1] = lastVal
            println(arr.joinToString(" "))
        }
    }
}