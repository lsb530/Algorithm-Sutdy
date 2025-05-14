package hacker_rank.strings

class SuperReducedString {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(superReducedString("aaabccddd")) // abd
            println(superReducedString("aa")) // Empty String
            println(superReducedString("baab")) // Empty String
        }

        private fun superReducedString(s: String): String {
            val stack = ArrayDeque<Char>()
            stack.addLast(s[0])
            for (i in 1 until s.length) {
                if (stack.isNotEmpty() && s[i] == stack.last()) {
                    stack.removeLast()
                }
                else {
                    stack.addLast(s[i])
                }
            }
            return if (stack.isEmpty()) {
                "Empty String"
            } else {
                stack.joinToString("")
            }
        }
    }
}