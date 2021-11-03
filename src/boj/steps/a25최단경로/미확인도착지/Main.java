package boj.steps.a25최단경로.미확인도착지;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node implements Comparable<Node> {
        int id, cost;

        public Node(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return cost - o.cost;
        }

    }
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    static boolean[] visit;
    static int[] end;
    static final int INF = 10_000_000;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-- > 0) {
            graph = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            dist = new int[n+1];
            visit = new boolean[n+1];
            end = new int[t];
            Arrays.fill(dist, INF);
            Arrays.fill(visit, false);
            for(int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // start
            int g = Integer.parseInt(st.nextToken()); // v1
            int h = Integer.parseInt(st.nextToken()); // v2
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                graph.get(a).add(new Node(b, d * 2));
                graph.get(b).add(new Node(a, d * 2));
            }
            graph.get(g).stream().filter(node -> node.id == h).forEach(
                node -> node.setCost(node.getCost() - 1)
            ); // 홀수
            graph.get(h).stream().filter(node -> node.id == g).forEach(
                node -> node.setCost(node.getCost() - 1)
            );
            for (int i = 0; i < t; i++) {
                end[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(end);
            dijkstra(s);
            for (int i : end) {
                if(dist[i] % 2 == 1) {
                    bw.write(i + " ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        while(!pq.isEmpty()) {
            Node now = pq.poll();
            if(now.cost > dist[now.id] || visit[now.id]) continue;
            visit[now.id] = true;
            for (Node next : graph.get(now.id)) {
                if (!visit[next.id] && dist[next.id] > now.cost + next.cost) {
                    dist[next.id] = now.cost + next.cost;
                    pq.add(new Node(next.id, dist[next.id]));
                }
            }
        }
    }
}