package leetcode.groupanagrams.kotlin

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val answer1 = sol.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
            println(answer1) // [["bat"],["nat","tan"],["ate","eat","tea"]]

            val answer2 = sol.groupAnagrams(arrayOf())
            println(answer2)

            val answer3 = sol.groupAnagrams(arrayOf("a"))
            println(answer3)
        }
    }
}

class Solution {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val results: MutableMap<String, MutableList<String>> = mutableMapOf()

        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            results.getOrPut(key) { mutableListOf() }
            results[key]!!.add(str)
        }

        return results.values.toList()
    }

}