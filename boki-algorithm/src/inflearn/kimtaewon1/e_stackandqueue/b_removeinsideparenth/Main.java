package inflearn.kimtaewon1.e_stackandqueue.b_removeinsideparenth;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/05-02
 */
public class Main {

    private static String solution(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;
            }
            else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.next();
        System.out.println(solution(str));
    }

}
