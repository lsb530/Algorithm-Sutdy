package leetcode.reorderdatainlogfiles.kotlin

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()

            val a1 = sol.reorderLogFiles(arrayOf("dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"))
            println(a1.contentToString())

            val a2 = sol.reorderLogFiles(arrayOf("a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"))
            println(a2.contentToString())

            val a3 = sol.reorderLogFiles(arrayOf("a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"))
            println(a3.contentToString())
        }
    }
}

class Solution {

    fun reorderLogFiles(logs: Array<String>): Array<String> {
        val letterList = mutableListOf<String>()
        val digitList = mutableListOf<String>()

        for (log in logs) {
            if (log[log.length - 1] in '0'..'9') {
                digitList.add(log)
            }
            else {
                letterList.add(log)
            }
        }

        letterList.sortWith(Comparator { s1, s2 ->
            val s1x = s1.split(" ", limit = 2)
            val s2x = s2.split(" ", limit = 2)

            val compared = s1x[1].compareTo(s2x[1])
            if (compared == 0) {
                s1x[0].compareTo(s2x[0])
            }
            else {
                compared
            }
        })

        letterList.addAll(digitList)

        return letterList.toTypedArray()
    }

}