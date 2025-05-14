package lv0.코딩기초트레이닝.연산.더크게합치기

import kotlin.math.max

fun solution(a: Int, b: Int): Int {
//    val x = (a.toString() + b.toString()).toInt()
//    val y = (b.toString() + a.toString()).toInt()
//    return Math.max(x, y)
    return max("$a$b".toInt(), "$b$a".toInt())
}
