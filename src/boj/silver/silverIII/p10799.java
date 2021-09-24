package boj.silver.silverIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        Stack<Integer> t = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                t.push(i);
            } else {
                if (i - t.peek() == 1) {
                    t.pop();
                    ans += t.size();
                } else {
                    t.pop();
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }

}