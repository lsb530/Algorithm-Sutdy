package inflearn.dingco.section1

class FindMaxOccurredAlphabetMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = i 현재 풀이 값 = ${findMaxOccurAlphabet("hello my name is dingcodingco")}")
            println("정답 = e 현재 풀이 값 = ${findMaxOccurAlphabet("we love algorithm")}")
            println("정답 = b 현재 풀이 값 = ${findMaxOccurAlphabet("best of best youtube")}")
        }

        private fun findMaxOccurAlphabet(str: String): Char {
            val intArr = Array(26) { 0 }
            str.forEach {
                if (it.isLetter())
                    intArr[it.code - 'a'.code]++
            }

            var maxOccur = Int.MIN_VALUE
            var maxAlphaIdx = 0

            for (index in intArr.indices) {
                if (intArr[index] > maxOccur) {
                    maxOccur = intArr[index]
                    maxAlphaIdx = index
                }
            }

            return (maxAlphaIdx + 'a'.code).toChar()
        }
    }
}