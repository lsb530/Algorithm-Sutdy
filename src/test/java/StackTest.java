import org.junit.jupiter.api.Test;

import java.util.Stack;

public class StackTest {
    @Test
    void test() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);

        System.out.println(stack.isEmpty()); // false

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 1

        System.out.println(stack.isEmpty()); // true
    }

    @Test
    void test2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(5);

        // 가장 최근에 push한 데이터를 꺼내지 않으면서 반환만 하는 peek()
        System.out.println(stack.peek()); // 5
        System.out.println(stack.pop()); // 5

        System.out.println(stack.size()); // 1

        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 6

        System.out.println(stack.size()); // 0

        System.out.println(stack.isEmpty()); // true
    }
}
