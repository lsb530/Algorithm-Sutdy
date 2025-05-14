package inflearn.kimtaewon1.a_string.g_palindrome;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-07
 */
public class Main {

    private static boolean isPalindrome(String input) {
        input = input.toUpperCase();
        int len = input.length();

        for (int i = 0; i < len / 2; i++) {
            char lt = input.charAt(i);
            char rt = input.charAt(len - i - 1);
            if (lt != rt)
                return false;
        }

        return true;
    }

    private static boolean isPalindromeByStringBuilder(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString().equalsIgnoreCase(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(isPalindrome(input) ? "YES" : "NO");
        // System.out.println(isPalindromeByStringBuilder(input) ? "YES" : "NO");
    }

}
