package inflearn.kimtaewon1.e_stackandqueue.e_metalrod;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/05-05
 */
public class Main {

    enum Parenthesis {
        LEFT('('), RIGHT(')');

        private final char value;

        Parenthesis(char value) {
            this.value = value;
        }
    }

    private static int dividedCount(String metalRod) {
        int answer = 0;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < metalRod.length(); i++) {
            if (metalRod.charAt(i) == Parenthesis.LEFT.value) { // (
                stack.push(Parenthesis.LEFT.value);
            }
            else {
                stack.pop();
                if (metalRod.charAt(i-1) == Parenthesis.LEFT.value) {
                    answer += stack.size();
                }
                else answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // ( -> push
        // ) -> 이전에 넣은 값이 (라면 레이저, 그렇지 않으면 막대
        // 레이저인 경우, top의 ( pop 하고 answer에 남은 size 누적
        // 레이저가 아닌 경우[닫는괄호를 만났지만, top이 (가 아닌경우]는 top을 pop하고 answer+=1
        Scanner scanner = new Scanner(System.in);
        System.out.println(dividedCount(scanner.nextLine()));
    }
}
