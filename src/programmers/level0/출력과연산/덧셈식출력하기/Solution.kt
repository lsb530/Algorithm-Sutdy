package lv0.코딩기초트레이닝.출력과연산.덧셈식출력하기

fun main(args: Array<String>) {
    val (a, b) = readln().split(' ').map(String::toInt)
    println("$a + $b = ${a + b}")
}