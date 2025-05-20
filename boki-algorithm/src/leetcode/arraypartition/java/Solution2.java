package leetcode.arraypartition.java;

import java.util.Arrays;

public class Solution2 implements Solution {

    @Override
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

}
