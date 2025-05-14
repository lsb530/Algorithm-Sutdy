package inflearn.kimtaewon1.e_stackandqueue.a_validparenth;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/05-01
 */
public class Main {

    private static boolean isValidParenthesis(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else { // )인 경우
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.next();
        System.out.println(isValidParenthesis(str) ? "YES" : "NO");
    }

}
