package boj.silver.silverII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class p11724 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        isVisited = new boolean[N + 1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph.get(v).add(e);
            graph.get(e).add(v);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        Arrays.fill(isVisited,false);
        int components = 0;
        for (int i = 1; i <= N; i++) {
            if (!isVisited[i]) {
                dfs(i);
                components += 1;
            }
        }
        System.out.println(components);
    }

    static void dfs(int x) {
        if(isVisited[x]) return;
        isVisited[x] = true;
        for (Integer y : graph.get(x)) {
            if (!isVisited[y]) {
                dfs(y);
            }
        }
    }

}