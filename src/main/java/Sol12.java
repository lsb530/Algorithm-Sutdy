import java.util.Arrays;
import java.util.Stack;

public class Sol12 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
        System.out.println(Arrays.toString(solution(new int[]{1, 6, 9, 5, 3, 2, 7})));
    }

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n]; // 가격이 떨어지지 않은 기간을 저장할 배열

        // 스택을 사용해 이전 가격과 현재 가격 비교
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            System.out.printf("%d < %d : %s%n", prices[i], prices[stack.peek()], prices[i] < prices[stack.peek()]);
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                // 가격이 떨어졌으므로 이전 가격의 기간 계산
                int j = stack.pop(); // 2
                answer[j] = i - j; // answer[2] = 3-2=1
            }
            stack.push(i);
        }

        // 스택에 남아 있는 가격들은 가격이 떨어지지 않은 경우
        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }
        return answer;
    }
}
