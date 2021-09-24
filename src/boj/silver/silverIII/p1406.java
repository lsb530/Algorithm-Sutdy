package boj.silver.silverIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            left.push(x.charAt(i));
        }
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] str = br.readLine().split(" ");
            char option = str[0].charAt(0);
            switch (option) {
                case 'L': //커서를 왼쪽으로 한칸 옮김
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D': //커서를 오른쪽으로 한칸 옮김
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P':
                    char data = str[1].charAt(0);
                    left.push(data);
                    break;
            }
        }
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        // 틀린 부분
//        while (!right.isEmpty()) {
//            System.out.print(right.pop());
//        }
        // 맞은 부분
        StringBuilder sb = new StringBuilder();
        while (!right.empty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }

}