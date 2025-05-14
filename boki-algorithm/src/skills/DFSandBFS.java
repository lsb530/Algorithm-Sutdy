package skills;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSandBFS {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken()); // Many Vertex, Node
        final int M = Integer.parseInt(st.nextToken()); // Many Edge
        final int S = Integer.parseInt(st.nextToken()); // start

        isVisited = new boolean[N + 1];

        // 간선 리스트 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        System.out.println("Graph Input");
        for (int i = 1; i < graph.size(); i++) {
            System.out.println("node = " + i);
            StringBuilder s = new StringBuilder();
            s.append("vertex: ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                s.append(graph.get(i).get(j)).append(" ");
            }
            System.out.println(s);
        }

        Arrays.fill(isVisited, false);
        System.out.println("DFS");
        dfs(S);
        System.out.println();

        Arrays.fill(isVisited, false);
        System.out.println("BFS");
        bfs(S);
        System.out.println();
    }

    static void dfs(int x) {
        if (isVisited[x]) {
            return;
        }
        isVisited[x] = true;
        System.out.print(x + " ");
        for (Integer y : graph.get(x)) {
            if (!isVisited[y]) {
                dfs(y);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        isVisited[start] = true;
        while (!q.isEmpty()) {
            Integer x = q.remove();
            System.out.print(x + " ");
            for (Integer y : graph.get(x)) {
                if (!isVisited[y]) {
                    isVisited[y] = true;
                    q.add(y);
                }
            }
        }
    }

}