package boj.steps.a15동적계획법1.파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9461 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[] memo = new long[101];

    public static void main(String[] args) throws IOException {
        // 1 1 1 2 2 3 4 5 7 9
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            System.out.println(surfSeq(Integer.parseInt(br.readLine())));
        }
    }

    public static long surfSeq(int n) {
        memo[1] = 1; memo[2] = 1; memo[3] = 1; memo[4] = 2;
        for (int i = 5; i <= n; i++) {
            memo[i] = memo[i-2] + memo[i-3];
        }
        return memo[n];
    }
}