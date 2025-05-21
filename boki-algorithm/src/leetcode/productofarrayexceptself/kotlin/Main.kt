package leetcode.productofarrayexceptself.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution()
            val a1 = sol.productExceptSelf(intArrayOf(1, 2, 3, 4))
            println(a1.contentToString()) // [24, 12, 8, 6]

            val a2 = sol.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
            println(a2.contentToString()) // [0, 0, 9, 0, 0]
        }
    }
}

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var p = 1
        for (i in nums.indices) {
            result[i] = p
            p *= nums[i]
        }
        p = 1
        for (i in nums.indices.reversed()) {
            result[i] = p
            p *= nums[i]
        }
        return result
    }
}
