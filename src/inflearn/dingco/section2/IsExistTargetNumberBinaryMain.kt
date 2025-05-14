package inflearn.dingco.section2

class IsExistTargetNumberBinaryMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val target = 2
            val array = intArrayOf(0, 3, 5, 6, 1, 2, 4)
            println(isExistTargetNumberBinary(target, array))
        }

        private fun isExistTargetNumberBinary(target: Int, array: IntArray): Boolean {
            return array.binarySearch(target) != -1
        }
    }
}