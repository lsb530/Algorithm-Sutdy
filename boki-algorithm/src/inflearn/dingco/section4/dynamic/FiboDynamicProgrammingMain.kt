package inflearn.dingco.section4.dynamic

class FiboDynamicProgrammingMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val memo = mutableMapOf<Long, Long>()
            memo[1] = 1
            memo[2] = 1

            val result = fiboDynamicProgramming(50, memo)
            // val result = fiboDynamicProgramming(100, memo)
            println(result)
        }

        private fun fiboDynamicProgramming(n: Long, fiboMemo: MutableMap<Long, Long>): Long {
            if (n in fiboMemo) {
                return fiboMemo[n]!!
            }

            val nthFibo = fiboDynamicProgramming(n - 1, fiboMemo) + fiboDynamicProgramming(n - 2, fiboMemo)
            fiboMemo[n] = nthFibo

            return nthFibo
        }
    }
}