package boj.steps.a15동적계획법1.신나는함수실행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9184 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][][] memo = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) break;
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }
    // DP(dynamic Programming) Memoization

    public static int w(int a, int b, int c) {

        boolean flag = 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;

        if(flag && memo[a][b][c] != 0) return memo[a][b][c];

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
//            return w(20, 20, 20);
            return memo[20][20][20] = w(20, 20, 20);
        }

        if (a < b && b < c) {
//            return w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            return memo[a][b][c] =
                w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        return memo[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) +
            w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }
}