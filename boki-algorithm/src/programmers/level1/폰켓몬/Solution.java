package programmers.level1.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));
    }

    public static int solution(int[] nums) {
        int target = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        return Math.min(target, set.size());
    }
}