package lv0.코딩기초트레이닝.연산과조건문.조건문자열;

class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        val operations = mapOf(
            ">=" to { x: Int, y: Int -> x >= y },
            ">!" to { x: Int, y: Int -> x > y },
            "<=" to { x: Int, y: Int -> x <= y },
            "<!" to { x: Int, y: Int -> x < y }
        )

        return operations[ineq + eq]?.let { if (it(n,m)) 1 else 0 }
            ?: throw IllegalArgumentException("Invalid operation")
    }
}

fun main() {
    println(Solution().solution("<", "=", 20, 50))
    println(Solution().solution(">", "!", 41, 78))
}