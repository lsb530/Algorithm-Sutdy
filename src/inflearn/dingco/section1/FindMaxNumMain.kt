package inflearn.dingco.section1

class FindMaxNumMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(findMaxNum(intArrayOf(3, 5, 6, 1, 2, 4)))
            println(findMaxNum(intArrayOf(6, 6, 6)))
            println(findMaxNum(intArrayOf(6, 9, 2, 7, 1888)))
        }

        private fun findMaxNum(arr: IntArray) = arr.max()
    }
}