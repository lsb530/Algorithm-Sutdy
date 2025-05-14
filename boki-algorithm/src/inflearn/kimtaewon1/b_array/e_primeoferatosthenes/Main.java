package inflearn.kimtaewon1.b_array.e_primeoferatosthenes;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-05
 */
public class Main {

    private static int getPrimeCountFrom(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        System.out.println(getPrimeCountFrom(n));
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            // System.out.print(isPrime(i) ? i + " " : "");
            if (isPrime(i)) answer++;
        }
        System.out.println(answer);
    }
}
