package boj.steps.a18스택.제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        while(N-- > 0) {
            int x = sc.nextInt();
            if(x != 0) stack.push(x);
            else stack.pop();
        }
        int total = 0;
        while(!stack.isEmpty()) {
            total += stack.pop();
        }
        System.out.println(total);
    }
}