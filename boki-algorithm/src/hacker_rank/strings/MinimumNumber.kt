package hacker_rank.strings

class MinimumNumber {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(minimumNumber(3, "Ab1"))
            println(minimumNumber(5, "12345"))
            println(minimumNumber(11, "#HackerRank"))
        }

        private fun minimumNumber(n: Int, password: String): Int {
            var toBeChecked = 4
            if (checkNumbers(password)) toBeChecked -= 1
            if (checkLowerCase(password)) toBeChecked -= 1
            if (checkUpperCase(password)) toBeChecked -= 1
            if (checkSpecialChar(password)) toBeChecked -= 1

            val m = 6 - n
            return if (m >= toBeChecked) m
            else toBeChecked
        }

        private fun checkNumbers(password: String): Boolean {
            val numbers = "0123456789"
            return password.any { it in numbers }
        }

        private fun checkLowerCase(password: String): Boolean {
            val lowerCase = "abcdefghijklmnopqrstuvwxyz"
            return password.any { it in lowerCase }
        }

        private fun checkUpperCase(password: String): Boolean {
            val upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            return password.any { it in upperCase }
        }

        private fun checkSpecialChar(password: String): Boolean {
            val specialCharacters = "!@#$%^&*()-+"
            return password.any { it in specialCharacters }
        }
    }
}