package inflearn.kimtaewon1.b_array.b_seestudent;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-02
 */
public class Main {

    private static int ableToSeeNumberOfStudent(
        int n, int[] heights
    ) {
        int answer = 0;
        int maxHeight = heights[0];
        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                answer++;
                maxHeight = heights[i];
            }
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        final int N = sc.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(ableToSeeNumberOfStudent(N, heights));
    }
}
