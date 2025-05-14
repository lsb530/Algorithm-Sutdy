package inflearn.kimtaewon1.b_array.i_gridmaxsum;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-09
 */
public class Main {

    private static int getGridSumMax(int n, int[][] grid) {
        int rowSumMax = Integer.MIN_VALUE;
        int colSumMax = Integer.MIN_VALUE;
        int crossSumMax = Integer.MIN_VALUE;

        int leftCrossSum = 0;
        int rightCrossSum = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];
                if (i == j) {
                    leftCrossSum += grid[i][j];
                }
                if (i == n - j - 1) {
                    rightCrossSum += grid[i][j];
                }
            }
            rowSumMax = Math.max(rowSum, rowSumMax);
            colSumMax = Math.max(colSum, colSumMax);
        }
        crossSumMax = Math.max(leftCrossSum, rightCrossSum);

        return Math.max(Math.max(rowSumMax, colSumMax), crossSumMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(getGridSumMax(n, grid));
    }
}
