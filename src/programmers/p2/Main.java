package programmers.p2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair {

    int x;
    int y;
    int cnt;

    public Pair(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

class Solution {

    static final int[] dx = {0, 1, 0, -1};
    static final int[] dy = {1, 0, -1, 0};

    public int go(String[] map) {
        int n = map.length;
        int m = map[0].length();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i].charAt(j) == 'P') {
                    boolean[][] visited = new boolean[n][m];
                    Queue<Pair> q = new LinkedList();
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        Pair cur = q.poll();

                        if (cur.cnt == 2) {
                            continue;
                        }

                        for (int d = 0; d < 4; d++) {
                            int nx = cur.x + dx[d];
                            int ny = cur.y + dy[d];
                            if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]) {
                                continue;
                            }

                            if (map[nx].charAt(ny) == 'P') {
                                return 0;
                            } else if (cur.cnt < 2 && map[nx].charAt(ny) == 'O') {
                                visited[nx][ny] = true;
                                q.offer(new Pair(nx, ny, cur.cnt + 1));
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < places.length; i++) {
            answer[i] = go(places[i]);
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        System.out.println(Arrays.toString(s.solution(places)));
    }
}