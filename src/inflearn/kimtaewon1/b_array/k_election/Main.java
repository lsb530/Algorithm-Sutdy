package inflearn.kimtaewon1.b_array.k_election;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-11
 */
public class Main {

    private static int electTempCaptain(int n, int[][] meetTable) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int meetCount = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (meetTable[i][k] == meetTable[j][k]) {
                        meetCount++;
                        break;
                    }
                }
            }
            if (meetCount > max) {
                max = meetCount;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[][] meetTable = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                meetTable[i][j] = sc.nextInt();
            }
        }
        System.out.println(electTempCaptain(n, meetTable));
    }
}
