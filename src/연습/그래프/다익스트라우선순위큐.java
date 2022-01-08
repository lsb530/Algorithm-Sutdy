package 연습.그래프;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
sample input
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6
 */
public class 다익스트라우선순위큐 {

    static BufferedReader br;
    static BufferedWriter bw;

    static class Node implements Comparable<Node> {

        int idx, cost;

        public Node(int id, int cost) {
            this.idx = id;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    static int V, E, K;
    static int u, v, w;
    static int[] dist;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        dist = new int[V + 1];
        for (int i = 0; i < V + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // 간선의 최대 개수 * 가중치의 최대값으로 초기화시켜줘야됨
        }

        for (int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            graph.get(u).add(new Node(v, w));
        }

        dijkstra(K);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < V + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(dist[i] + "\n");
            }
        }
        bw.write(sb.toString());
//        System.out.println(Arrays.toString(dist));

        bw.flush();
        bw.close();
        br.close();
    }

    static void dijkstra(int start) {
        // 1. 출발지 비용은 0으로 하고 출발지를 PQ에 넣고 시작
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            // 목표 정점이 꺼내 졌다면, 해당 노드까지는 최솟값 갱신이 완료 되었다는 것이 확정이다(다익스트라 알고리즘).
            // 따라서, 반복문을 종료해도 되지만, 해당 코드는 시작 정점에 대하여 모든 정점으로의 최단 경로를 구하는 것을 가정한다.
            // * 목표 정점이 구해졌다면 빠르게 탈출할 수 있는 조건이다.
//			if (curNode.idx == end) {
//				System.out.println(dist[curNode.idx]);
//				return;
//			}

            // 꺼낸 노드 = 현재 최소 비용을 갖는 노드
            // 즉, 해당 노드의 비용이 현재 dist 배열에 기록된 내용보다 크다면 고려할 필요가 없으므로 스킵한다.
            // 주의점 2 : 중복노드 방지1 : 만일, 이 코드를 생략한다면, 언급한 내용대로 이미 방문한 정점을 중복하여 방문하게 된다.
            // * 더 큰 가중치로 도착한 경우 패스
            if (dist[now.idx] < now.cost) {
                continue;
            }

            for (Node next : graph.get(now.idx)) {
                // 만일, 주변 노드까지의 현재 dist 값(비용)과 현재 선택된 노드로부터 주변 노드로 가는 비용을 비교하고,
                // 더 작은 값을 선택한다.
                if (dist[next.idx] > now.cost + next.cost) {
                    dist[next.idx] = now.cost + next.cost;
                    pq.add(new Node(next.idx, dist[next.idx]));
                }
            }
        }
    }
}