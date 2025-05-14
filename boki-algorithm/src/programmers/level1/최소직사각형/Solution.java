package programmers.level1.최소직사각형;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals(4000, solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        assertEquals(120, solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        assertEquals(133, solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }

    public int solution(int[][] sizes) {
        int v = 0, h = 0;
        for (int[] size : sizes) {
            v = Math.max(Math.max(size[0], size[1]), v);
            h = Math.max(Math.min(size[0], size[1]), h);
            System.out.printf("v = %d, h = %d\n", v, h);
        }
        return v * h;
    }
}