package boj.bronze.bronzeII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798_블랙잭_빽트래킹 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static int n, m, ans;
    static int[] card;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        card = new int[n];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        ans = -1;
        solve(0, 0, 0);
        System.out.println(ans);
    }

    private static void solve(int index, int depth, int sum) {
        if (depth == 3) {
            if (sum <= m && ans < sum) {
                ans = sum;
            }
        }
        for (int i = index; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                solve(i, depth + 1, sum + card[i]);
                visit[i] = false;
            }
        }
    }
}