package boj.bronze.bronzeV;

import java.util.Scanner;

public class p2914 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int l = scanner.nextInt();
        System.out.println(a * (l - 1) + 1);
    }
}