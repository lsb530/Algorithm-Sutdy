package boj.bronze.bronzeII;

import java.util.Scanner;

public class p10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        int[] alphabet = new int[26];
        int[] result = new int[26];
        int idx = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            alphabet[idx] = i;
            idx++;
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (s[i].charAt(0) == (char) alphabet[j]) {
                    result[j]++;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}