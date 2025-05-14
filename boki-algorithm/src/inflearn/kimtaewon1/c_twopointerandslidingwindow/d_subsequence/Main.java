package inflearn.kimtaewon1.c_twopointerandslidingwindow.d_subsequence;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int getSumContinuousSubSequence(
        int n, int targetSum,
        int[] seq
    ) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum+=seq[rt];
            if(sum==targetSum) answer++;
            while (sum >= targetSum) {
                sum -= seq[lt++];
                if (sum == targetSum)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int targetSum = sc.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }
        System.out.println(getSumContinuousSubSequence(n, targetSum, seq));
    }
}
