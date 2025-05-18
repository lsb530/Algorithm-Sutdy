package leetcode.reversestring.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val s1 = "hello".toCharArray()
            println(s1)
            sol.reverseString(s1)
            println(s1)

            val s2 = "Hannah".toCharArray()
            println(s2)
            sol.reverseString(s2)
            println(s2)
        }
    }
}

class Solution {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        while (start < end) {
            s[start] = s[end].also { s[end] = s[start] }
            start++
            end--
        }
    }
}