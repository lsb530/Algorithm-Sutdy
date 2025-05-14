package inflearn.kimtaewon1.b_array.f_flipprime;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-06
 */
public class Main {

    private static int[] primeArr;

    private static void eratosthenesFilter(final int maxValue) {
        primeArr = new int[maxValue + 1];
        primeArr[0] = 1;
        primeArr[1] = 1;
        for (int i = 2; i <= maxValue; i++) {
            if (primeArr[i] == 0) {
                for (int j = i; j <= maxValue; j += i) {
                    primeArr[j] = 1;
                    primeArr[i] = -1;
                }
            }
        }
    }

    private static int[] getFlippedPrimeNumberArr(
        int n, int[] arr
    ) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            int t = Integer.parseInt(sb.reverse().toString());
            if (primeArr[t] == -1)
                temp.add(t);
            // System.out.println(t);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxValue = Math.max(maxValue, arr[i]);
        }
        eratosthenesFilter(100_000);
        /*
        for (int i = 1; i <= maxValue; i++) {
            // -1이면 소수
            System.out.println(i + " is PrimeNumber = " + primeArr[i]);
        }
         */
        int[] answer = getFlippedPrimeNumberArr(n, arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
