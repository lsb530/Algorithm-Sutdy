package boj.steps.a11브루트포스.체스판다시칠하기;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static char[][] chess;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        chess = new char[N][M];
        for (int i = 0; i < N; i++) {
            chess[i] = sc.next().toCharArray();
        }
        sc.close();
        int min = 64;
        char[] bw = {'B', 'W'};

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int b = 0;
                int w = 1;
                int change_b = 0;
                int change_w = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if (chess[x][y] != bw[b]) {
                            change_b++;
                        }
                        if (chess[x][y] != bw[w]) {
                            change_w++;
                        }
                        b = (b + 1) % 2;
                        w = (w + 1) % 2;
                    }
                    b = (b + 1) % 2;
                    w = (w + 1) % 2;
                }
                min = Math.min(min, Math.min(change_b, change_w));
            }
        }
        System.out.println(min);
    }
}