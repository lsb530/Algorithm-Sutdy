package inflearn.dingco.section3.hash

class GetAbsentStudentMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val allStudents = arrayOf("나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위")
            val presentStudents = arrayOf("정연", "모모", "채영", "쯔위", "사나", "나연", "미나", "다현")
            println(getAbsentStudent(allStudents, presentStudents))
            println(
                "정답 = 예지 / 현재 풀이 값 = ${
                    getAbsentStudent(
                        arrayOf("류진", "예지", "채령", "리아", "유나"),
                        arrayOf("리아", "류진", "채령", "유나")
                    )
                }"
            )
            println(
                "정답 = RM / 현재 풀이 값 = ${
                    getAbsentStudent(
                        arrayOf("정국", "진", "뷔", "슈가", "지민", "RM"),
                        arrayOf("뷔", "정국", "지민", "진", "슈가")
                    )
                }"
            )
        }

        private fun getAbsentStudent(allArray: Array<String>, presentArray: Array<String>): String {
            val answer = mutableListOf<String>()
            val presentStudentSet = setOf(*presentArray)
            for (student in allArray) {
                if (student !in presentStudentSet) {
                    answer += student
                }
            }
            return answer[0]
        }
    }
}