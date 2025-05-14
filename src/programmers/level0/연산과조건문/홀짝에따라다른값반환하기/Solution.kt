package lv0.코딩기초트레이닝.연산과조건문.홀짝에따라다른값반환하기
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val isEven = n % 2 == 0
        val start = if (isEven) 2 else 1
        for (i in start..n step 2) {
            answer += if (isEven) i * i else i
        }
        return answer
    }
}

