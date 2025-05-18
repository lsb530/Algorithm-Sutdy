package leetcode.threesum.kotlin

import java.util.Arrays

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1 = sol.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)) // [[-1,-1,2], [-1,0,1]]
            println(a1)
            val a2 = sol.threeSum(intArrayOf(0, 1, 1)) // []
            println(a2)
            val a3 = sol.threeSum(intArrayOf(0, 0, 0)) // [[0,0,0]]
            println(a3)
        }
    }
}

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var left: Int
        var right: Int
        var sum: Int
        val results: MutableList<List<Int>> = mutableListOf()
        Arrays.sort(nums)

        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }

            left = i + 1
            right = nums.size - 1
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right]
                if (sum < 0) {
                    left += 1
                }
                else if (sum > 0) {
                    right -= 1
                }
                else {
                    results.add(listOf(nums[i], nums[left], nums[right]))

                    // 중복 값 skip
                    while (left < right && nums[left] == nums[left + 1]) {
                        left += 1
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right -= 1
                    }
                    left += 1
                    right -= 1
                }
            }
        }

        return results
    }
}