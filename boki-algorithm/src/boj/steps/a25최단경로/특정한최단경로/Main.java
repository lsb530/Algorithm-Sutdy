package boj.steps.a25최단경로.특정한최단경로;
import java.io.*;
import java.util.*;
public class Main {

    static class Edge implements Comparable<Edge> {
        int id, cost;

        public Edge(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    static int[] dist;
    static boolean[] check;
//    final static int INF = Integer.MAX_VALUE;
    final static int INF = 200_000_000;

    public static void main(String[] args) throws IOException {
        // 1 -> 2 -> 3 -> N
        // 1 -> 3 -> 2 -> N
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        dist = new int[V + 1];
        check = new boolean[V + 1];
        Arrays.fill(dist, INF);
        for(int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        int way1 = 0;
        way1 += dijkstra(1, v1);
        way1 += dijkstra(v1, v2);
        way1 += dijkstra(v2, V);

        int way2 = 0;
        way2 += dijkstra(1, v2);
        way2 += dijkstra(v2, v1);
        way2 += dijkstra(v1, V);

        int result = (way1 >= INF && way2 >= INF) ? -1 : Math.min(way1, way2);
        System.out.println(result);
    }

    static int dijkstra(int start, int end) {
        Arrays.fill(dist, INF);
        Arrays.fill(check, false);
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Edge(start, 0));
        while(!pq.isEmpty()) {
            Edge now = pq.poll();
            if (now.cost > dist[now.id]) continue;
                for (Edge next : graph.get(now.id)) {
                    if (dist[next.id] > now.cost + next.cost) {
                        dist[next.id] = now.cost + next.cost;
                        pq.add(new Edge(next.id, dist[next.id]));
                    }
                }
            }
//        }
        return dist[end];
    }

}