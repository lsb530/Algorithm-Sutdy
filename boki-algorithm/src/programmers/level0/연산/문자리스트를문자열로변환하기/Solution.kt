package lv0.코딩기초트레이닝.연산.문자열리스트를문자열로변환하기

//class Solution {
fun solution(arr: Array<String>): String {
    return arr.joinToString("")
//    var answer = ""
//    for (s in arr) {
//        answer += s
//    }
//    return answer
//}
}

fun main() {
    var arr = arrayOf("a", "b", "c")
    println(solution(arr))
}