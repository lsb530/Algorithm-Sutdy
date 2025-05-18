package leetcode.validpalindrome.java;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution1();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car")); // false
        System.out.println(sol.isPalindrome(" ")); // true
    }
}