import java.util.ArrayDeque;
import java.util.Arrays;

public class Sol17 {
    public static void main(String[] args) {
        String answer1 = solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(answer1);
        String answer2 = solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(answer2);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards와 goal을 deque로 변환
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        // goalDeque에 문자열이 남아 있으면 계속 반복
        while (!goalDeque.isEmpty()) {
            // cardsDeque1의 front와 일치하는 경우
            if (!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }
            // cardsDeque2의 front와 일치하는 경우
            else if (!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }
            else {
                // 일치하는 원소를 찾지 못했으므로 종료
                break;
            }
        }

        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
