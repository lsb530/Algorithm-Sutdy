package leetcode.mostcommonword.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1 = sol.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit"))
            println(a1) // ball

            val a2 = sol.mostCommonWord("a.", arrayOf())
            println(a2) // a
        }
    }
}

class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val counts: MutableMap<String, Int> = mutableMapOf()

        val words = paragraph.replace("\\W+".toRegex(), " ").lowercase().trim().split(" ")
        for (word in words) {
            if (!banned.contains(word)) {
                counts[word] = counts.getOrDefault(word, 0) + 1
            }
        }

        return counts.maxBy { it.value }.key
    }
}