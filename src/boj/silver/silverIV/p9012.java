package boj.silver.silverIV;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int count = Integer.parseInt(br.readLine());
        for (int j = 0; j < count; j++) {
            Stack<Character> st = new Stack<>();
            String[] arr = br.readLine().split("");
            int flag = 0;
            for (int i = 0; i < arr.length; i++) {
                st.push(arr[i].charAt(0));
            }
            while (!st.isEmpty()) {
                if (flag < 0) {
                    break;
                }
                if (st.pop() == ')') {
                    flag++;
                } else {
                    flag--;
                }
            }
            String ans = (flag == 0) ? "YES" : "NO";
            System.out.println(ans);
        }
    }

}