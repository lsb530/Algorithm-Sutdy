package skills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cycle {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] graph;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int N = Integer.parseInt(br.readLine()); // 정점의 개수
            graph = new int[N + 1];
            isVisited = new boolean[N + 1];
            Arrays.fill(isVisited, false);
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 초기화
            for (int i = 1; i <= N; i++) {
                graph[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;
            for (int i = 1; i <= N; i++) {
                if (!isVisited[i]) {
                    dfs(i);
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    static void dfs(int x) {
        if (isVisited[x]) {
            return;
        }
        isVisited[x] = true;
        dfs(graph[x]);
    }
}