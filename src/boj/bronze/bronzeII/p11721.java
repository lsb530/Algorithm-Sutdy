package boj.bronze.bronzeII;

import java.util.Scanner;

public class p11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        for (int i = 0; i < s.length(); i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
    }
}