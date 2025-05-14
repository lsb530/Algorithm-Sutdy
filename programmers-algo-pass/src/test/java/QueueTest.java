import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    @DisplayName("큐 테스트")
    @Test
    void test() {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        int first = queue.poll();
        System.out.println(first); // 1

        queue.add(4);
        queue.add(5);

        first = queue.poll();
        System.out.println(first); // 2
    }

    @DisplayName("덱 테스트")
    @Test
    void test2() {
        // Deque(Double Ended Queue)
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        int first = queue.pollFirst();
        System.out.println(first); // 1

        queue.addLast(4);
        queue.addLast(5);

        System.out.println(queue.pollFirst()); // 2
    }
}
