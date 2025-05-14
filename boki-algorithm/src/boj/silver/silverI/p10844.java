package boj.silver.silverI;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10844 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private final static long MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
//        int d[N][L] = N자리 마지막 수는 L
        int N = Integer.parseInt(br.readLine());
        long[][] d = new long[N+1][10];
        for (int i = 0; i < 9; i++) {
            d[1][i] = 1; // 길이가 1인 경우는 다 1로 초기화
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                d[i][j] = 0;
                if (j-1>=0) d[i][j] += d[i-1][j-1];
                if (j+1<=9) d[i][j] += d[i-1][j+1];
                d[i][j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += d[N][i] % MOD;
        }
        System.out.println(answer);
    }

}