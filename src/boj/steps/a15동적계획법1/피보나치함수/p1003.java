package boj.steps.a15동적계획법1.피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1003 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[] memo;
    static String[] memo2;
    static int[] b = new int[2];
    static int zero, one;

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());
            memo = new long[n+1];
            memo2 = new String[n+1];
            int[] a = new int[2];
            Arrays.fill(memo2,"0");
//            Fibonacci(n);
            String fibonacci = fibonacci(n, a);
//            System.out.println(fibonacci);
            System.out.println(a[0] + " " + a[1]);
//            System.out.println(zero + " " + one);
            zero = 0; one = 0;
            Arrays.fill(memo, 0);
        }
    }
//4
//0
//1
//3
//4
    private static String fibonacci(int n, int[] a) {
        if (n <= 1) {
            if(n == 0) a[0]++;
            else if(n == 1) a[1]++;
            return a[0] + " " + a[1];
//            return String.valueOf(n);
        } else if (!memo2[n].equals("0")) {
            String[] s = memo2[n].split(" ");
            a[0] += Integer.parseInt(s[0]);
            a[1] += Integer.parseInt(s[1]);
            return memo2[n] = a[0] + " " + a[1];
//            return memo2[n];
        } else {
            fibonacci(n - 2, a);
            fibonacci(n - 1, a);
            return memo2[n] = a[0] + " " + a[1];
//            return memo2[n] = fibonacci(n - 2, a) + fibonacci(n - 1, a);
        }
    }

    private static long Fibonacci(int n) {
        if (n <= 1) {
            if(n == 0) zero++;
            else if(n == 1) one++;
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }

}