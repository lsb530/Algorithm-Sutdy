package leetcode.twosum.java;

import java.util.Arrays;

/**
 * 투 포인터 - 정렬&인덱스가 바뀌어서 답이 틀려짐
 */
public class Solution4 implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        Arrays.sort(nums);

        while (left != right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }

        return new int[]{-1, -1};
    }

}
