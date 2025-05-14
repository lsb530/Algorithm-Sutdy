package skills;

public class fibonacci {

    public static void main(String[] args) {
        int i = memoFibonacci(6);
        System.out.println("i = " + i);
        int j = memoFibonacciBottomUp(6);
        System.out.println("j = " + j);
    }

    public static int basicFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else { // m >= 2
            return basicFibonacci(n - 1) + basicFibonacci(n - 2);
        }
    }

    public static int memoFibonacci(int n) {
        int[] memo = new int[100];
        if (n <= 1) {
            return n;
        } else {
            if (memo[n] > 0) {
                return memo[n];
            }
            memo[n] = memoFibonacci(n - 1) + memoFibonacci(n - 2);
            return memo[n];
        }
    }

    public static int memoFibonacciBottomUp(int n) {
        int[] d = new int[100];
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= n; i++) { // 2:제일 작은 문제, n:풀어야 될 문제
            d[i] = d[i - 1] + d[i - 2];
        }
        return d[n];
    }
}