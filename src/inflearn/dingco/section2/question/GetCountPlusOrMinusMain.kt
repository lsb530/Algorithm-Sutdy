package inflearn.dingco.section2.question

class GetCountPlusOrMinusMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // 답 5
            println(getCountOfWaysToTargetByDoingPlusOrMinus(intArrayOf(1, 1, 1, 1, 1), 3))
        }

        private fun getCountOfWaysToTargetByDoingPlusOrMinus(array: IntArray, target: Int): Int {
            val result = mutableListOf<Int>()

            fun plusOrMinus(array: IntArray, idx: Int, sum: Int) {
                if (idx == array.size) {
                    result.add(sum)
                    return
                }
                plusOrMinus(array, idx + 1, sum + array[idx])
                plusOrMinus(array, idx + 1, sum - array[idx])
            }

            plusOrMinus(array, 0, 0)
            // println(result)

            var answer = 0
            for (x in result) {
                if (x == target)
                    answer += 1
            }
            return answer
        }
    }
}