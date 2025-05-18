package leetcode.threesum.java;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution2();
        var a1 = sol.threeSum(new int[]{-1, 0, 1, 2, -1, -4}); // [[-1,-1,2], [-1,0,1]]
        System.out.println(a1);
        var a2 = sol.threeSum(new int[]{0, 1, 1}); // []
        System.out.println(a2);
        var a3 = sol.threeSum(new int[]{0, 0, 0}); // [[0,0,0]]
        System.out.println(a3);
    }

}