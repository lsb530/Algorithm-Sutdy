package inflearn.dingco.section3.sort

class BubbleSortMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = ${bubbleSort(intArrayOf(4, 6, 2, 9, 1)).contentToString()}")
            println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ${bubbleSort(intArrayOf(3, -1, 17, 9)).contentToString()}")
            println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ${bubbleSort(intArrayOf(100, 56, -3, 32, 44)).contentToString()}")
        }

        // O(N^2)
        private fun bubbleSort(array: IntArray): IntArray {
            for (i in 0..<array.lastIndex) {
                for (j in 0..<array.lastIndex - i) {
                    // println("i=${i}, j=${j}")
                    // println("array[j]=${array[j]}, array[j+1]=${array[j+1]}")
                    if (array[j] > array[j + 1]) {
                        array[j] = array[j + 1].also { array[j + 1] = array[j] }
                    }
                }
            }
            // println(array.toList())
            return array
        }
    }
}