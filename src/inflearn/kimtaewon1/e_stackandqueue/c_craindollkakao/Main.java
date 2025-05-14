package inflearn.kimtaewon1.e_stackandqueue.c_craindollkakao;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/05-03
 */
public class Main {

    private static int getDollCount(
        int n, int[][] board, int m, int[] moves
    ) {
        int answer = 0;
        ArrayDeque<Integer> tempStack = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int peekDoll = board[j][moves[i] - 1];
                if (peekDoll != 0) {
                    if (tempStack.isEmpty()) {
                        tempStack.push(peekDoll);
                    }
                    else {
                        if (tempStack.peek() == peekDoll) {
                            tempStack.pop();
                            answer++;
                        }
                        else {
                            tempStack.push(peekDoll);
                        }
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int moveCount = sc.nextInt();
        int[] moves = new int[moveCount];
        for (int i = 0; i < moveCount; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(getDollCount(n, board, moveCount, moves));
    }

}
