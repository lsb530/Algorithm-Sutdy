package boj.bronze.bronzeV;

import java.util.Scanner;

public class p1550 {

    // https://www.acmicpc.net/problem/1550
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        int hex = Integer.parseInt(data, 16);
        System.out.println(hex);
    }
}