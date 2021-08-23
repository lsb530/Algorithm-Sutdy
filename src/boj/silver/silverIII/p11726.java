package boj.silver.silverIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11726 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(br.readLine());
        int[] d = new int[1001];
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i <= N; i++) {
            d[i] = d[i - 1] + d[i - 2];
            d[i] %= 10007;
        }
        System.out.println(d[N]);
    }

}