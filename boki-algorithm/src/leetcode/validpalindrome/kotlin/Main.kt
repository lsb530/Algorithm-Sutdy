package leetcode.validpalindrome.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(isPalindrome("A man, a plan, a canal: Panama")) // true
            println(isPalindrome("race a car")) // false
            println(isPalindrome(" ")) // true
        }

        fun isPalindrome(s: String): Boolean {
            var start = 0
            var end = s.length - 1

            while (start < end) {
                val leftChar = s[start]
                val rightChar = s[end]
                when {
                    !Character.isLetterOrDigit(leftChar) -> start++
                    !Character.isLetterOrDigit(rightChar) -> end--
                    else -> {
                        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                            return false
                        }
                        start++
                        end--
                    }
                }
            }

            return true
        }
    }
}