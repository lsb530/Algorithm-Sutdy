package inflearn.dingco.section3.sort

class MergeSortMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = ${mergeSort(intArrayOf(-7, -1, 9, 40, 5, 6, 10, 11)).contentToString()}")
            println("정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = ${mergeSort(intArrayOf(-1, 2, 3, 5, 40, 10, 78, 100)).contentToString()}")
            println("정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = ${mergeSort(intArrayOf(-1, -1, 0, 1, 6, 9, 10)).contentToString()}")
        }

        private fun mergeSort(array: IntArray): IntArray {
            if (array.size <= 1) {
                return array
            }
            val mid = (0 + array.size) / 2
            // val leftArray = array.copyOfRange(0, mid)
            // val rightArray = array.copyOfRange(mid, array.size)
            val leftArray = array.sliceArray(0..<mid)
            val rightArray = array.sliceArray(mid..<array.size)

            // println(leftArray.contentToString())
            // println(rightArray.contentToString())

            return merge(leftArray, rightArray)
        }

        private fun merge(array1: IntArray, array2: IntArray): IntArray {
            val result = mutableListOf<Int>()
            var idx1 = 0
            var idx2 = 0

            while (idx1 < array1.size && idx2 < array2.size) {
                if (array1[idx1] < array2[idx2]) {
                    result.add(array1[idx1++])
                }
                else {
                    result.add(array2[idx2++])
                }
            }

            while (idx1 < array1.size) {
                result.add(array1[idx1++])
            }
            while (idx2 < array2.size) {
                result.add(array2[idx2++])
            }

            return result.toIntArray()
        }
    }
}