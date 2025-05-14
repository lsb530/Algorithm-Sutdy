package lv0.코딩기초트레이닝.출력.대소문자바꿔서출력하기

fun main(args: Array<String>) {
    val s1 = readln()
    val convertedString = s1.toCharArray().map { c ->
        if (c.isUpperCase()) {
            c.lowercaseChar()
        } else {
            c.uppercaseChar()
        }
    }.joinToString("")

    println(convertedString)
}
