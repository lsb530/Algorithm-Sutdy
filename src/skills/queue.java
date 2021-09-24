package skills;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        System.out.println("큐 사이즈: " + q.size());
        System.out.println("헤더를 제거하고 헤더를 가져옴(poll): " + q.poll());
        System.out.println("큐 사이즈: " + q.size());
        System.out.println("헤더를 제거하지 않고 헤더를 가져옴(peek): " + q.peek());
        System.out.println("큐 사이즈: " + q.size());
    }
}