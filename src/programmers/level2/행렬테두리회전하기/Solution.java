package programmers.level2.행렬테두리회전하기;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertArrayEquals(solution(6, 6,
                new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}),
            new int[]{8, 10, 25});
        assertArrayEquals(
            solution(3, 3,
                new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}}),
            new int[]{1, 1, 5, 3});
        assertArrayEquals(solution(100, 97,
                new int[][]{{1, 1, 100, 97}}),
            new int[]{1});
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (i * columns + (j + 1));
            }
        }
//        printMatrix(arr, rows, columns);
        int x1, x2, y1, y2;
        x1 = x2 = y1 = y2 = 0;
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            List<Integer> list = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            x1 = queries[i][0] - 1; y1 = queries[i][1] - 1;
            x2 = queries[i][2] - 1; y2 = queries[i][3] - 1;
//            System.out.printf("p1(%d), p2(%d), p3(%d), p4(%d)\n", arr[x1][y1], arr[x1][y2], arr[x2][y1], arr[x2][y2]);
            for (int j = y1; j <= y2; j++) {
                list.add(arr[x1][j]);
                min = Math.min(min, arr[x1][j]);
//                System.out.print(arr[x1][j] + " ");
            }
            for (int j = x1 + 1; j <= x2; j++) {
                list.add(arr[j][y2]);
                min = Math.min(min, arr[j][y2]);
//                System.out.print(arr[j][y2] + " ");
            }
            for (int j = y2 - 1; j >= y1; j--) {
                list.add(arr[x2][j]);
                min = Math.min(min, arr[x2][j]);
//                System.out.print(arr[x2][j] + " ");
            }
            for (int j = x2 - 1; j > x1; j--) {
                list.add(arr[j][y1]);
                min = Math.min(min, arr[j][y1]);
//                System.out.print(arr[j][y1] + " ");
            }
//            System.out.println();
            answer[i] = min;
            Integer lastVal = list.remove(list.size() - 1);
            list.add(0, lastVal);

            int changeIdx = 0;
            for (int j = y1; j <= y2; j++, changeIdx++) {
                arr[x1][j] = list.get(changeIdx);
            }
            for (int j = x1 + 1; j <= x2; j++, changeIdx++) {
                arr[j][y2] = list.get(changeIdx);
            }
            for (int j = y2 - 1; j >= y1; j--, changeIdx++) {
                arr[x2][j] = list.get(changeIdx);
            }
            for (int j = x2 - 1; j > x1; j--, changeIdx++) {
                arr[j][y1] = list.get(changeIdx);
            }
//            printMatrix(arr,rows,columns);
        }
        return answer;
    }

    private void printMatrix(int[][] arr, int rows, int columns) {
        System.out.println("----------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }
}