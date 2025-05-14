
package lv0.코딩기초트레이닝.조건문.코드처리하기

class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        code.forEachIndexed { i, c ->
            if (c == '1') mode = mode xor 1
            else {
                if (i % 2 == mode) answer += c
            }
        }
        if (answer.length === 0) {
            return "EMPTY"
        }
        return answer
    }
}