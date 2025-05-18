package leetcode.twosum.java;

import java.util.HashMap;
import java.util.Map;

/**
 * 조회 구조 개선(1번의 for문)
 */
public class Solution3 implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[]{numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}
