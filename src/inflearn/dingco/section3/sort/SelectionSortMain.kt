package inflearn.dingco.section3.sort

class SelectionSortMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = ${selectionSort(intArrayOf(4, 6, 2, 9, 1)).contentToString()}")
            println("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ${selectionSort(intArrayOf(3, -1, 17, 9)).contentToString()}")
            println("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ${selectionSort(intArrayOf(100, 56, -3, 32, 44)).contentToString()}")
        }

        // O(N^2)
        private fun selectionSort(array: IntArray): IntArray {
            for (i in 0 until array.size - 1) {
                var minIdx = i
                for (j in i + 1 until array.size) {
                    if (array[j] < array[minIdx]) {
                        minIdx = j
                    }
                }
                array[i] = array[minIdx].also { array[minIdx] = array[i] }
            }
            return array
        }
    }
}