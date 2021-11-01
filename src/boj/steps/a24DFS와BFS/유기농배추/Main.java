package boj.steps.a24DFS와BFS.유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    static int[][] ground;
    static boolean[][] isVisit;
    static int count;
    static int[] dx = {-1, 1, 0, 0}; // 좌우상하
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            final int M = Integer.parseInt(st.nextToken());
            final int N = Integer.parseInt(st.nextToken());
            final int K = Integer.parseInt(st.nextToken());
            ground = new int[M][N];
            isVisit = new boolean[M][N];
            for (int i = 0; i < M; i++) {
                Arrays.fill(isVisit[i], false);
            }
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                ground[u][v] = 1;
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (!isVisit[i][j] && ground[i][j] == 1) {
                        BFS(i, j, M, N);
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    static void BFS(int x, int y, int M, int N) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        isVisit[x][y] = true;
        while(!q.isEmpty()) {
            Pair p = q.remove();
            x = p.x;
            y = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (ground[nx][ny] == 1 && !isVisit[nx][ny]) {
                        q.add(new Pair(nx, ny));
                        isVisit[nx][ny] = true;
                    }
                }
            }
        }
        count++;
    }
}