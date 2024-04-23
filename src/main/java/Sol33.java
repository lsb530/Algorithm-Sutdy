import java.util.Arrays;

public class Sol33 {

    public static void main(String[] args) {
        int answer = solution(
                4,
                new int[][]{
                        {0, 1, 1}, {0, 2, 2}, {1, 2, 5},
                        {1, 3, 1}, {2, 3, 8}
                }
        );
        System.out.println(answer); // 4
    }

    public static int[] parent;

    public static int find(int x) {
        // x가 속학 집합의 루트 노드 찾기
        if (parent[x] == x) {
            return x;
        }
        // 경로 압축: x의 부모를 루트로 설정
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        // 두 집합을 하나의 집합으로 합치기
        int root1 = find(x);
        int root2 = find(y);
        parent[root2] = root1;
    }

    // 최소 신장 트리
    public static int solution(int n, int[][] costs) {
        // 비용을 기준으로 다리를 오름차순 정렬
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        // parent 배열 초기화
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int answer = 0; // 최소 신장 트리의 총 비용
        int edges = 0; // 연결된 다리의 수

        for (int[] edge : costs) {
            // n-1개의 다리가 연결된 경우 모든 섬이 연결됨
            if (edges == n - 1)
                break;

            // 현재 다리가 연결하는 두 섬이 이미 연결되어 있는지 확인
            if (find(edge[0]) != find(edge[1])) {
                // 두 섬을 하나의 집합으로 연결함
                union(edge[0], edge[1]);
                // 현재 다리의 건설 비용을 총 비용에 추가
                answer += edge[2];
                // 사용된 다리의 수 1증가
                edges++;
            }
        }
        return answer;
    }
}
