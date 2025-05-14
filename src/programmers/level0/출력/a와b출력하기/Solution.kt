package lv0.코딩기초트레이닝.출력.a와b출력하기

import jdk.internal.joptsimple.internal.Strings.repeat

//fun main(args: Array<String>) {
//    readlnOrNull()?.split(' ')?.takeIf { it.size >= 2 }?.apply {
//        val (a, b) = this.map { it.toInt() }
//        println("a = $a")
//        println("b = $b")
//    } ?: println("Invalid input")
//}

fun main(args: Array<String>) {
    val input = readln().split(' ')
    val s1 = input[0]
    val a = input[1].toInt()
    repeat(a) {
        print(s1)
    }
}