package programmers.level1.같은숫자는싫어;

import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(new int[]{1, 1, 3, 3, 0, 1, 1}),
            new int[]{1, 3, 0, 1});
        Assertions.assertArrayEquals(solution(new int[]{4, 4, 4, 3, 3}), new int[]{4, 3});
    }

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int top = stack.peek();
            if(top == arr[i]) continue;
            stack.add(arr[i]);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}