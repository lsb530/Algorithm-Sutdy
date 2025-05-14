// 1
class Solution {
    data class NumObj(
        val evens: MutableList<Int> = mutableListOf(),
        val odds: MutableList<Int> = mutableListOf(),
    )

    fun solution(num_list: IntArray): Int {
        val (evens, odds) = num_list.fold(NumObj()) { acc, num ->
            if (num % 2 == 0) acc.evens.add(num)
            else acc.odds.add(num)
            acc
        }
        return evens.joinToString(separator = "").toInt() + odds.joinToString(separator = "").toInt()
    }
}

// 2
class Solution {
    fun solution(numList: IntArray) = numList.partition { it % 2 == 0 }.toList().sumOf { it.joinToString("").toInt() }
}