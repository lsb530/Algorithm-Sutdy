package boj.steps.a19큐와덱.큐2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();
        while(N-- > 0) {
            String[] ops = br.readLine().split(" ");
            switch (ops[0]) {
                case "push":
                    queue.offer(Integer.parseInt(ops[1]));
                    break;
                case "pop":
                    Integer pv = queue.poll();
                    if(pv == null) sb.append(-1);
                    else sb.append(pv);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(queue.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.peekFirst());
                    sb.append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.peekLast());
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}