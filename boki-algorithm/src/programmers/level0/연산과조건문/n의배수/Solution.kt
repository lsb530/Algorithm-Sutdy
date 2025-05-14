package lv0.코딩기초트레이닝.연산과조건문.n의배수

//fun solution(num: Int, n: Int): Int {
//    return if (num % n == 0) 1 else 0
//}
fun solution(num: Int, n: Int) = if (num % n == 0) 1 else 0

fun main() {
    println(solution(98, 2))
}