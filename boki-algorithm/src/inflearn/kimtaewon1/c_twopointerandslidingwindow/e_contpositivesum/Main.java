package inflearn.kimtaewon1.c_twopointerandslidingwindow.e_contpositivesum;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int getContinuousPositiveSum(int targetSum) {
        int answer = 0, sum = 0, lt = 0;
        int m = targetSum / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
            arr[i] = i + 1;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == targetSum)
                answer++;
            while (sum >= targetSum) {
                sum -= arr[lt++];
                if (sum == targetSum)
                    answer++;
            }
        }
        return answer;
    }

    private static int getContinuousPositiveSumByMath(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++; // 연속된 자연수의 개수
            n -= cnt;
            if (n % cnt == 0) {
                // System.out.println(n + " " + cnt);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int sum = scanner.nextInt(); // 15
        // 연속된 자연수는 sum/2+1를 증가할 수는 없다(ex: 15/2=7+1. 8+9를 넘을 수가 없다)
        // System.out.println(getContinuousPositiveSum(sum));
        System.out.println(getContinuousPositiveSumByMath(sum));
    }

}
