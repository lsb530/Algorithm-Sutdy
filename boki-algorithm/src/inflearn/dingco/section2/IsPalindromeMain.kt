package inflearn.dingco.section2

class IsPalindromeMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(isPalindrome("abcba"))
            println(isPalindrome("우영우"))
            println(isPalindrome("역삼역"))
            println(isPalindrome("기러기"))
            println(isPalindrome("토마토"))
            println(isPalindrome("오디오"))
            println(isPalindrome("아시아"))
            println(isPalindrome("일요일"))
            println(isPalindrome("소주만병만주소"))
            println(isPalindrome("가련하시다 사장 집 아들 딸들아 집 장사 다시 하련가"))

            println()

            println(isPalindromeRecursive("abcba"))
            println(isPalindromeRecursive("우영우"))
            println(isPalindromeRecursive("역삼역"))
            println(isPalindromeRecursive("기러기"))
            println(isPalindromeRecursive("토마토"))
            println(isPalindromeRecursive("오디오"))
            println(isPalindromeRecursive("아시아"))
            println(isPalindromeRecursive("일요일"))
            println(isPalindromeRecursive("소주만병만주소"))
            println(isPalindromeRecursive("가련하시다 사장 집 아들 딸들아 집 장사 다시 하련가"))
        }

        private fun isPalindrome(str: String): Boolean {
            val s = str.trim().replace(" ", "")
            return s == s.reversed()
        }

        private fun isPalindromeRecursive(str: String): Boolean {
            val s = str.trim().replace(" ", "")
            if (s.length <= 1) return true
            else if (s[0] != s[s.length - 1]) return false
            return isPalindromeRecursive(s.substring(1, s.length - 1))
        }
    }
}