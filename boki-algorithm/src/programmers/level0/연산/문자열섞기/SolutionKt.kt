class SolutionKt {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
//    for (i in 0 until str1.length) {
//        answer += str1[i]
//        answer += str2[i]
//    }
        str1.indices.forEach {
            answer += str1[it]
            answer += str2[it]
        }
        return answer
    }
}