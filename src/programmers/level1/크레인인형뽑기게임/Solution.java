package programmers.level1.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[][] board = new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board, moves);
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int score = 0;
        for (int i = 0; i < moves.length; i++) {
            int pick = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int p = board[j][pick];
                if (p != 0) {
                    if (!basket.isEmpty() && basket.peek() == p) {
                        basket.pop();
                        score++;
                    } else {
                        basket.push(p);
                    }
                    board[j][pick] = 0;
                    break;
                }
            }
        }
        return score * 2;
    }
}