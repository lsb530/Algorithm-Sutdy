package leetcode.arraypartition.java;

import leetcode.twosum.java.Solution3;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution2();
        int a1 = sol.arrayPairSum(new int[]{1, 3, 4, 2});
        System.out.println(a1); // 4

        int a2 = sol.arrayPairSum(new int[]{1, 4, 3, 2});
        System.out.println(a2); // 4

        int a3 = sol.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2});
        System.out.println(a3); // 9
    }

}
