package leetcode.twosum.java;

import java.util.HashMap;
import java.util.Map;

/**
 * 보수찾기
 */
public class Solution2 implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement) &&
                numsMap.get(complement) != i) {
                return new int[]{i, numsMap.get(complement)};
            }
        }

        return new int[]{-1, -1};
    }

}
