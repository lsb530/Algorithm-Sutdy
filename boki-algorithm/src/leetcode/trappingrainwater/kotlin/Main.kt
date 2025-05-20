package leetcode.trappingrainwater.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1: Int = sol.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
            println(a1) // 6
            val a2: Int = sol.trap(intArrayOf(4, 2, 0, 3, 2, 5))
            println(a2) // 9
            val a3: Int = sol.trap(intArrayOf(1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
            println(a3) // 6
        }
    }
}

class Solution {
    fun trap(height: IntArray): Int {
        var volume = 0
        var left = 0
        var right = height.size - 1
        var leftMax = height[left]
        var rightMax = height[right]

        while (left < right) {
            // Math.max
            leftMax = height[left].coerceAtLeast(leftMax)
            rightMax = height[right].coerceAtLeast(rightMax)

            if (leftMax <= rightMax) {
                volume += leftMax - height[left]
                left += 1
            } else {
                volume += rightMax - height[right]
                right -= 1
            }
        }
        return volume
    }
}