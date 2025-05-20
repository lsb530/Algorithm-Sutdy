package leetcode.trappingrainwater.java;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution2();
        int a1 = sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(a1); // 6
        int a2 = sol.trap(new int[]{4, 2, 0, 3, 2, 5});
        System.out.println(a2); // 9
        System.out.println();
        int a3 = sol.trap(new int[]{1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(a3); // 6
    }

}