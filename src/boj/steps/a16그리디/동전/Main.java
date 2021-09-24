package boj.steps.a16그리디.동전;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] coins;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        coins = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins[i] = coin;
        }
        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            if(K == 0) break;
            if(coin > K) continue;
            int a = K / coin;
            K = K - (K/coin) * coin;
            result += a;
        }
        System.out.println(result);
    }


}