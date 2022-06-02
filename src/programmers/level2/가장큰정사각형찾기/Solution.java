package programmers.level2.가장큰정사각형찾기;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals(solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}),
            9);
//        Very Good
//        assertEquals(solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}}), 4);
    }

    public int solution(int [][]board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        return 1234;
    }
}