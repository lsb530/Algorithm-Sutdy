package inflearn.dingco.section3.question

import java.util.ArrayDeque

class IsCorrectParenthesisMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = True / 현재 풀이 값 = ${isCorrectParenthesis("(())")}")
            println("정답 = False / 현재 풀이 값 = ${isCorrectParenthesis(")")}")
            println("정답 = False / 현재 풀이 값 = ${isCorrectParenthesis("((())))")}")
            println("정답 = False / 현재 풀이 값 = ${isCorrectParenthesis("())()")}")
            println("정답 = False / 현재 풀이 값 = ${isCorrectParenthesis("((())")}")
        }

        private fun isCorrectParenthesis(string: String): Boolean {
            val stack = ArrayDeque<Char>()
            for (c in string) {
                if (c == '(') {
                    stack.push(c)
                }
                else {
                    if (stack.isEmpty()) {
                        return false
                    }
                    stack.pop()
                }
            }
            return stack.isEmpty()
        }
    }
}