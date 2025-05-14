package boj.bronze.bronzeV;

import java.util.Scanner;

public class p2475 {

    // https://www.acmicpc.net/problem/2475
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            result += n * n;
        }
        result = result % 10;
        System.out.println(result);
    }
}