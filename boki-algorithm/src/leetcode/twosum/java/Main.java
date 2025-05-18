package leetcode.twosum.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution4();
        var a1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9); // [0, 1]
        var a2 = sol.twoSum(new int[]{3, 2, 4}, 6);      // [1, 2]
        var a3 = sol.twoSum(new int[]{3, 3}, 6);         // [0, 1]

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }

}