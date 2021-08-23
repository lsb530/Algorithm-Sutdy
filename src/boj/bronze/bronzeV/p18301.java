package boj.bronze.bronzeV;

import java.util.Scanner;

public class p18301 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double data = (double) (a + 1) * (b + 1) / (c + 1) - 1;
        System.out.println((int)Math.floor(data));
    }
}