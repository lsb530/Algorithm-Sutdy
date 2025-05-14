package boj.silver.silverI;

import java.io.*;
import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class p2667 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[][] a;
    static int[][] d;
    // X행 Y열
    /*
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
     */
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void bfs(int x, int y, int cnt, int n) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        d[x][y] = cnt;
        while(!q.isEmpty()) {
            Pair p = q.remove();
            x = p.x;
            y = p.y;
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(0<=nx && nx < n && 0 <= ny && ny < n) {
                    if (a[nx][ny] == 1 && d[nx][ny] == 0) {
                        q.add(new Pair(nx, ny));
                        d[nx][ny] = cnt;
                    }
                }
            }
        }
    }

    public static void dfs(int x, int y, int cnt, int n) {
        d[x][y] = cnt;
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (a[nx][ny] == 1 && d[nx][ny] == 0) {
                    dfs(nx, ny, cnt, n);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        a = new int[N + 1][N + 1];
        d = new int[N + 1][N + 1];
        // d[i][j]를 방문 안했으면 0, 했으면 단지 번호
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        int cnt = 0; // 총 단지수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 정점(1)이고, 아직 방문하지 않았다면
                if (a[i][j] == 1 && d[i][j] == 0) {
//                    dfs(i, j, ++cnt, N);
                    bfs(i, j, ++cnt, N);
                }
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (d[i][j] != 0) {
                    answer[d[i][j]-1]+=1;
                }
            }
        }
        Arrays.sort(answer); // 각 단지내 집의 수
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.println(answer[i]);
        }
    }

}