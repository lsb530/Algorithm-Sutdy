package boj.steps.a18스택.스택;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        while(N-- >= 0) {
            String[] op = sc.nextLine().split(" ");
            String operation = op[0];
            switch (operation) {
                case "push":
                    st.push(Integer.parseInt(op[1]));
                    break;
                case "pop":
                    try {
//                        System.out.println(st.pop());
                        sb.append(st.pop()).append("\n");
                    } catch (EmptyStackException e) {
//                        System.out.println(-1);
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
//                    System.out.println(st.size());
                    sb.append(st.size()).append("\n");
                    break;
                case "empty":
                    if (st.isEmpty()) {
//                        System.out.println(1);
                        sb.append(1).append("\n");
                    } else {
//                        System.out.println(0);
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    try {
//                        System.out.println(st.peek());
                        sb.append(st.peek()).append("\n");
                    } catch (EmptyStackException e) {
//                        System.out.println(-1);
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}