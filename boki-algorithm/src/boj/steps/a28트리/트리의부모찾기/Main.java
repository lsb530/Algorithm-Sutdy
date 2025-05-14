package boj.steps.a28트리.트리의부모찾기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] parent = null;
    static boolean[] check = null;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        graph = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph.get(v).add(e);
            graph.get(e).add(v);
        }
        parent = new int[N + 1];
        check = new boolean[N + 1];
//        dfs(1); check[1] = true;
        bfs(1);
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    public static void dfs(int node) {
        for (int next : graph.get(node)) {
            if (!check[next]) {
                check[next] = true;
                parent[next] = node;
                dfs(next);
            }
        }
    }

    public static void bfs(int root) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(root);
        check[root] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : graph.get(now)) {
                if (!check[next]) {
                    check[next] = true;
                    parent[next] = now;
                    queue.add(next);
                }
            }
        }
    }
}