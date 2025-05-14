class Solution {
    fun solution(num_list: IntArray): Int {
        val mul = num_list.fold(1) { acc, x -> acc * x }
        val sum = num_list.sum()
        return if (mul < sum * sum) 1 else 0
    }
}