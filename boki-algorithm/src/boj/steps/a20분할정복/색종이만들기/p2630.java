package boj.steps.a20분할정복.색종이만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2630 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void partition(int row, int col, int size) {
        if(colorCheck(row,col,size)) {
            if(arr[row][col] == 0) white++;
            else blue++;
            return;
        }
        int cutSize = size / 2; // 4
        // Logic
        // 1. 0~2/n, 0~2/n
        partition(row, col, cutSize);

        // 2. 0~2/n, 2/n+1~n
        partition(row,col+cutSize, cutSize);

        // 3. 2/n+1~n, 0~2/n
        partition(row+cutSize,col, cutSize);

        // 4. 2/n+1~n, 2/n+1~n
        partition(row+cutSize,col+cutSize, cutSize);
    }

    private static boolean colorCheck(int row, int col, int size) {
        int color = arr[row][col];
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                if(arr[i][j] != color) return false;
            }
        }
        return true;
    }
}