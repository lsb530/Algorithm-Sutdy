package lv0.코딩기초트레이닝.연산.두수의연산값비교하기

import kotlin.math.max

//fun solution(a: Int, b: Int): Int {
//    val x = "$a$b".toInt()
//    val y = 2 * a * b
//    return max(x, y)
//}

fun solution(a: Int, b: Int) = max("$a$b".toInt(), 2 * a * b)

fun main() {
    println(solution(2, 91))
}
