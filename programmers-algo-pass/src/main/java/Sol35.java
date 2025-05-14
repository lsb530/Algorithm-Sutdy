import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Sol35 {

    public static void main(String[] args) {
        int[] answer1 = solution(
                new int[][]{
                        {1, 2}, {1, 3}, {2, 4},
                        {3, 5}, {3, 6}, {3, 7},
                        {4, 8}, {5, 8}, {6, 9},
                        {7, 9}
                },
                1,
                9
        );
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(answer1));

        int[] answer2 = solution(
                new int[][]{{1, 3}, {3, 4}, {3, 5}, {5, 2}},
                1,
                5
        );
        // [1, 3, 4, 5, 2]
        System.out.println(Arrays.toString(answer2));
    }

    // 인접 리스트 저장할 ArrayList 배열
    private static ArrayList<Integer>[] adjList;

    // 방문 여부를 저장할 boolean 배열
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static int[] solution(int[][] graph, int start, int n) {
        adjList = new ArrayList[n + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }

        // 방문 여부를 저장할 배열
        visited = new boolean[n + 1];
        answer = new ArrayList<>();
        bfs(start); // 시작 노드에서 너비 우선 탐색 시작

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // BFS 탐색 메서드
    public static void bfs(int start) {
        // 탐색시 맨 처음 방문할 노드를 add하고 방문 처리
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;

        // 큐가 비어있지 않은 동안 반복
        while (!queue.isEmpty()) {
            // 큐에 있는 원소중 가장 먼저 추가된 원소를 poll하고 정답 리스트에 추가
            int now = queue.poll();
            answer.add(now);
            // 인접한 이웃 노드들에 대해서
            for (int next : adjList[now]) {
                if (!visited[next]) { // 방문하지 않은 인접한 노드인 경우
                    // 인접한 노드를 방문 처리
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }

}
