import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


public class PrioryQueueTest {

    @DisplayName("기본 우선순위 큐(오름차순)")
    @Test
    void test() {
        // 빈 PrioryQueue 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 값을 우선순위 큐에 삽입 (add 사용)
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        // 현재 우선순위 큐의 상태 출력
        System.out.println(pq); // [1, 5, 20, 10]

        // 우선순위에서 가장 작은 요소 확인 및 제거 (poll 사용)
        System.out.println(pq.poll()); // 1
        System.out.println(pq); // [5, 10, 20]
        System.out.println(pq.poll()); // 5
        System.out.println(pq); // [10, 20]
    }

    @DisplayName("데이터 자체에 우선순위를 직접 정하고 싶은 경우")
    @Test
    void test2() {
        // 빈 PrioryQueue 생성
        // add한 두번째 문자를 기준으로 오름차순 정렬
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.charAt(1)));

        // 값을 우선순위 큐에 삽입 (add 사용)
        pq.add("Prince");
        pq.add("Apple");
        pq.add("Bread");
        pq.add("Sad");

//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i);
//        }

        // 현재 우선순위 큐의 상태 출력 [a, p, r, r]
        System.out.println(pq); // [Sad, Apple, Bread, Prince]

        // 우선순위에서 가장 작은 요소 확인 및 제거 (poll 사용)
        System.out.println(pq.poll()); // Sad
        System.out.println(pq); // [Apple, Bread, Prince]
        System.out.println(pq.poll()); // Apple
        System.out.println(pq); // [Bread, Prince]
    }

    @DisplayName("값이 클수록 우선순위가 높은 우선순위 큐")
    @Test
    void test3() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 10
        System.out.println(pq.poll()); // 5
        System.out.println(pq.poll()); // 1
    }

    @DisplayName("한번에 우선순위 큐에 넣는 경우")
    @Test
    void test4() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // O(logN)
        list.add(5);
        list.add(20);
        list.add(1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        System.out.println(pq.poll()); // 1 O(logN)
        System.out.println(pq.poll()); // 5

        System.out.println(pq); // [10, 20]

        // 컬렉션의 모든 데이터를 우선순위 큐에 추가
        pq.addAll(list); // O(NlogN)

        // 우선순위 큐는 꺼내면서 정렬하므로 pq를 보면 정렬된 상태가 아님
        System.out.println(pq); // [1, 10, 5, 20, 20, 10]
    }
}
