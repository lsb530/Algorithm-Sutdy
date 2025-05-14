package inflearn.dingco.section2

import java.math.BigInteger

class FactorialMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(factorial(5))
            println(factorial(60))
        }

        private fun factorial(n: Long): BigInteger {
            return if (n <= 1) BigInteger.ONE
            else {
                return BigInteger.valueOf(n).multiply(BigInteger.valueOf(factorial(n - 1).toLong()))
            }
        }
    }
}