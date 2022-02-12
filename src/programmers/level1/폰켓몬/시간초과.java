package programmers.level1.폰켓몬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 시간초과 {

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};
//        solution(nums1);
//        solution(nums2);
        solution(nums3);
    }

    static int[] arr;
    static int max;

    public static int solution(int[] nums) {
        max = Integer.MIN_VALUE;
        boolean[] visit = new boolean[nums.length];
        arr = new int[nums.length / 2];
        dfs(0, 0, nums, visit, arr.length);
        System.out.println("max = " + max);
        return max;
    }

    public static void dfs(int depth, int start, int[] nums, boolean[] visit, int end) {
        // 중복 순열
        if (depth == end) {
            max = Math.max(max, getDiffCount(arr));
            System.out.println(Arrays.toString(arr));
            int diffCount = getDiffCount(arr);
            System.out.println("diffCount = " + diffCount);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = nums[i];
                dfs(depth + 1, i, nums, visit, end);
                visit[i] = false;
            }
        }
    }

    static int getDiffCount(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
//        int cnt = 1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] != arr[i + 1]) cnt++;
//        }
//        return cnt;
    }
}