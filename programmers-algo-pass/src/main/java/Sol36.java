import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Sol36 {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        // [0, 4, 3]
        System.out.println(Arrays.toString(solution(graph, 0, 3)));

        int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
        // [0, 1, 6, 7]
        System.out.println(Arrays.toString(solution(graph2, 0, 4)));
    }

    // 노드의 정보(노드 번호와 거리)를 쌍으로 저장할 클래스 생성
    private static class Node {
        int dest, cost;

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static int[] solution(int[][] graph, int start, int n) {
        // 인접리스트를 저장할 ArrayList 배열 초기화
        ArrayList<Node>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        // graph 정보를 인접 리스트로 저장
        for (int[] edge : graph) {
            adjList[edge[0]].add(new Node(edge[1], edge[2]));
        }

        int[] dist = new int[n];
        // 모든 노드의 거리 값을 무한대로 초기화
        Arrays.fill(dist, Integer.MAX_VALUE);

        // 시작 노드의 거리 값은 0으로 초기화
        dist[start] = 0;

        // 우선순위 큐를 생성하고 시작 노드를 삽입
        PriorityQueue<Node> pq = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.cost)
        );
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            // 현재 가장 거리가 짧은 노드를 가져옴
            Node now = pq.poll();

            // 만약 현재 노드의 거리값이 큐에서 가져온 거리값보다 크면, 해당 노드는 이미 방문한 것이므로 무시
            if (dist[now.dest] < now.cost)
                continue;

            // 현재 노드와 인접한 노드들의 거리값을 계산하여 업데이트
            for (Node next : adjList[now.dest]) {
                // 기존에 발견했던 거리보다 더 짧은 거리를 발견하면 거리값을 갱신하고 큐에 넣음
                if (dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        // 최단 거리를 담고 있는 배열을 반환
        return dist;
    }
}
