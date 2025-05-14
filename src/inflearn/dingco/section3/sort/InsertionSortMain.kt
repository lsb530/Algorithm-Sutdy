package inflearn.dingco.section3.sort

class InsertionSortMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [4, 5, 7, 7, 8] / 현재 풀이 값 = ${insertionSort(intArrayOf(5, 8, 4, 7, 7)).contentToString()}")
            println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ${insertionSort(intArrayOf(3, -1, 17, 9)).contentToString()}")
            println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ${insertionSort(intArrayOf(100, 56, -3, 32, 44)).contentToString()}")
        }

        private fun insertionSort(array: IntArray): IntArray {
            for (i in 1..<array.size) {
                for (j in 0..<i) {
                    // println("i-j = ${i - j}, i-j-1 = ${i - j - 1}")
                    if (array[i - j] < array[i - j - 1]) {
                        array[i - j] = array[i - j - 1].also { array[i - j - 1] = array[i - j] }
                    }
                    else {
                        break
                    }
                }
            }
            return array
        }
    }
}