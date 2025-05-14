package boj.steps.a19큐와덱.카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i >= 1; i--) {
            queue.push(i);
        }
        while(true) {
            if(queue.size() == 1) break;
            queue.pop();
            queue.addLast(queue.pop());
        }
        System.out.println(queue.peek());
    }
}