package programmers.level1.소수만들기;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};
        int sol1 = solution(nums1);
        System.out.println("sol1 = " + sol1);
        cnt = 0;
        int sol2 = solution(nums2);
        System.out.println("sol2 = " + sol2);
    }

    static int cnt;

    public static int solution(int[] nums) {
        int[] mid = new int[3];
        boolean[] visit = new boolean[nums.length];
        dfs(0, 0, mid, nums, visit);
        return cnt;
    }

    public static void dfs(int depth, int start, int[] mid, int[] nums, boolean[] visit) {
        if (depth == 3) {
            int sum = 0;
            for (int i : mid) {
                sum += i;
            }
            boolean flag = true;
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                mid[depth] = nums[i];
                dfs(depth + 1, i + 1, mid, nums, visit);
                visit[i] = false;
            }
        }
    }
}