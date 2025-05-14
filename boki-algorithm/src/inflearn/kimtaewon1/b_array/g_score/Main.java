package inflearn.kimtaewon1.b_array.g_score;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-07
 */
public class Main {

    private static int calcuateTotalScore(int n, int[] scores) {
        int answer = 0;
        int weight = 1;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 1) {
                answer += weight;
                weight++;
            }
            else {
                weight = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        System.out.println(calcuateTotalScore(n, scores));
    }
}
