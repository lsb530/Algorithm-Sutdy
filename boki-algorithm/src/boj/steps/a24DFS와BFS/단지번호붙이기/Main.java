package boj.steps.a24DFS와BFS.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
    static int[][] a, visit;
    static int[] dx = {-1, 1, 0, 0}; // 좌우상하
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        a = new int[N + 1][N + 1];
        visit = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] == 1 && visit[i][j] == 0) {
                    BFS(i, j, ++cnt, N);
                }
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 1, 2, 3으로 칠했으니깐 0,1,2번째 배열을 증가시켜줘야됨
                if (visit[i][j] != 0) answer[visit[i][j]-1]+=1;
            }
        }
        Arrays.sort(answer);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(visit[i][j]);
            }
            System.out.println();
        }
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void BFS(int x, int y, int cnt, int n) {
//        System.out.println("BFS executed");
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        visit[x][y] = cnt;
        while (!q.isEmpty()) {
            Pair p = q.remove();
            x = p.x;
            y = p.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (a[nx][ny] == 1 && visit[nx][ny] == 0) {
                        q.add(new Pair(nx, ny));
                        visit[nx][ny] = cnt;
                    }
                }
            }
        }
    }
}