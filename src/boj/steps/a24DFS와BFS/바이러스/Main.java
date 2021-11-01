package boj.steps.a24DFS와BFS.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisit;
    static int visitCnt;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        isVisit = new boolean[N + 1];
        for(int i = 0; i <= N; i++) {
          graph.add(new ArrayList<>());
        }
        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        Arrays.fill(isVisit,false);
        DFS(1);
        System.out.println(visitCnt);
    }
    public static void DFS(int x) {
        if(isVisit[x]) return;
        isVisit[x] = true;
        for (Integer y : graph.get(x)) {
            if(!isVisit[y]) {
                visitCnt++;
                DFS(y);
            }
        }
    }

}