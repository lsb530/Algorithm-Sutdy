package boj.steps.a24DFS와BFS.이분그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static final int RED = 1;
    static final int BLUE = -1;
    static int[] colors; // 색 {RED 1 or BLUE -1}
    static boolean checkBipartite; // 이분 그래프인지 아닌지 확인

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            colors = new int[V + 1]; // 각 정점의 색 구분
            checkBipartite = true; // 초기: 이분 그래프라고 가정

            for (int i = 0; i <= V; i++) {
                graph.add(new ArrayList<>());
            }

            while (E-- > 0) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                graph.get(v).add(e);
                graph.get(e).add(v);
            }

            // 같은 레벨의 꼭짓점끼리는 무조건 같은 색, 인접한 정점 사이는 다른 색
            // 주의! 연결 그래프와 비연결 그래프(모든 정점을 돌면서 확인) 모두 고려!!
            Arrays.fill(colors, 0);
            for (int i = 1; i <= V; i++) {
                if(!checkBipartite) break;
                if(colors[i] == 0) {
                    dfs(i, RED);
                }
            }
            graph.clear();
            System.out.println(checkBipartite ? "YES" : "NO");
        }
    }

    static void dfs(int startV, int color) {
        colors[startV] = color; // 시작 정점의 색을 설정
        for (Integer y : graph.get(startV)) {
            // 시작 정점의 색과 인접한 정점의 색이 같으면 이분 그래프가 아니다.
            if(colors[y] == color) {
                checkBipartite = false;
                return;
            }
            // 시작 정점과 인접한 정점이 방문하지 않은 정점이면
            if(colors[y] == 0) {
                // 인접한 정점을 다른 색으로 지정
                dfs(y, -color);
            }
        }
    }

}