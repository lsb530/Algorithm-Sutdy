package boj.steps.a24DFS와BFS.나이트의이동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] board;
    static boolean[][] visit;
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
    static int N;

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            board = new int[N][N];
            visit = new boolean[N][N];
            Pair[] position = new Pair[2];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                position[i] = new Pair(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            }
            Pair start = position[0];
            Pair end = position[1];
            BFS(start, end);
            sb.append(board[end.x][end.y]).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    static void BFS(Pair start, Pair end) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(start.x, start.y));
        visit[start.x][start.y] = true;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;
            if (x == end.x && y == end.y) return;
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                    if (!visit[nx][ny]) {
                        queue.offer(new Pair(nx, ny));
                        visit[nx][ny] = true;
                        board[nx][ny] = board[x][y] + 1;
                    }
                }
            }
        }
    }

    static class Pair {

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}