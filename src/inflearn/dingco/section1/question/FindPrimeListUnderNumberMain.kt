package inflearn.dingco.section1.question

import kotlin.math.sqrt

class FindPrimeListUnderNumberMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(findPrimeListUnderNumber(20).toList())
            println(findPrimeListUnderNumber2(20).toList())
        }

        private fun findPrimeListUnderNumber(input: Int): IntArray {
            val booleanArray = Array(input + 1) { false }
            val answer = mutableListOf<Int>()
            for (i in 2..input) {
                if (!booleanArray[i]) {
                    booleanArray[i] = true
                    answer.add(i)
                }
                for (j in i..input step i) {
                    booleanArray[j] = true
                }
            }

            return answer.toIntArray()
        }

        private fun findPrimeListUnderNumber2(input: Int): IntArray {
            val primeFlags = BooleanArray(input + 1) { true }
            primeFlags[0] = false
            primeFlags[1] = false
            for (i in 2..sqrt(input.toDouble()).toInt()) {
                if (primeFlags[i]) {
                    for (j in i * i..input step i) {
                        primeFlags[j] = false
                    }
                }
            }

            val answer = mutableListOf<Int>()
            for (i in 2..input) {
                if (primeFlags[i]) {
                    answer.add(i)
                }
            }
            return answer.toIntArray()
        }
    }
}