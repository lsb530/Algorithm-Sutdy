package lv0.코딩기초트레이닝.조건문.등차수열의특정한항만더하기

class Solution {
    // simple
//    fun solution(a: Int, d: Int, included: BooleanArray) = included.indices.filter { included[it] }.sumOf { a + d * it }

    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        return included.foldIndexed(0) { idx, sum, include ->
            if (include) sum + a + (idx * d) else sum
        }
    }

}