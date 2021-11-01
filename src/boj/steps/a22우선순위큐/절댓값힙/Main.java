package boj.steps.a22우선순위큐.절댓값힙;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 우선순위: 절대값이 작은 순 -> 숫자가 작은 순
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) :
                    Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val == 0) {
                if(minHeap.isEmpty()) bw.write(0 + "\n");
                else bw.write(minHeap.poll() + "\n");
            }
            else minHeap.offer(val);
        }
        bw.flush();
        bw.close();
    }

}