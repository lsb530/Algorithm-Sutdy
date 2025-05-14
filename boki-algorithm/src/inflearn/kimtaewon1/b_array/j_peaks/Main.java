package inflearn.kimtaewon1.b_array.j_peaks;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-10
 */
public class Main {

    private static boolean isPeak(
        int row, int col, int n, int[][] mountain
    ) {
        int current = mountain[row][col];
        int left, right, up, down;
        left = right = up = down = 0;

        if (col - 1 >= 0)
            left = mountain[row][col - 1];
        if (col + 1 < n)
            right = mountain[row][col + 1];
        if (row - 1 >= 0)
            up = mountain[row - 1][col];
        if (row + 1 < n)
            down = mountain[row + 1][col];

        return current > left && current > right &&
            current > up && current > down;
    }

    private static int solution(int n, int[][] arr) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }

                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    private static int getNumberOfPeak(int n, int[][] mountain) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += isPeak(i, j, n, mountain) ? 1 : 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[][] mountain = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mountain[i][j] = sc.nextInt();
            }
        }
        // System.out.println(getNumberOfPeak(n, mountain));
        System.out.println(solution(n, mountain));
    }
}
