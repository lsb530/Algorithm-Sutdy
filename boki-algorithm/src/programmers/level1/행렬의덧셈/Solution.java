package programmers.level1.행렬의덧셈;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(
            solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}),
            new int[][]{{4, 6}, {7, 9}});
        Assertions.assertArrayEquals(
            solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})
            , new int[][]{{4}, {6}});
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}