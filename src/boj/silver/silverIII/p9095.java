package boj.silver.silverIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9095 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int x = oneToThreeSum();
            System.out.println(x);
        }
    }

    private static int oneToThreeSum() throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2; // 1+1, 2
        d[3] = 4; // 1+1+1, 1+2, 2+1, 3
        for (int i = 4; i <= N; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }
        return d[N];
    }

}