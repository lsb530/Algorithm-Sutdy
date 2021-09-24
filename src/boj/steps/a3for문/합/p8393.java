package boj.steps.a3for문.합;

import java.util.Scanner;

public class p8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1부터 n까지의 합 공식 = n*(n+1)/2
        System.out.println((n * (n + 1)) / 2);
    }
}