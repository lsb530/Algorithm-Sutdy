package lv0.코딩기초트레이닝.출력과연산.홀짝구분하기

fun main(args: Array<String>) {
    val a = readln().toInt()
    println("$a is ${if (a % 2 == 0) "even" else "odd"}")
}