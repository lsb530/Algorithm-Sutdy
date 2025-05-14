package boj.steps.a22우선순위큐.가운데를말해요;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    /*
    https://velog.io/@dhk22/%EB%B0%B1%EC%A4%80-BOJ-%EA%B0%80%EC%9A%B4%EB%8D%B0%EB%A5%BC-%EB%A7%90%ED%95%B4%EC%9A%94-1655-Java
     */

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> (a - b));
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(maxHeap.size() == minHeap.size()) maxHeap.add(x);
            else minHeap.add(x);
            // 최대힙의 루트노드 > 최소힙의 루트노드
            if (maxHeap.size() > 0 && minHeap.size() > 0 && maxHeap.peek() > minHeap.peek()) {
                Integer tmp = maxHeap.poll();
                maxHeap.add(minHeap.poll());
                minHeap.add(tmp);
            }
            bw.write(maxHeap.peek() + "\n");
        }
        bw.flush();
        bw.close();
    }

}