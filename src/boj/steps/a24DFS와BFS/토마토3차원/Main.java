package boj.steps.a24DFS와BFS.토마토3차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair {

    int x;
    int y;
    int z;

    public Pair(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][][] tomatoes;
    static boolean[][][] isVisit;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<Pair> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        tomatoes = new int[H][N][M];
        isVisit = new boolean[H][N][M];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    tomatoes[i][j][k] = Integer.parseInt(st.nextToken());
                    isVisit[i][j][k] = false;
                }
            }
        }
        // 익은 토마토 큐에 담기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomatoes[i][j][k] == 1 && !isVisit[i][j][k]) {
                        isVisit[i][j][k] = true;
                        q.add(new Pair(j, k, i));
                    }
                }
            }
        }
        BFS(N, M, H);
    }

    static void BFS(int N, int M, int H) {
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                int nz = p.z + dz[i];
                if (0 <= nx && nx < N && 0 <= ny && ny < M && 0 <= nz && nz < H) {
                    if (tomatoes[nz][nx][ny] == 0 && !isVisit[nz][nx][ny]) { // 0일때만 익게 해야됨
                        q.add(new Pair(nx, ny, nz));
                        tomatoes[nz][nx][ny] = tomatoes[p.z][p.x][p.y] + 1; // 날짜 count
                        isVisit[nz][nx][ny] = true;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE; // 토마토가 익는 최대 일수
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomatoes[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, tomatoes[i][j][k]);
                }
            }
        }
        System.out.println(max - 1); // n일 차일때 걸린 일수니깐~
    }
}