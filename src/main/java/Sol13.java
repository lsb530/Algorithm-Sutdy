import java.util.Stack;

public class Sol13 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int answer = solution(board, moves);
        System.out.println(answer);
    }

    public static int solution(int[][] board, int[] moves) {
        // 각 열에 대한 스택을 생성
        Stack<Integer>[] lanes = new Stack[board.length];
        for (int i = 0; i < lanes.length; i++) {
            lanes[i] = new Stack<>();
        }

        // board를 역순으로 탐색하며, 각 열의 인형을 lanes에 추가
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    lanes[j].push(board[i][j]);
                }
            }
        }

        // 인형을 담을 bucket 생성
        Stack<Integer> bucket = new Stack<>();
        // 사라진 인형의 총 개수를 저장할 변수
        int answer = 0;

        // moves를 순회하며, 각 열에서 인형을 뽑아 bucket에 추가
        for (int move : moves) {
            if (!lanes[move - 1].isEmpty()) { // 해당 열에 인형이 있는 경우
                int doll = lanes[move - 1].pop();
                // 바구니에 인형이 있고, 가장 위에 있는 인형과 같은 경우
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2;
                }
                // 바구니에 인형이 없거나, 가장 위에 있는 인형과 다른 경우
                else {
                    bucket.push(doll);
                }
            }
        }

        return answer;
    }
}
