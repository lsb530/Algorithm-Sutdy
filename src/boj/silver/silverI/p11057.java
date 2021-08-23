package boj.silver.silverI;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11057 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        // d[i][j] = i자리 수의 오르막수의 마지막 수가 j임
        int N = Integer.parseInt(br.readLine());
        long[][] d = new long[N + 1][10];
        for (int i = 0; i < 10; i++) {
            d[1][i] = 1; // 1자리수는 다 1임
        }
        for (int i = 2; i < N + 1; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    d[i][j] += d[i-1][k];
                    d[i][j] %= 10007;
                }
            }
        }
        long answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += d[N][i];
        }
        System.out.println(answer%10007);
    }

}