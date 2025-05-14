package boj.steps.a15동적계획법1.정수삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1932 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;
    static int[][] memo;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        memo = new int[N][N];
        for (int[] x : memo) {
            Arrays.fill(x,-1);
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            memo[N - 1][i] = arr[N - 1][i];
        }
        System.out.println(find(0, 0));
        System.out.println("gg");
    }
    public static int find(int depth, int idx) {

        if(depth == N - 1) return memo[depth][idx];

        if (memo[depth][idx] == -1) {
            memo[depth][idx] =
                Math.max(find(depth + 1, idx), find(depth + 1, idx + 1))
                    + arr[depth][idx];
        }
        return memo[depth][idx];

    }

}