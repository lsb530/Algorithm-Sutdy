package boj.bronze.bronzeV;

import java.util.Scanner;

public class p21300 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            sum += (scanner.nextInt() * 5);
        }
        System.out.println(sum);
    }
}