package 연습.기본수학;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치 {

    static long[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new long[n + 1];
        Arrays.fill(memo, 0);
        System.out.println(fibo_memo(n));
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    public static long fibo_memo(int n) {
        if (n <= 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = fibo(n - 2) + fibo(n - 1);
        }
    }
}