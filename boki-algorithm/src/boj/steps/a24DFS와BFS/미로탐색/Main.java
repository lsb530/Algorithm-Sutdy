package boj.steps.a24DFS와BFS.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {

    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] maze;
    static boolean[][] isVisit;
    static int[] dx = {-1, 1, 0, 0}; // 좌우상하
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int M = Integer.parseInt(st.nextToken());
        final int N = Integer.parseInt(st.nextToken());
        maze = new int[M][N];
        isVisit = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                maze[i][j] = s.charAt(j) - '0';
                isVisit[i][j] = false;
            }
        }
        isVisit[0][0] = true;
        BFS(0, 0, M, N);
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(maze[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(maze[M - 1][N - 1]);
    }

    static void BFS(int x, int y, int M, int N) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        while (!q.isEmpty()) {
            Pair p = q.remove();
            x = p.x;
            y = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (maze[nx][ny] == 1 && !isVisit[nx][ny]) {
                        q.add(new Pair(nx, ny));
                        maze[nx][ny] = maze[x][y] + 1;
                        isVisit[nx][ny] = true;
                    }
                }
            }
        }
    }
}