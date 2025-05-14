class Solution {
    fun solution(num_list: IntArray): IntArray {
        val (a, b) = num_list.takeLast(2)
        return if (b > a) num_list.plus(b - a)
        else num_list.plus(b * 2)
    }
}