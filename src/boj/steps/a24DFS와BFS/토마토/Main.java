package boj.steps.a24DFS와BFS.토마토;

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
    static int[][] tomatoes;
    static boolean[][] isVisit;
    static int[] dx = {-1, 1, 0, 0}; // 좌우상하
    static int[] dy = {0, 0, -1, 1};
    static Queue<Pair> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 6
        int N = Integer.parseInt(st.nextToken()); // 4
        tomatoes = new int[N][M]; // 4 * 6
        isVisit = new boolean[N][M];
        for (int i = 0; i < N; i++) { // 4
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) { // 6
                tomatoes[i][j] = Integer.parseInt(st.nextToken());
                isVisit[i][j] = false;
            }
        }
        // 익은 토마토 큐에 담기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoes[i][j] == 1 && !isVisit[i][j]) {
                    isVisit[i][j] = true;
                    q.add(new Pair(i, j));
                }
            }
        }
        BFS(N, M);
    }

    static void BFS(int N, int M) {
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (tomatoes[nx][ny] == 0 && !isVisit[nx][ny]) { // 0일때만 익게 해야됨
                        q.add(new Pair(nx, ny));
                        tomatoes[nx][ny] = tomatoes[p.x][p.y] + 1; // 날짜 count
                        isVisit[nx][ny] = true;
                    }
                }
            }
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(tomatoes[i][j] + " ");
//            }
//            System.out.println();
//        }

        int max = Integer.MIN_VALUE; // 토마토가 익는 최대 일수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoes[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, tomatoes[i][j]);
            }
        }
        System.out.println(max - 1); // n일 차일때 걸린 일수니깐~
    }
}