package boj.bronze.bronzeV;

import java.util.Scanner;

public class p3046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();
        // (r1 + x) / 2 = s
        // s*2 - r1
        System.out.println(s * 2 - r1);
    }
}