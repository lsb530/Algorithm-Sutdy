package boj.steps.a18스택.균형잡힌세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            Stack<Character> stack = new Stack<>(); // 소괄호 ()
            String s = br.readLine();
            int len = s.length();
            boolean flag = true;
            if (s.charAt(0) == '.') {
                System.out.println(sb);
                break;
            }
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    continue;
                }
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
//                        sb.append("no");
                        flag = false;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
//                        sb.append("no");
                        flag = false;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && flag) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
    }
}