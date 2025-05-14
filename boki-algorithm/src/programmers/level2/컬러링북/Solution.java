package programmers.level2.컬러링북;

import java.util.LinkedList;
import java.util.Queue;

class Pair {

    public int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class Solution {

    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visit;

    public static int[] solution(int m, int n, int[][] picture) {
        visit = new boolean[m][n];
        int max = Integer.MIN_VALUE;
        int[][] clone = picture.clone();
        int num = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (clone[i][j] == 0) {
                    continue;
                }
                if (!visit[i][j]) {
                    int bfs = bfs(new Pair(i, j), m, n, clone, clone[i][j]);
                    num++;
                    max = Math.max(max, bfs);
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = num;
        answer[1] = max;

        for (int i = 0; i < 2; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static int bfs(Pair start, int m, int n, int[][] picture, int target) {
        Queue<Pair> queue = new LinkedList<>();
        int cnt = 1;
        queue.add(start);
        visit[start.x][start.y] = true;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                    if (!visit[nx][ny] && picture[nx][ny] == target) {
                        visit[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int m = 6, n = 4;
        int[][] picture = {
            {1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}
        };
        solution(m, n, picture);
    }
}