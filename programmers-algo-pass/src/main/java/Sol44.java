import java.util.Arrays;

public class Sol44 {

    public static void main(String[] args) {
        int[][] board1 = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(Arrays.deepToString(solution(board1)));

        int[][] board2 = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.deepToString(solution(board2)));
    }

    private static class Block {
        int i, j;

        public Block(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    private static int[][] Board;

    // 해당 행에 num이 있는지 확인
    private static boolean inRow(int num, int row) {
        return Arrays.stream(Board[row]).anyMatch((it -> it == num));
    }

    // 해당 열에 num이 있는지 확인
    private static boolean inCol(int num, int col) {
        for (int i = 0; i < 9; i++) {
            if (Board[i][col] == num) return true;
        }
        return false;
    }

    // 현재 위치의 3 x 3 박스에 num이 있는지 확인
    private static boolean inBox(int num, int row, int col) {
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (Board[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    // 현재 위치에 num이 들어갈 수 있는지 검사
    private static boolean isValid(int num, int row, int col) {
        return !(inRow(num, row) || inCol(num, col) || inBox(num, row, col));
    }

    // 스도쿠 보드에서 비어 있는 위치 반환
    private static Block findEmptyPosition() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Board[i][j] == 0)
                    return new Block(i, j);
            }
        }
        return null;
    }

    // 비어있는 위치에 가능한 숫자를 넣어가며 스도쿠 해결
    private static boolean findSolution() {
        Block emptyPos = findEmptyPosition();
        if (emptyPos == null) { // 빈칸이 없으면 스도쿠가 해결된 것으로 간주
            return true;
        }

        int row = emptyPos.i;
        int col = emptyPos.j;
        for (int num = 1; num <= 9; num++) {
            if (isValid(num, row, col)) {
                Board[row][col] = num;
                // 다음 빈칸을 재귀 탐색
                if (findSolution()) {
                    return true;
                }
                // 가능한 숫자가 없으면 원래의 0으로 되돌림
                Board[row][col] = 0;
            }
        }
        return false;
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[][] solution(int[][] board) {
        Board = board;
        findSolution();
        return board;
    }

}
