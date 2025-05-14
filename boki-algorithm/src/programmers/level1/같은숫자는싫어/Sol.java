package programmers.level1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Sol {

    public int[] solution(int[] arr) {
        int t = -1;
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (t != x) list.add(x);
            t = x;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // Stack 사용
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int top = stack.peek();
            if(top == arr[i]) continue;
            stack.add(arr[i]);
        }
        answer = stack.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4, 4, 4, 3, 3})));
    }
}
