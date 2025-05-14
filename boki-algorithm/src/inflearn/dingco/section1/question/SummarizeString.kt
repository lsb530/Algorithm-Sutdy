package inflearn.dingco.section1.question

class SummarizeString {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(summarizeString("abc"))
            println(summarizeString("aaabbbc"))
            println(summarizeString("abbbc"))
            println(summarizeString("ahhhhz"))
            println(summarizeString("acccdeee"))
        }

        private fun summarizeString(input: String): String {
            val answerList = mutableListOf<String>()
            var tempCh = input[0]
            var cnt = 1
            for (idx in 1..<input.length) {
                if (tempCh == input[idx]) {
                    cnt++
                }
                else {
                    answerList.add(tempCh + "" + cnt)
                    tempCh = input[idx]
                    cnt = 1
                }
            }
            answerList.add(tempCh + "" + cnt)
            return answerList.joinToString("/")
        }
    }
}