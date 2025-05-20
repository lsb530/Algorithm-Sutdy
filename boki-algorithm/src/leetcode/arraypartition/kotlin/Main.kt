package leetcode.arraypartition.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1 = sol.arrayPairSum(intArrayOf(1, 3, 4, 2))
            println(a1) // 4

            val a2 = sol.arrayPairSum(intArrayOf(1, 4, 3, 2))
            println(a2) // 4

            val a3 = sol.arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2))
            println(a3) // 9
        }
    }
}

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        nums.sortedArray().forEachIndexed { idx, value ->
            if (idx % 2 == 0) sum += value
        }
        return sum
    }
}