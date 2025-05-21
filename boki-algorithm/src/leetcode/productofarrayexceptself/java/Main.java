package leetcode.productofarrayexceptself.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        var a1 = sol.productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(a1)); // [24, 12, 8, 6]

        var a2 = sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        System.out.println(Arrays.toString(a2)); // [0, 0, 9, 0, 0]
    }

}

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= p;
            p *= nums[i];
        }
        return result;
    }

}
