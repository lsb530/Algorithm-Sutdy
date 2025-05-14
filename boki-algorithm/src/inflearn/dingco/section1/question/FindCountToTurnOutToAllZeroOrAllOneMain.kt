package inflearn.dingco.section1.question

class FindCountToTurnOutToAllZeroOrAllOneMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(findCountToTurnOutToAllZeroOrAllOne("011110"))
        }

        private fun findCountToTurnOutToAllZeroOrAllOne(str: String): Int {
            val firstNumber = str[0]
            var all2Zero = 0
            var all2One = 0

            if (firstNumber == '0') {
                all2One++
            } else {
                all2Zero++
            }

            for (i in 0..<str.length - 1) {
                println("str[i] = ${str[i]}")
                println("str[i+1] = ${str[i + 1]}")
                val left = str[i]
                val right = str[i + 1]
                if (left != right) {
                    if (left == '0')
                        all2One++
                    else
                        all2Zero++
                }
            }
            // println(all2One)
            // println(all2Zero)
            return minOf(all2One, all2Zero)
        }
    }
}