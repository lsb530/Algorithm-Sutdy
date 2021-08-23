package boj.bronze.bronzeV;

import java.util.Scanner;

public class p16430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 1 - a/b
        // b-a b
        System.out.println(b-a + " " + b);
    }
}