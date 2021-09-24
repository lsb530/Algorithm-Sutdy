package boj.gold.goldIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p9466 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] graph;
    static int[] isVisited;
    static int[] whichSearch;

    public static void main(String[] args) throws IOException {
        // 주의: 사이클 문제같지만, 더 꼬아서 생각해야된다.
        // 같은 DFS에서 시작한 사이클만 허용(다른 DFS에서 시작한 사이클은 만나자마자 팀을 이룰 수 없다)
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            graph = new int[N + 1];
            isVisited = new int[N + 1];
            whichSearch = new int[N + 1];
            Arrays.fill(isVisited, 0); // 방문 안한것: 0, 1이상: 방문한 순서
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                int x = Integer.parseInt(st.nextToken());
                graph[i] = x;
            }
            int ans = 0;
            System.out.println();
            for (int i = 1; i <= N; i++) {
                if (isVisited[i] == 0) {
                    ans += dfs(i, 1, i);
                }
            }
            System.out.println(N - ans);
        }

    }

    static int dfs(int x, int cnt, int step) {
        System.out.println("x = " + x + ", cnt = " + cnt + ", step = " + step);
        if (isVisited[x] != 0) {
            if (step != whichSearch[x]) {
                return 0;
            }
            return cnt - isVisited[x];
        }
        isVisited[x] = cnt;
        whichSearch[x] = step;
        return dfs(graph[x], cnt + 1, step);
    }

}