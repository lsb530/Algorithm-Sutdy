package boj.steps.a24DFS와BFS.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static boolean[] isVisit;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호
        isVisit = new boolean[N + 1];
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
//        System.out.println("Graph Input");
//        for (int i = 1; i < graph.size(); i++) {
//            System.out.println(" node = " + i);
//            StringBuilder s = new StringBuilder();
//            s.append("vertex: ");
//            for (int j = 0; j < graph.get(i).size(); j++) {
//                s.append(graph.get(i).get(j)).append(" ");
//            }
//            System.out.println(s);
//        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        Arrays.fill(isVisit,false);
        DFS(V);
        System.out.println(sb);

        sb = new StringBuilder();
        Arrays.fill(isVisit,false);
        BFS(V);
        System.out.println(sb);
    }

    public static void DFS(int x) {
        if(isVisit[x]) return;
        isVisit[x] = true;
        sb.append(x).append(" ");
        for (Integer y : graph.get(x)) {
            if(!isVisit[y]) DFS(y);
        }
    }

    public static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        isVisit[start] = true;
        while (!q.isEmpty()) {
            Integer x = q.remove();
            sb.append(x).append(" ");
            for (Integer y : graph.get(x)) {
                if (!isVisit[y]) {
                    isVisit[y] = true;
                    q.add(y);
                }
            }
        }
    }
}