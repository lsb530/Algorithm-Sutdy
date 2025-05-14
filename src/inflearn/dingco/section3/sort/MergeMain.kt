package inflearn.dingco.section3.sort

class MergeMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arrayA = intArrayOf(1, 2, 3, 5)
            val arrayB = intArrayOf(4, 6, 7, 8)

            println(merge(arrayA, arrayB).contentToString())  // [1, 2, 3, 4, 5, 6, 7, 8] 가 되어야 합니다!
            println(
                "정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = ${
                    merge(
                        intArrayOf(-7, -1, 9, 40),
                        intArrayOf(5, 6, 10, 11)
                    ).contentToString()
                }"
            )
            println(
                "정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = ${
                    merge(
                        intArrayOf(-1, 2, 3, 5, 40),
                        intArrayOf(10, 78, 100)
                    ).contentToString()
                }"
            )
            println(
                "정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = ${
                    merge(
                        intArrayOf(-1, -1, 0),
                        intArrayOf(1, 6, 9, 10)
                    ).contentToString()
                }"
            )
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