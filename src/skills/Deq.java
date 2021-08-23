package skills;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deq {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addFirst(10);
        deque.addLast(4);
        deque.addLast(6);
        deque.addLast(7);
        deque.add(1); // addLast와 동일
        System.out.println("맨 앞(요소 삭제X) : " + deque.getFirst());
        System.out.println("맨 뒤(요소 삭제X) : " + deque.getLast());
        System.out.print("결과 : ");
        for (Integer x : deque) { // 앞에서 접근
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("맨 앞(요소 삭제O) : " + deque.removeFirst());
        System.out.println("맨 뒤(요소 삭제O) : " + deque.removeLast());
        System.out.print("결과 : ");
        for (Integer x : deque) { // 앞에서 접근
            System.out.print(x + " ");
        }
        System.out.println('\n');
        Iterator<Integer> orderedIterator = deque.iterator();
        Iterator<Integer> reversedIterator = deque.descendingIterator();
        System.out.println("앞에서 접근");
        while (orderedIterator.hasNext()) {
            System.out.print(orderedIterator.next() + " ");
        }
        System.out.println();
        System.out.println("뒤에서 접근");
        while (reversedIterator.hasNext()) {
            System.out.print(reversedIterator.next() + " ");
        }
        System.out.println('\n');
        System.out.println("덱의 앞쪽부터 탐색해서 10을 제거하면서 삭제 여부를 반환");
        System.out.println(deque.removeFirstOccurrence(10));
        System.out.println("덱의 뒤쪽부터 탐색해서 3을 제거하면서 삭제 여부를 반환");
        System.out.println(deque.removeLastOccurrence(3));
        for (Integer x : deque) { // 앞에서 접근
            System.out.print(x + " ");
        }
        System.out.println();
    }
}