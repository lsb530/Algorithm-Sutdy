package inflearn.dingco.section1

class FindMaxPlusOrMultiplyMain {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = 728 현재 풀이 값 = ${findMaxPlusOrMultiply(intArrayOf(0, 3, 5, 6, 1, 2, 4))}")
            println("정답 = 8820 현재 풀이 값 = ${findMaxPlusOrMultiply(intArrayOf(3, 2, 1, 5, 9, 7, 4))}")
            println("정답 = 270 현재 풀이 값 = ${findMaxPlusOrMultiply(intArrayOf(1, 1, 1, 3, 3, 2, 5))}")
        }

        private fun findMaxPlusOrMultiply(intArray: IntArray): Int {
            var result = intArray[0]
            for (i in 1..<intArray.size) {
                val plus = intArray[i] + result
                val multiply = intArray[i] * result
                result = maxOf(plus, multiply)
            }
            return result
        }
    }
}


