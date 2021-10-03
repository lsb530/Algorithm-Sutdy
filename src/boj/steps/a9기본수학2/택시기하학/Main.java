package boj.steps.a9기본수학2.택시기하학;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.6f\n", (double)r * r * Math.PI);
        System.out.printf("%.6f\n", (double)r * r * 2f);
    }
}