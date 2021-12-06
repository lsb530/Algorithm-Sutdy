package boj.steps.a28트리.트리의지름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Node>[] tree;
    static boolean[] visited;
    static int[] dist;
    static int max;
    static int node;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N + 1];
        dist = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while (st.countTokens() - 1 > 0) {
                int e = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                tree[s].add(new Node(e, cost));
                tree[e].add(new Node(s, cost));
            }
        }

//        //임의의 노드(1)에서 부터 가장 먼 노드를 찾는다. 이때 찾은 노드를 node에 저장한다.
//        visited = new boolean[N + 1];
//        dfs(1, 0);
//
//        //node에서 부터 가장 먼 노트까지의 거리를 구한다.
//        visited = new boolean[N + 1];
//        dfs(node, 0);
//
//        System.out.println(max);

        visited = new boolean[N + 1];
        bfs(1);
        int node = 1;
        for (int i = 2; i <= N; i++) {
            if(dist[node] < dist[i]) node = i;
        }

        visited = new boolean[N + 1];
        dist = new int[N + 1];
        bfs(node);
        int diameter = Arrays.stream(dist).max().getAsInt();
        System.out.println(diameter);
    }

    public static void dfs(int x, int len) {
        if (max < len) {
            max = len;
            node = x;
        }
        visited[x] = true;

        for (Node n : tree[x]) {
            int next = n.e;
            int cost = n.cost;
            if(!visited[next]) {
                dfs(next, len + cost);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int now = queue.poll();
            for (Node n : tree[now]) {
                int next = n.e;
                int len = n.cost;
                if(!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[now] + len;
                    queue.add(next);
                }
            }
        }
    }

    static class Node {

        int e;
        int cost;

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }

    }

}