package boj.steps.a18스택.스택수열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        int M = N;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            arr[i++] = x;
        }
        i = 0;
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= M; j++) {
            if(j != arr[i]) {
                if(!st.isEmpty() && st.peek() == arr[i]) {
                    st.pop();
                    sb.append("-\n");
//                    bw.write("-\n");
                    j--; i++;
                }
                else {
                    st.push(j);
//                    bw.write("+\n");
                    sb.append("+\n");
                }
            }
            else if(j == arr[i]) {
                if(st.isEmpty()) {
                    st.push(j);
//                    bw.write("+\n");
                    sb.append("+\n");
                    st.pop();
//                    bw.write("-\n");
                    sb.append("-\n");
                }
                else if(st.peek() != j && !st.isEmpty()) {
                    // push & pop
                    st.push(j);
//                    bw.write("+\n");
                    sb.append("+\n");
                    st.pop();
//                    bw.write("-\n");
                    sb.append("-\n");
                }
                else {
                    // pop
                    st.pop();
//                    bw.write("-\n");
                    sb.append("-\n");
                }
                i++;
            }
        }
//        while(!st.isEmpty()) {
//            System.out.println(st.pop());
//        }
        boolean flag = true;
        for (int j = i; j < arr.length; j++) {
            if(st.peek() != arr[j]) {
                flag = false;
                break;
//                System.out.println("NO");
            }
            else {
                st.pop();
//                bw.write("-\n");
                sb.append("-\n");
            }
        }
        if(flag) {
            System.out.println(sb);
//            bw.flush();
        } else {
            System.out.println("NO");
        }
//        bw.flush();
//        bw.close();
    }
}