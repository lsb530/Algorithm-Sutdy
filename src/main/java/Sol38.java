
public class Sol38 {

    public static void main(String[] args) {
        int answer1 = solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        });
        System.out.println(answer1); // 2

        int answer2 = solution(3, new int[][]{
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        });
        System.out.println(answer2); // 1
    }

    private static boolean[] visit;
    private static int[][] computer;

    public static void dfs(int now) {
        visit[now] = true; // 현재노드 방문처리
        for (int i = 0; i < computer[now].length; i++) {
            // 연결되어 있으며 방문하지 않은 노드라면
            if (computer[now][i] == 1 && !visit[i]) {
                dfs(i); // 해당 노드를 방문하러 이동
            }
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visit = new boolean[n]; // 방문 여부를 저장할 배열

        for (int i = 0; i < n; i++) {
            // 아직 방문하지 않은 노드라면 해당 노드를 시작으로 dfs
            if (!visit[i]) {
                dfs(i);
                answer++; // DFS로 연결된 노드들을 모두 방문하면서 네트워크 개수 증가
            }
        }

        return answer;
    }
}
