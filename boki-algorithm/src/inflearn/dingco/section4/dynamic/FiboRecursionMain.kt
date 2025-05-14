package inflearn.dingco.section4.dynamic

class FiboRecursionMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val result = fiboRecursion(20)
            println(result)
        }

        private fun fiboRecursion(n: Int): Int {
            if (n == 1 || n == 2) {
                return 1
            }
            return fiboRecursion(n - 1) + fiboRecursion(n - 2)
        }
    }
}
