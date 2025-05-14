package boj.steps.a15동적계획법1.RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1149 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static int Red = 0, Green = 1, Blue = 2;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] Cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Cost[i][Red] = Integer.parseInt(st.nextToken());
            Cost[i][Green] = Integer.parseInt(st.nextToken());
            Cost[i][Blue] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            Cost[i][Red] += Math.min(Cost[i - 1][Green], Cost[i - 1][Blue]);
            Cost[i][Green] += Math.min(Cost[i - 1][Red], Cost[i - 1][Blue]);
            Cost[i][Blue] += Math.min(Cost[i - 1][Red], Cost[i - 1][Green]);
        }
        System.out.println(
            Math.min(Math.min(Cost[N - 1][Red], Cost[N - 1][Green]), Cost[N - 1][Blue]));
    }

}