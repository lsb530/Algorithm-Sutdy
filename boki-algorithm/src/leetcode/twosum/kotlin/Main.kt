package leetcode.twosum.kotlin

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1: IntArray = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)  // [0, 1]
            val a2: IntArray = sol.twoSum(intArrayOf(3, 2, 4), 6)       // [1, 2]
            val a3: IntArray = sol.twoSum(intArrayOf(3, 3), 6)          // [0, 1]
            println(a1.contentToString())
            println(a2.contentToString())
            println(a3.contentToString())
        }
    }

}

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            if (numsMap.containsKey(complement)) {
                return intArrayOf(numsMap[complement] ?: 0, i)
            }
            numsMap[num] = i
        }

        return intArrayOf(-1, -1)
    }

}