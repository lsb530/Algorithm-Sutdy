package inflearn.kimtaewon1.a_string.h_alphapalindrome;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-08
 */
public class Main {

    private static boolean isAlphaPalindrome(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            char lt = input.charAt(i);
            char rt = input.charAt(len - i - 1);
            if (lt != rt)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isAlphaPalindrome(input) ? "YES" : "NO");
    }

}
