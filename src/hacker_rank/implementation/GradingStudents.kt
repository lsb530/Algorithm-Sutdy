package hacker_rank.implementation

class GradingStudents {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(gradingStudents(arrayOf(73, 67, 38, 33)).contentToString())
        }

        private fun gradingStudents(grades: Array<Int>): Array<Int> {
            val gradeList = grades.toMutableList()
            for (i in 0 until grades.size) {
                val grade = grades[i]
                if (grade < 38) {
                    continue
                }
                val nextGrade = 5 * (grade / 5 + 1)
                val hasToUpGrade = (nextGrade - grade) < 3
                if (hasToUpGrade) {
                    gradeList[i] = nextGrade
                }
            }
            return gradeList.toTypedArray()
        }
    }
}